package com.sn.sabaideatest.presentation.ui.component

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.R
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max
import androidx.compose.ui.unit.min
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.sn.sabaideatest.data.util.Result
import com.sn.sabaideatest.presentation.ui.MoviesViewModel
import com.sn.sabaideatest.presentation.ui.component.item.MovieItem
import kotlinx.coroutines.launch
import timber.log.Timber

@ExperimentalMaterial3Api
@Composable
fun MoviesScreen(viewModel: MoviesViewModel = hiltViewModel()) {

	val uiState: MoviesScreenUiState by viewModel.uiState.collectAsState()
	val (searchText, updateSearchText) = rememberSaveable(stateSaver = TextFieldValue.Saver) {
		mutableStateOf(TextFieldValue(""))
	}

	LaunchedEffect(key1 = searchText.text) {
		viewModel.getMovies(searchText.text)
	}
	Column(modifier = Modifier
		.fillMaxSize()
		.padding(start = 8.dp, end = 8.dp, top = 8.dp)) {
		SearchBar(searchTerm = searchText, updateSearchTerm = updateSearchText)
		Box(modifier = Modifier.fillMaxSize()) {
			SearchedMovie(uiState)
		}
	}

}

@ExperimentalMaterial3Api
@Composable
private fun BoxScope.SearchedMovie(
	uiState: MoviesScreenUiState,
) {
	val context = LocalContext.current
	when {
		uiState.idle -> Text(
			text = "Nothing Found",
			modifier = Modifier.align(Alignment.Center))
		uiState.isLoading -> {
			LoadingWheel(modifier = Modifier.align(Alignment.Center),
				contentDesc = "")
		}
		uiState.error?.message?.isNotEmpty() == true -> Toast.makeText(
			context,
			uiState.error?.message,
			Toast.LENGTH_LONG).show()
		uiState is MoviesScreenUiState.Success -> LazyVerticalGrid(
			columns = GridCells.Adaptive(128.dp),
			contentPadding = PaddingValues(8.dp),
			verticalArrangement = Arrangement.spacedBy(8.dp),
			horizontalArrangement = Arrangement.spacedBy(8.dp),
			modifier = Modifier
				.fillMaxSize()) {
			items(items = uiState.moviesList) { item ->
				MovieItem(
					item = item,
					modifier = Modifier
						.heightIn(min = min(a = 240.dp,
							b = with(LocalDensity.current) { 240.sp.toDp() }),
							max = max(a = 240.dp,
								b = with(LocalDensity.current) { 240.sp.toDp() })),
				)
			}
		}
	}

}
