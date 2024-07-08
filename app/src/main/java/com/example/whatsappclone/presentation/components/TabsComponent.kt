package com.example.whatsappclone.presentation.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.SecondaryIndicator
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.whatsappclone.data.TabData
import com.example.whatsappclone.data.tabs
import com.example.whatsappclone.presentation.viewmodel.TabsViewModel

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TabsComponent(
    viewModel: TabsViewModel = viewModel(),
                  initialIndex: Int = 0,
    pagerState: PagerState,
    onTabSelected: (Int) -> Unit
    ) {

//    var selectedIndex by remember {
//        mutableIntStateOf(0)
//    }
    // Set the initial index
    LaunchedEffect(initialIndex) {
        viewModel.setInitialIndex(initialIndex)
    }

    // Synchronize pager and tabs
    LaunchedEffect(pagerState) {
        snapshotFlow { pagerState.currentPage }.collect { page ->
            viewModel.onTabSelected(page)
        }
    }


    val selectedIndex by viewModel.selectedTabIndex.collectAsState()

    TabRow(
        selectedTabIndex = selectedIndex,
        modifier = Modifier.fillMaxWidth(),
        containerColor = MaterialTheme.colorScheme.primary,
        contentColor = MaterialTheme.colorScheme.onPrimary,
        indicator = { tabPositions ->
            SecondaryIndicator( modifier = Modifier.tabIndicatorOffset(tabPositions[selectedIndex]),
                height = 4.dp,
                color = MaterialTheme.colorScheme.secondary
            )
        }
        ) {
        tabs.forEachIndexed { index, tabData ->
            Tab(
                text = {
                    if (tabData.unreadCount == null || tabData.unreadCount == 0)
                    TabTitle(title = tabData.title) else TabWithUnreadCount(tabData = tabData)
                },
                selected = selectedIndex == index,
                onClick = {
                    viewModel.onTabSelected(index)
                    onTabSelected(index)
    },
            )
        }
    }
}

@Composable
fun TabTitle(title: String) {
    Text(text = title, style = TextStyle(fontSize = 16.sp))
}

@Composable
fun TabWithUnreadCount(tabData: TabData) {
   Row(
       verticalAlignment = Alignment.CenterVertically,
       horizontalArrangement = Arrangement.Center
   ) {
         TabTitle(title = tabData.title)
         tabData.unreadCount?.also { unreadCount ->
                Text(
                    text = unreadCount.toString(),
                    textAlign = TextAlign.Center,
                    style = TextStyle(fontSize = 12.sp, color = MaterialTheme.colorScheme.primary),
                    modifier = Modifier
                        .padding(4.dp)
                        .size(16.dp)
                        .clip(CircleShape)
                        .background(MaterialTheme.colorScheme.onPrimary)
                )
         }

   }
}

//@OptIn(ExperimentalFoundationApi::class)
//@Preview
//@Composable
//fun TabsComponentPreview() {
//    TabsComponent()
//}