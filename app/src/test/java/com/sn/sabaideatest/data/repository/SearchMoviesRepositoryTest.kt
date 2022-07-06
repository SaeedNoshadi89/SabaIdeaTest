package com.sn.sabaideatest.data.repository

import android.provider.ContactsContract
import com.sn.sabaideatest.domain.model.MovieModel
import com.sn.sabaideatest.domain.repository.ISearchMoviesRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.junit.Assert.*

class SearchMoviesRepositoryTest: ISearchMoviesRepository{
	var searchedMovies = mutableListOf<MovieModel>()
	override fun searchMovies(query: String): Flow<List<MovieModel>> = flow {
		emit(searchedMovies)
	}
}