package com.aulasandroid.quizatron

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.aulasandroid.quizatron.screens.menu.MenuScreen
import com.aulasandroid.quizatron.screens.quiz.QuizScreen
import com.aulasandroid.quizatron.screens.result.ResultScreen
import com.aulasandroid.quizatron.ui.theme.QuizatronTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuizatronTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "menu"
                    ) {
                        composable(route = "menu") {
                            MenuScreen(
                                modifier = Modifier.padding((innerPadding)),
                                navController = navController
                            )
                        }

                        composable(route = "quiz") {
                            QuizScreen(
                                modifier = Modifier.padding((innerPadding)),
                                navController = navController
                            )
                        }

                        composable(route = "result/{acertos}",
                                    arguments = listOf(
                                        navArgument("acertos") {
                                            type = NavType.StringType
                                        }
                                    ) {
                            ResultScreen(
                                modifier = Modifier.padding((innerPadding)),
                                navController = navController
                            )
                        }
                    }



//                    MenuScreen( modifier = Modifier.padding(innerPadding))
//                    QuizScreen(modifier = Modifier.padding(innerPadding))
//                    ResultScreen(modifier = Modifier.padding(innerPadding))

                }
            }
        }
    }
}