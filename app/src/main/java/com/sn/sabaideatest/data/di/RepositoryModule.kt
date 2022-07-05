package com.sn.sabaideatest.data.di

import com.sn.sabaideatest.data.api.IKtorServices
import com.sn.sabaideatest.data.api.KtorServicesImpl
import com.sn.sabaideatest.data.repository.SearchMoviesRepositoryImpl
import com.sn.sabaideatest.domain.repository.ISearchMoviesRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

	@Binds
	@Singleton
	abstract fun bindKtorServices(ktorServicesImpl: KtorServicesImpl): IKtorServices

	@Binds
	@Singleton
	abstract fun provideMoviesRepository(searchMoviesRepositoryImpl: SearchMoviesRepositoryImpl): ISearchMoviesRepository
}