package com.sn.sabaideatest.presentation.ui.component.item

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.R
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.semantics.onClick
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.sn.sabaideatest.domain.model.MovieModel


@ExperimentalMaterial3Api
@Composable
fun MovieItem(
	item: MovieModel?,
	modifier: Modifier = Modifier,
) {
	val clickActionLabel = "movie item"

	Card(
		modifier = modifier.semantics {
			onClick(label = clickActionLabel, action = null)
		},
		colors = CardDefaults.cardColors(
			containerColor = MaterialTheme.colorScheme.surfaceVariant,
		),
		shape = MaterialTheme.shapes.large,
		elevation = CardDefaults.cardElevation(defaultElevation = 16.dp),
	) {
		AsyncImage(
			model = item?.attributes?.pic?.movieImgM,
			contentDescription = null,
			contentScale = ContentScale.Crop,
			modifier = Modifier
				.clip(MaterialTheme.shapes.large)
				.fillMaxWidth()
				.aspectRatio(3f / 2f)
		)
		Column(
			modifier = Modifier.padding(16.dp),
			horizontalAlignment = Alignment.End
		) {
			Text(
				modifier = Modifier.fillMaxWidth(),
				text = item?.attributes?.movieTitle ?: "",
				style = MaterialTheme.typography.titleSmall,
				fontWeight = FontWeight.Medium,
				textAlign = TextAlign.End
			)
			Spacer(modifier = Modifier.height(8.dp))
			Text(
				modifier = Modifier.fillMaxWidth(),
				text = item?.attributes?.movieTitleEn ?: "",
				style = MaterialTheme.typography.titleMedium,
				fontWeight = FontWeight.Medium,
				textAlign = TextAlign.End
			)
			Spacer(modifier = Modifier.height(8.dp))
		}
	}
}