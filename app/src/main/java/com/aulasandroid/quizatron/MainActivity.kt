package com.aulasandroid.quizatron

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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
//                    MenuScreen( modifier = Modifier.padding(innerPadding))
                    QuizScreen(modifier = Modifier.padding(innerPadding))
//                    ResultScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}