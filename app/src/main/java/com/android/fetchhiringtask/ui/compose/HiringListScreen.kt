package com.android.fetchhiringtask.ui.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.android.fetchhiringtask.ui.viewmodels.HiringViewModel

@Composable
fun HiringListScreen(viewModel: HiringViewModel) {

    val dataList by viewModel.hiringList.collectAsState()
    val groupedData = dataList.groupBy { it.listId }

    LazyColumn {
        groupedData.forEach { (listId, fetchList) ->
            item {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 5.dp),
                    text = "List $listId",
                    fontSize = 24.sp
                )
            }

            items(fetchList) { user ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    shape = MaterialTheme.shapes.medium
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(text = "ID: ${user.id}", style = MaterialTheme.typography.bodySmall)
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "List ID: ${user.listId}",
                            style = MaterialTheme.typography.bodyMedium
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "Name: ${user.name}",
                            style = MaterialTheme.typography.bodyLarge
                        )
                    }
                }
            }

        }
    }
}
