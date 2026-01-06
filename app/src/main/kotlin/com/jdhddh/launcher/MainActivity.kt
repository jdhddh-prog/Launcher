package com.jdhddh.launcher

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jdhddh.launcher.ui.screens.GameScreen
import com.jdhddh.launcher.ui.screens.NicknameScreen
import com.jdhddh.launcher.ui.screens.PreparationScreen
import com.jdhddh.launcher.ui.screens.ServerSelectionScreen
import com.jdhddh.launcher.ui.screens.SplashScreen
import com.jdhddh.launcher.ui.theme.LauncherTheme
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LauncherTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LauncherApp()
                }
            }
        }
    }
}

@Composable
fun LauncherApp() {
    val navController = rememberNavController()
    var startDestination by remember { mutableStateOf("splash") }
    var isNavigationReady by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        // Simulate splash screen delay
        delay(2000)
        isNavigationReady = true
    }

    if (isNavigationReady) {
        NavHost(
            navController = navController,
            startDestination = startDestination,
            modifier = Modifier.fillMaxSize()
        ) {
            composable(route = "splash") {
                SplashScreen(
                    onNavigateToNickname = {
                        navController.navigate("nickname") {
                            popUpTo("splash") { inclusive = true }
                        }
                    }
                )
            }

            composable(route = "nickname") {
                NicknameScreen(
                    onNavigateToServerSelection = { nickname ->
                        navController.navigate("serverSelection/$nickname") {
                            popUpTo("nickname") { inclusive = true }
                        }
                    }
                )
            }

            composable(
                route = "serverSelection/{nickname}",
                arguments = listOf()
            ) { backStackEntry ->
                val nickname = backStackEntry.arguments?.getString("nickname") ?: ""
                ServerSelectionScreen(
                    nickname = nickname,
                    onNavigateToPreparation = { server ->
                        navController.navigate("preparation/$nickname/$server") {
                            popUpTo("serverSelection/$nickname") { inclusive = true }
                        }
                    },
                    onNavigateBackToNickname = {
                        navController.navigate("nickname") {
                            popUpTo("serverSelection/$nickname") { inclusive = true }
                        }
                    }
                )
            }

            composable(
                route = "preparation/{nickname}/{server}",
                arguments = listOf()
            ) { backStackEntry ->
                val nickname = backStackEntry.arguments?.getString("nickname") ?: ""
                val server = backStackEntry.arguments?.getString("server") ?: ""
                PreparationScreen(
                    nickname = nickname,
                    server = server,
                    onNavigateToGame = {
                        navController.navigate("game/$nickname/$server") {
                            popUpTo("preparation/$nickname/$server") { inclusive = true }
                        }
                    },
                    onNavigateBackToServerSelection = {
                        navController.navigate("serverSelection/$nickname") {
                            popUpTo("preparation/$nickname/$server") { inclusive = true }
                        }
                    }
                )
            }

            composable(
                route = "game/{nickname}/{server}",
                arguments = listOf()
            ) { backStackEntry ->
                val nickname = backStackEntry.arguments?.getString("nickname") ?: ""
                val server = backStackEntry.arguments?.getString("server") ?: ""
                GameScreen(
                    nickname = nickname,
                    server = server,
                    onNavigateBackToPreparation = {
                        navController.navigate("preparation/$nickname/$server") {
                            popUpTo("game/$nickname/$server") { inclusive = true }
                        }
                    }
                )
            }
        }
    }
}
