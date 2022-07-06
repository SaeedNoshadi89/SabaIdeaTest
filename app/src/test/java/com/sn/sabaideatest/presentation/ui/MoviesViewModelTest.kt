package com.sn.sabaideatest.presentation.ui

import com.sn.sabaideatest.data.repository.SearchMoviesRepositoryTest
import com.sn.sabaideatest.data.util.asResult
import com.sn.sabaideatest.domain.usecase.SearchMovieUseCase
import com.sn.sabaideatest.presentation.ui.component.MoviesScreenUiState
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.runTest
import org.junit.Assert.*

import org.junit.Before
import org.junit.Test

@ExperimentalCoroutinesApi
class MoviesViewModelTest {
	private lateinit var searchMovieUseCase: SearchMovieUseCase
	private lateinit var fakeRepository: SearchMoviesRepositoryTest
	private lateinit var viewModel: MoviesViewModel
	private lateinit var uiState: MoviesScreenUiState
	private lateinit var viewModelState: ViewModelState

	@Before
	fun setUp() {
		viewModelState = ViewModelState()
		uiState = viewModelState.toUiState()
		fakeRepository = SearchMoviesRepositoryTest()
		searchMovieUseCase = SearchMovieUseCase(fakeRepository)
		viewModel = MoviesViewModel(searchMovieUseCase)
	}

	@Test fun stateIsInitiallyIdle() = runTest {
		assertEquals(uiState.idle, viewModel.uiState.value.idle)
	}

	@Test fun stateIsLoadingWhenSearchingLoading() = runTest {
		val collectJob =
			launch(UnconfinedTestDispatcher()) { searchMovieUseCase.invoke("kill").asResult().collect()}
		fakeRepository.searchMovies("kill")
		collectJob.cancel()
	}

}