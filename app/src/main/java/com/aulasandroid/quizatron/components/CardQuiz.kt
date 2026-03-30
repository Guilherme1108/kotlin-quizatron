package com.aulasandroid.quizatron.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.aulasandroid.quizatron.screens.quiz.QuizScreenViewModel
//import java.lang.reflect.Modifier

@Composable
fun CardQuiz(navController: NavController) {

    val viewModel = QuizScreenViewModel()

    Card(
        modifier = Modifier
            .offset(y = (-20).dp)
            .height(400.dp)
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 32.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(8.dp),
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            val perguntaAtualIndex by viewModel.perguntaAtualIndex
            val pergunta = viewModel.perguntas[perguntaAtualIndex]

            var acertos = 0

            Question(pergunta.pergunta)

            pergunta.opcoes.forEach { opcao ->
                OptionQuiz(opcao.text, opcao.value, opcaoSelecionada = {viewModel.proximaPergunta(navController)})

                if (opcao.value == true) {
                    acertos++
                }
            }



        }

    }

}