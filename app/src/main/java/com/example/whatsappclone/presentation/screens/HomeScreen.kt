package com.example.whatsappclone.presentation.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import com.example.whatsappclone.data.INITIAL_SCREEN
import com.example.whatsappclone.data.tabs
import com.example.whatsappclone.presentation.components.AppbarComponent
import com.example.whatsappclone.presentation.components.TabsComponent
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

    val pagerState = rememberPagerState(pageCount = { tabs.size }, initialPage = INITIAL_SCREEN)

    val scope = rememberCoroutineScope()

    Scaffold(
        topBar = {
            AppbarComponent()
        },
        content = { contentPadding ->
            Column(modifier = modifier.padding(contentPadding)) {
                TabsComponent(
                    pagerState = pagerState,
                    initialIndex = INITIAL_SCREEN,
                    onTabSelected = { selectedIndex ->
                        scope.launch {
                            pagerState.animateScrollToPage(selectedIndex)

                        }
                    })
                HorizontalPager(
                    state = pagerState, modifier = Modifier.fillMaxSize()
                ) { page ->
                    when (page) {
                        0 -> ChatScreen()
                        1 -> StatusScreen()
                        2 -> CallsScreen()
                    }
                }
            }
        }
    )
}


@Preview
@Composable
fun HomePreview() {
    HomeScreen()
}