package org.example.kmp.presentation.screen.home

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen

class HomeScreen : Screen {
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content() {
        Scaffold(
            topBar = {
                CenterAlignedTopAppBar(title = { Text(text = "Home") })
            },
            floatingActionButton = {
                FloatingActionButton(
                    onClick = { },
                    shape = RoundedCornerShape(size = 12.dp)
                ) {
                    Icon(imageVector = Icons.Default.Edit, contentDescription = "Edit")
                }
            }) { }
    }
}