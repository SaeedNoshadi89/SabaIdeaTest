package com.sn.sabaideatest.data.model


import com.sn.sabaideatest.domain.model.MovieModel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class NetworkMovieModel(
	@SerialName("attributes")
	val attributes: NetworkAttributes?,
	@SerialName("id")
	val id: Int?,
	@SerialName("type")
	val type: String?,
) {
	@Serializable
	data class NetworkAttributes(
		@SerialName("age_range")
		val ageRange: String?,
		@SerialName("avg_rate_label")
		val avgRateLabel: String?,
		@SerialName("categories")
		val categories: List<NetworkCategory>?,
		@SerialName("commingsoon_txt")
		val commingsoonTxt: String?,
		@SerialName("countries")
		val countries: List<NetworkCountry>?,
		@SerialName("cover")
		val cover: String?,
		@SerialName("descr")
		val descr: String?,
		@SerialName("director")
		val director: String?,
		@SerialName("freemium")
		val freemium: Boolean?,
		@SerialName("HD")
		val hD: Boolean?,
		@SerialName("imdb_rate")
		val imdbRate: String?,
		@SerialName("movie_id")
		val movieId: String?,
		@SerialName("movie_title")
		val movieTitle: String?,
		@SerialName("movie_title_en")
		val movieTitleEn: String?,
		@SerialName("output_type")
		val outputType: String?,
		@SerialName("pic")
		val pic: NetworkPic?,
		@SerialName("position")
		val position: Int?,
		@SerialName("pro_year")
		val proYear: String?,
		@SerialName("publish_date")
		val publishDate: String?,
		@SerialName("rate_avrage")
		val rateAvrage: String?,
		@SerialName("rate_enable")
		val rateEnable: Boolean?,
		@SerialName("sid")
		val sid: Int?,
		@SerialName("subtitle")
		val subtitle: NetworkSubtitle?,
		@SerialName("tag_id")
		val tagId: String?,
		@SerialName("theme")
		val theme: String?,
		@SerialName("uid")
		val uid: String?,
		@SerialName("uuid")
		val uuid: String?,
		@SerialName("watch_list_action")
		val watchListAction: String?,
		@SerialName("watermark")
		val watermark: Boolean?,
	) {
		@Serializable
		data class NetworkAudio(
			@SerialName("isMultiLanguage")
			val isMultiLanguage: Boolean?,
			@SerialName("languages")
			val languages: List<String>?,
		)


		@Serializable
		data class NetworkCategory(
			@SerialName("link_key")
			val linkKey: String?,
			@SerialName("link_type")
			val linkType: String?,
			@SerialName("title")
			val title: String?,
			@SerialName("title_en")
			val titleEn: String?,
		)

		@Serializable
		data class NetworkCountry(
			@SerialName("country")
			val country: String?,
			@SerialName("country_en")
			val countryEn: String?,
		)

		@Serializable
		data class NetworkDubbed(
			@SerialName("enable")
			val enable: Boolean?,
			@SerialName("text")
			val text: String?,
		)

		@Serializable
		data class NetworkDuration(
			@SerialName("text")
			val text: String?,
			@SerialName("value")
			val value: Int?,
		)

		@Serializable
		data class NetworkLanguageInfo(
			@SerialName("flag")
			val flag: String?,
			@SerialName("text")
			val text: String?,
		)

		@Serializable
		data class NetworkPic(
			@SerialName("movie_img_b")
			val movieImgB: String?,
			@SerialName("movie_img_m")
			val movieImgM: String?,
			@SerialName("movie_img_s")
			val movieImgS: String?,
		)

		@Serializable
		data class NetworkRelData(
			@SerialName("rel_id")
			val relId: String?,
			@SerialName("rel_title")
			val relTitle: String?,
			@SerialName("rel_type")
			val relType: String?,
			@SerialName("rel_type_txt")
			val relTypeTxt: String?,
			@SerialName("rel_uid")
			val relUid: String?,
		)

		@Serializable
		data class NetworkSerial(
			@SerialName("enable")
			val enable: Boolean?,
			@SerialName("last_part")
			val lastPart: String?,
			@SerialName("parent_title")
			val parentTitle: String?,
			@SerialName("part_text")
			val partText: String?,
			@SerialName("season_id")
			val seasonId: Int?,
			@SerialName("season_text")
			val seasonText: String?,
			@SerialName("serial_part")
			val serialPart: String?,
		)

		@Serializable
		data class NetworkSubtitle(
			@SerialName("enable")
			val enable: Boolean?,
			@SerialName("text")
			val text: String?,
		)
	}
}