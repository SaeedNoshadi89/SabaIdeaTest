package com.sn.sabaideatest.data.api

import android.text.TextUtils.replace
import com.sn.sabaideatest.data.api.IKtorService
import com.sn.sabaideatest.data.model.NetworkMovieModel
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import javax.inject.Inject

class KtorServiceImpl @Inject constructor(private val client: HttpClient): IKtorService {
	override suspend fun searchMovie(query: String): ResponseModel<List<NetworkMovieModel>> =
		client.use {
			it.get {
				url(HttpRoutes.SEARCH_MOVIE_ENDPOINT.replace("{Query}", query))
			}
		}.body()
}