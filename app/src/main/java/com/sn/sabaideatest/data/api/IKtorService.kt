package com.sn.sabaideatest.data.api

import com.sn.sabaideatest.data.model.NetworkMovieModel

interface IKtorService {

	suspend fun searchMovie(query: String): ResponseModel<List<NetworkMovieModel>>
}