package com.sn.sabaideatest.domain.usecase

import app.cash.turbine.test
import com.sn.sabaideatest.data.repository.SearchMoviesRepositoryTest
import com.sn.sabaideatest.domain.model.MovieModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

@ExperimentalCoroutinesApi
class SearchMovieUseCaseTest {

	private lateinit var searchMovieUseCase: SearchMovieUseCase
	private lateinit var fakeRepository: SearchMoviesRepositoryTest
	private lateinit var fakeListData: List<MovieModel>

	@Before
	fun setup() {
		fakeRepository = SearchMoviesRepositoryTest()
		searchMovieUseCase = SearchMovieUseCase(fakeRepository)
		fakeListData = fakeData
		fakeRepository.searchedMovies = fakeListData.toMutableList()
	}

	@Test
	fun searchedListReturnedTheCorrectValues() = runTest {
		searchMovieUseCase.invoke("kill").test {
			assertEquals(fakeData, awaitItem())
			awaitComplete()
		}
	}
	@Test
	fun countOfSearchedListIsTrue() = runTest {
		searchMovieUseCase.invoke("kill").test {
			assertEquals(2, awaitItem().size)
			awaitComplete()
		}
	}

	private val fakeData = listOf(MovieModel(
		type = "suggestion",
		id = 24289,
		attributes = MovieModel.Attributes(
			ageRange = "ageRange1",
			avgRateLabel = "avgRateLabel1",
			categories = listOf(MovieModel.Attributes.Category(
				linkKey = "linkKey1",
				linkType = "linkType1",
				title = "title1",
				titleEn = "titleEn1"
			)),
			commingsoonTxt = "commingsoonTxt1",
			countries = listOf(MovieModel.Attributes.Country(country = "country1",
				countryEn = "countryEn1")),
			cover = "cover1",
			descr = "descr1",
			director = "director1",
			freemium = false,
			hD = false,
			imdbRate = "imdbRate1",
			movieId = "movieId1",
			movieTitle = "movieTitle1",
			movieTitleEn = "movieTitleEn1",
			outputType = "outputType1",
			pic = MovieModel.Attributes.Pic(movieImgB = "movieImgB1",
				movieImgM = "movieImgM1",
				movieImgS = "movieImgS1"),
			position = 108,
			proYear = "proYear1",
			publishDate = "publishDate1",
			rateAvrage = "rateAvrage1",
			rateEnable = false,
			subtitle = MovieModel.Attributes.Subtitle(enable = false, text = "text1"),
			tagId = "tagId1",
			theme = "theme1",
			uid = "uid1",
			sid = 208,
			uuid = "uuid1",
			watchListAction = "watchListAction1",
			watermark = true
		)
	), MovieModel(
		type = "suggestion",
		id = 24227,
		attributes = MovieModel.Attributes(
			ageRange = "ageRange",
			avgRateLabel = "avgRateLabel",
			categories = listOf(MovieModel.Attributes.Category(
				linkKey = "linkKey",
				linkType = "linkType",
				title = "title",
				titleEn = "titleEn"
			)),
			commingsoonTxt = "commingsoonTxt",
			countries = listOf(MovieModel.Attributes.Country(country = "country",
				countryEn = "countryEn")),
			cover = "cover",
			descr = "descr",
			director = "director",
			freemium = true,
			hD = true,
			imdbRate = "imdbRate",
			movieId = "movieId",
			movieTitle = "movieTitle",
			movieTitleEn = "movieTitleEn",
			outputType = "outputType",
			pic = MovieModel.Attributes.Pic(movieImgB = "movieImgB",
				movieImgM = "movieImgM",
				movieImgS = "movieImgS"),
			position = 10,
			proYear = "proYear",
			publishDate = "publishDate",
			rateAvrage = "rateAvrage",
			rateEnable = true,
			subtitle = MovieModel.Attributes.Subtitle(enable = true, text = "text"),
			tagId = "tagId",
			theme = "theme",
			uid = "uid",
			sid = 20,
			uuid = "uuid",
			watchListAction = "watchListAction",
			watermark = false
		)))
}
