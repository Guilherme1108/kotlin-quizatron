package com.aulasandroid.quizatron.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aulasandroid.quizatron.screens.quiz.QuizScreenViewModel

@Composable
fun OptionQuiz(
    text: String, value: Boolean, opcaoSelecionada: (Boolean) -> Unit
){
    var selecionado by remember(text) { mutableStateOf(false) }

    OutlinedButton(
        onClick = {
            if (!selecionado) {
                selecionado = true
                opcaoSelecionada(value)
            }
        },
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp),
        shape = RoundedCornerShape(8.dp),
    ) {
        Text(
            text = text,
            modifier = Modifier.fillMaxWidth(),
            color = Color.Black,
            fontSize = 24.sp
        )


    }
    
}