package com.sn.sabaideatest.presentation.ui.component

import com.sn.sabaideatest.domain.model.MovieModel

sealed interface MoviesScreenUiState{
	val idle: Boolean
	val isLoading: Boolean
	val searchInput: String
	val error: Throwable?

	data class Success(
		val moviesList: List<MovieModel> = emptyList(),
		override val idle: Boolean,
		override val isLoading: Boolean,
		override val searchInput: String,
		override val error: Throwable?
	): MoviesScreenUiState
}