package com.aulasandroid.quizatron.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun Question(question: String) {
    Text(
        text = "Se o inimigo cura muito, qual item fazer?",
        fontSize = 24.sp
    )
}