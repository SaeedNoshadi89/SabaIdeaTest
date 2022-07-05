package com.sn.sabaideatest.data.api

import com.sn.sabaideatest.data.di.KtorModule
import com.sn.sabaideatest.data.model.NetworkMovieModel
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import kotlinx.serialization.ExperimentalSerializationApi
import javax.inject.Inject

@ExperimentalSerializationApi
class KtorServicesImpl @Inject constructor(): IKtorServices {
	override suspend fun searchMovie(query: String): ResponseModel<List<NetworkMovieModel>> =
		KtorModule.provideKtor.use {
			it.get {
				url(HttpRoutes.SEARCH_MOVIE_ENDPOINT.replace("{Query}", query))
			}
		}.body()
}