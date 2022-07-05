package com.sn.sabaideatest.data.model

import com.sn.sabaideatest.domain.model.MovieModel

fun NetworkMovieModel.toDomain(): MovieModel =
	MovieModel(
		id = id,
		type = type,
		attributes = attributes?.toDomain()
	)

fun NetworkMovieModel.NetworkAttributes.toDomain(): MovieModel.Attributes =
	MovieModel.Attributes(
		ageRange = ageRange,
		avgRateLabel = avgRateLabel,

		categories = categories?.map {
			it.toDomain()
		},
		commingsoonTxt = commingsoonTxt,
		countries = countries?.map { it.toDomain() },
		cover = cover,
		descr = descr,
		director = director,
		freemium = freemium,
		hD = hD,
		imdbRate = imdbRate,
		movieId = movieId,
		movieTitle = movieTitle,
		movieTitleEn = movieTitleEn,
		outputType = outputType,
		pic = pic?.toDomain(),
		position = position,
		proYear = proYear,
		publishDate = publishDate,
		rateAvrage = rateAvrage,
		rateEnable = rateEnable,
		subtitle = subtitle?.toDomain(),
		tagId = tagId,
		theme = theme,
		uid = uid,
		sid = sid,
		uuid = uuid,
		watchListAction = watchListAction,
		watermark = watermark
	)

fun NetworkMovieModel.NetworkAttributes.NetworkCategory.toDomain(): MovieModel.Attributes.Category =
	MovieModel.Attributes.Category(
		linkKey = linkKey,
		linkType = linkType,
		title = title,
		titleEn = titleEn
	)

fun NetworkMovieModel.NetworkAttributes.NetworkCountry.toDomain(): MovieModel.Attributes.Country =
	MovieModel.Attributes.Country(country = country, countryEn = countryEn)

fun NetworkMovieModel.NetworkAttributes.NetworkPic.toDomain(): MovieModel.Attributes.Pic =
	MovieModel.Attributes.Pic(movieImgB = movieImgB, movieImgM = movieImgM, movieImgS = movieImgS)

fun NetworkMovieModel.NetworkAttributes.NetworkSubtitle.toDomain(): MovieModel.Attributes.Subtitle =
	MovieModel.Attributes.Subtitle(enable = enable, text = text)

