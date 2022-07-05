package com.sn.sabaideatest.presentation.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sn.sabaideatest.data.util.Result
import com.sn.sabaideatest.data.util.asResult
import com.sn.sabaideatest.domain.model.MovieModel
import com.sn.sabaideatest.domain.repository.ISearchMoviesRepository
import com.sn.sabaideatest.domain.usecase.SearchMovieUseCase
import com.sn.sabaideatest.presentation.ui.component.MoviesScreenUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

data class ViewModelState(
	val moviesList: List<MovieModel> = emptyList(),
	val idle: Boolean = false,
	val isLoading: Boolean = false,
	val searchInput: String = "",
	val error: Throwable? = null,
) {
	fun toUiState(): MoviesScreenUiState = MoviesScreenUiState.Success(
		moviesList = moviesList,
		idle = idle,
		isLoading = isLoading,
		searchInput = searchInput,
		error = error
	)
}

@HiltViewModel
class MoviesViewModel @Inject constructor(private val useCase: SearchMovieUseCase) : ViewModel() {

	private var searchJob: Job? = null
	private val viewModelState = MutableStateFlow(ViewModelState())
	val uiState = viewModelState.map { it.toUiState() }.stateIn(scope = viewModelScope,
		started = SharingStarted.WhileSubscribed(5_000),
		initialValue = viewModelState.value.toUiState())

	fun getMovies(query: String) {
		if (query.isEmpty()) {
			viewModelState.update { it.copy(isLoading = false, idle = true) }
			return
		}
		viewModelState.update { it.copy(isLoading = true, idle = false, searchInput = query) }
		searchJob?.cancel()
		searchJob = viewModelScope.launch {
			delay(500L)
			useCase.invoke(viewModelState.value.searchInput).asResult().collect { result ->
				when (result) {
					is Result.Loading -> viewModelState.update {
						it.copy(isLoading = true,
							idle = false)
					}
					is Result.Success -> viewModelState.update {
						it.copy(isLoading = false,
							moviesList = result.data,
							idle = false)
					}
					is Result.Error -> viewModelState.update {
						it.copy(isLoading = false,
							error = result.exception,
							idle = false)
					}
				}
			}
		}
	}

}