package com.sn.sabaideatest.data.repository

import com.sn.sabaideatest.data.api.IKtorServices
import com.sn.sabaideatest.data.model.toDomain
import com.sn.sabaideatest.domain.model.MovieModel
import com.sn.sabaideatest.domain.repository.ISearchMoviesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import timber.log.Timber
import javax.inject.Inject

class SearchMoviesRepositoryImpl @Inject constructor(private val api: IKtorServices) : ISearchMoviesRepository {
	override fun searchMovies(query: String): Flow<List<MovieModel>> = flow {
		runCatching {
			api.searchMovie(query = query)
		}.onSuccess { response ->
			emit(response.data.map { it.toDomain() })
		}.onFailure {
			Timber.e(it.message)
		}
	}
}