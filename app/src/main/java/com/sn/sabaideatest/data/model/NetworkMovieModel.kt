package com.sn.sabaideatest.data.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class  NetworkMovieModel(
    @SerialName("attributes")
    val attributes: Attributes,
    @SerialName("id")
    val id: Int,
    @SerialName("type")
    val type: String
) {
    @Serializable
    data class Attributes(
        @SerialName("age_range")
        val ageRange: String,
        @SerialName("audio")
        val audio: Audio,
        @SerialName("avg_rate_label")
        val avgRateLabel: String,
        @SerialName("badge")
        val badge: Badge,
        @SerialName("categories")
        val categories: List<Category>,
        @SerialName("commingsoon_txt")
        val commingsoonTxt: String,
        @SerialName("countries")
        val countries: List<Country>,
        @SerialName("cover")
        val cover: String,
        @SerialName("descr")
        val descr: String,
        @SerialName("director")
        val director: String,
        @SerialName("dubbed")
        val dubbed: Dubbed,
        @SerialName("duration")
        val duration: Duration,
        @SerialName("freemium")
        val freemium: Boolean,
        @SerialName("HD")
        val hD: Boolean,
        @SerialName("imdb_rate")
        val imdbRate: String,
        @SerialName("language_info")
        val languageInfo: LanguageInfo,
        @SerialName("last_watch")
        val lastWatch: List<String>,
        @SerialName("link_key")
        val linkKey: String,
        @SerialName("link_type")
        val linkType: String,
        @SerialName("movie_id")
        val movieId: String,
        @SerialName("movie_title")
        val movieTitle: String,
        @SerialName("movie_title_en")
        val movieTitleEn: String,
        @SerialName("output_type")
        val outputType: String,
        @SerialName("pic")
        val pic: Pic,
        @SerialName("position")
        val position: Int,
        @SerialName("pro_year")
        val proYear: String,
        @SerialName("publish_date")
        val publishDate: String,
        @SerialName("rate_avrage")
        val rateAvrage: String,
        @SerialName("rate_enable")
        val rateEnable: Boolean,
        @SerialName("rel_data")
        val relData: RelData,
        @SerialName("serial")
        val serial: Serial,
        @SerialName("sid")
        val sid: Int,
        @SerialName("subtitle")
        val subtitle: Subtitle,
        @SerialName("tag_id")
        val tagId: String,
        @SerialName("theme")
        val theme: String,
        @SerialName("uid")
        val uid: String,
        @SerialName("uuid")
        val uuid: String,
        @SerialName("watch_list_action")
        val watchListAction: String,
        @SerialName("watermark")
        val watermark: Boolean
    ) {
        @Serializable
        data class Audio(
            @SerialName("isMultiLanguage")
            val isMultiLanguage: Boolean,
            @SerialName("languages")
            val languages: List<String>
        )

        @Serializable
        data class Badge(
            @SerialName("backstage")
            val backstage: Boolean,
            @SerialName("commingsoon")
            val commingsoon: Boolean,
            @SerialName("exclusive")
            val exclusive: Boolean,
            @SerialName("free")
            val free: Boolean,
            @SerialName("hear")
            val hear: Boolean,
            @SerialName("info")
            val info: List<String>,
            @SerialName("online_release")
            val onlineRelease: Boolean,
            @SerialName("vision")
            val vision: Boolean
        )

        @Serializable
        data class Category(
            @SerialName("link_key")
            val linkKey: String,
            @SerialName("link_type")
            val linkType: String,
            @SerialName("title")
            val title: String,
            @SerialName("title_en")
            val titleEn: String
        )

        @Serializable
        data class Country(
            @SerialName("country")
            val country: String,
            @SerialName("country_en")
            val countryEn: String
        )

        @Serializable
        data class Dubbed(
            @SerialName("enable")
            val enable: Boolean,
            @SerialName("text")
            val text: String
        )

        @Serializable
        data class Duration(
            @SerialName("text")
            val text: String,
            @SerialName("value")
            val value: Int
        )

        @Serializable
        data class LanguageInfo(
            @SerialName("flag")
            val flag: String,
            @SerialName("text")
            val text: String
        )

        @Serializable
        data class Pic(
            @SerialName("movie_img_b")
            val movieImgB: String,
            @SerialName("movie_img_m")
            val movieImgM: String,
            @SerialName("movie_img_s")
            val movieImgS: String
        )

        @Serializable
        data class RelData(
            @SerialName("rel_id")
            val relId: String,
            @SerialName("rel_title")
            val relTitle: String,
            @SerialName("rel_type")
            val relType: String,
            @SerialName("rel_type_txt")
            val relTypeTxt: String,
            @SerialName("rel_uid")
            val relUid: String
        )

        @Serializable
        data class Serial(
            @SerialName("enable")
            val enable: Boolean,
            @SerialName("last_part")
            val lastPart: String,
            @SerialName("parent_title")
            val parentTitle: String,
            @SerialName("part_text")
            val partText: String,
            @SerialName("season_id")
            val seasonId: Int,
            @SerialName("season_text")
            val seasonText: String,
            @SerialName("serial_part")
            val serialPart: String
        )

        @Serializable
        data class Subtitle(
            @SerialName("enable")
            val enable: Boolean,
            @SerialName("text")
            val text: String
        )
    }
}