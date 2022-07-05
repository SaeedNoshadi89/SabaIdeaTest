package com.sn.sabaideatest.domain.repository

import com.sn.sabaideatest.domain.model.MovieModel
import kotlinx.coroutines.flow.Flow

interface ISearchMoviesRepository {

	fun searchMovies(query: String): Flow<List<MovieModel>>
}