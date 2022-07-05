package com.sn.sabaideatest.data.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.*
import io.ktor.client.engine.android.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.cache.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.logging.*
import io.ktor.client.plugins.observer.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import timber.log.Timber

@ExperimentalSerializationApi
class KtorModule {
	companion object {
		private const val TIME_OUT = 60_000

		val provideKtor
			get() = HttpClient(Android) {
				install(HttpCache)
				defaultRequest {
					contentType(ContentType.Application.Json)
					accept(ContentType.Application.Json)
				}

				install(ContentNegotiation) {
					json(json = Json {
						prettyPrint = true
						ignoreUnknownKeys = true
						isLenient = true
						encodeDefaults = false
						explicitNulls = false

					})
				}

				install(HttpTimeout) {
					connectTimeoutMillis = TIME_OUT.toLong()
					socketTimeoutMillis = TIME_OUT.toLong()
					requestTimeoutMillis = TIME_OUT.toLong()
				}

				install(ResponseObserver) {
					onResponse { response ->
						Timber.d("HttpClientLogger - HTTP status ${response.status.value}")
						Timber.d("HttpClientLogger - Response: $response")
					}
				}

				install(Logging) {
					logger = object : Logger {
						override fun log(message: String) {
							Timber.v("Logger Ktor =>  $message")
						}

					}
					level = LogLevel.ALL
				}
			}
	}
}