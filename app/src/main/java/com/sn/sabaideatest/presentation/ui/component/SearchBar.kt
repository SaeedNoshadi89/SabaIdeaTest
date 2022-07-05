package com.sn.sabaideatest.presentation.ui.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@ExperimentalMaterial3Api
@Composable
fun SearchBar(
	modifier: Modifier = Modifier,
	searchTerm: TextFieldValue,
	updateSearchTerm: (TextFieldValue) -> Unit,
) {
	Card(modifier = modifier
		.fillMaxWidth()
		.statusBarsPadding()) {
		Row(modifier = modifier
			.wrapContentSize()) {
			Icon(
				imageVector = Icons.Filled.Search,
				contentDescription = null,
				modifier = modifier
					.padding(16.dp)
					.align(Alignment.CenterVertically)
			)
			BasicTextField(
				value = searchTerm,
				onValueChange = updateSearchTerm,
				maxLines = 1,
				cursorBrush = SolidColor(LocalContentColor.current),
				modifier = modifier
					.weight(1f)
					.align(Alignment.CenterVertically)
			)

		}
	}
}