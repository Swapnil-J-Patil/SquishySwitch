package com.swapnil.squishyswitch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.swapnil.squishyswitch.presentation.SquishyToggleSwitch
import com.swapnil.squishyswitch.ui.theme.SquishySwitchTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SquishyToggleScreen()
        }
    }
}

@Composable
fun SquishyToggleScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        /* Text(
             text = "Click on the switch",
             style = MaterialTheme.typography.titleLarge,
             fontWeight = FontWeight.Bold,
             color = MaterialTheme.colorScheme.secondary
         )
         Spacer(modifier = Modifier.height(16.dp))*/
        SquishyToggleSwitch(
            Color(0xFF4CCF59),
            containerHeight = 95,
            containerWidth = 200,
            circleSize = 80,
            padding = 8,
            shadowOffset = 14
        ) // Green
        Spacer(modifier = Modifier.height(16.dp))
        SquishyToggleSwitch(Color(0xFF3384FB),
            containerHeight = 95,
            containerWidth = 200,
            circleSize = 80,
            shadowOffset = 14,
            padding = 8) // Blue
        Spacer(modifier = Modifier.height(16.dp))
        SquishyToggleSwitch(
            Color(0xFFFF3372),
            containerHeight = 95,
            containerWidth = 200,
            circleSize = 80,
            padding = 8,
            shadowOffset = 14
        )
        Spacer(modifier = Modifier.height(16.dp))
    }
}