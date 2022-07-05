package com.sn.sabaideatest.domain.usecase

import com.sn.sabaideatest.domain.model.MovieModel
import com.sn.sabaideatest.domain.repository.ISearchMoviesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import timber.log.Timber
import javax.inject.Inject

class SearchMovieUseCase @Inject constructor(private val repository: ISearchMoviesRepository) {
	operator fun invoke(query: String): Flow<List<MovieModel>> = flow {
		repository.searchMovies(query).collect {
			emit(it)
		}
	}.flowOn(Dispatchers.IO)
}