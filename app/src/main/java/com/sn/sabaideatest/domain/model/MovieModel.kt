package com.sn.sabaideatest.domain.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

data class  MovieModel(
    val attributes: Attributes?,
    val id: Int?,
    val type: String?
) {
    data class Attributes(
        val ageRange: String?,
        val avgRateLabel: String?,
        val categories: List<Category>?,
        val commingsoonTxt: String?,
        val countries: List<Country>?,
        val cover: String?,
        val descr: String?,
        val director: String?,
        val freemium: Boolean?,
        val hD: Boolean?,
        val imdbRate: String?,
        val movieId: String?,
        val movieTitle: String?,
        val movieTitleEn: String?,
        val outputType: String?,
        val pic: Pic?,
        val position: Int?,
        val proYear: String?,
        val publishDate: String?,
        val rateAvrage: String?,
        val rateEnable: Boolean?,
        val sid: Int?,
        val subtitle: Subtitle?,
        val tagId: String?,
        val theme: String?,
        val uid: String?,
        val uuid: String?,
        val watchListAction: String?,
        val watermark: Boolean?
    ) {
        data class Audio(
            val isMultiLanguage: Boolean?,
            val languages: List<String>?
        )

        data class Category(
            val linkKey: String?,
            val linkType: String?,
            val title: String?,
            val titleEn: String?
        )

        data class Country(
            val country: String?,
            val countryEn: String?
        )

        data class Dubbed(
            val enable: Boolean?,
            val text: String?
        )

        data class Duration(
            val text: String?,
            val value: Int?
        )

        data class LanguageInfo(
            val flag: String?,
            val text: String?
        )

        data class Pic(
            val movieImgB: String?,
            val movieImgM: String?,
            val movieImgS: String?
        )

        data class RelData(
            val relId: String?,
            val relTitle: String?,
            val relType: String?,
            val relTypeTxt: String?,
            val relUid: String?
        )

        data class Serial(
            val enable: Boolean?,
            val lastPart: String?,
            val parentTitle: String?,
            val partText: String?,
            val seasonId: Int?,
            val seasonText: String?,
            val serialPart: String?
        )

        data class Subtitle(
            val enable: Boolean?,
            val text: String?
        )
    }
}