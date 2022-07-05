package com.sn.sabaideatest.data.api

import kotlinx.serialization.Serializable

object HttpRoutes {
	private const val BASE_URL = "https://www.filimo.com"
	const val SEARCH_MOVIE_ENDPOINT = "$BASE_URL${"/api/en/v1/movie/movie/list/tagid/1000300/text/{Query}/sug/on"}"
}

@Serializable
data class ResponseModel<T>(
	val data: T,
)