package com.android.fetchhiringtask.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.android.fetchhiringtask.ui.compose.HiringListScreen
import com.android.fetchhiringtask.ui.compose.theme.FetchHiringTaskTheme
import com.android.fetchhiringtask.ui.viewmodels.HiringViewModel
import dagger.hilt.android.AndroidEntryPoint

//@AndroidEntryPoint
//class MainActivity : ComponentActivity() {
//
//    private val hiringViewModel: HiringViewModel by viewModels()
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            FetchHiringTaskTheme {
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    HiringListScreen(hiringViewModel)
//                }
//            }
//        }
//    }
//}


@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val hiringViewModel: HiringViewModel by viewModels()

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FetchHiringTaskTheme {
                Scaffold(
                    topBar = {

                        TopAppBar(
                            title = {
                                Text(
                                    text = "Hiring List",
                                    Modifier.fillMaxWidth(),
                                    fontSize = 24.sp,
                                )
                            },
                        )
                    },
                    content = { innerPadding ->

                        Surface(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(innerPadding),
                            color = MaterialTheme.colorScheme.background
                        ) {
                            HiringListScreen(hiringViewModel)
                        }
                    }
                )
            }
        }
    }
}
