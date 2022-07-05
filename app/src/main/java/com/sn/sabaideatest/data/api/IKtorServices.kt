package com.sn.sabaideatest.data.api

import com.sn.sabaideatest.data.model.NetworkMovieModel

interface IKtorServices {
	suspend fun searchMovie(query: String): ResponseModel<List<NetworkMovieModel>>
}