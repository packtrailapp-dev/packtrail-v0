package com.packtrail

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.packtrail.navigation.PackTrailNavHost
import com.packtrail.ui.theme.PackTrailTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PackTrailTheme {
                val navController = rememberNavController()
                PackTrailNavHost(navController)
            }
        }
    }
}
