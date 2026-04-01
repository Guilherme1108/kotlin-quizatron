package com.aulasandroid.quizatron.screens.quiz

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.aulasandroid.quizatron.R
import com.aulasandroid.quizatron.components.CardQuiz

@Composable
fun QuizScreen(modifier: Modifier = Modifier, navController: NavController, quizScreenViewModel: QuizScreenViewModel) {

    val perguntaAtualIndex by quizScreenViewModel.perguntaAtualIndex
    val pergunta = quizScreenViewModel.perguntas[perguntaAtualIndex]

    Box(modifier = modifier.fillMaxSize()) {
        // Imagem de Background
        Image(
            painter = painterResource(id = R.drawable.thresh),
            contentDescription = "thresh de fundo",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds // Preencher a tela Crop ou FillBounds (crop corta a imagem, fillbounds estica)
        )

        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(8.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .size(64.dp),
                painter = painterResource(R.drawable.quiz),
                contentDescription = "Logo"
            )

            Spacer(modifier = Modifier.height(32.dp))

            Row(
                modifier = Modifier
                    .width(280.dp)
                    .height(64.dp)
                    .background(
                        Color(112,215,163),
                        shape = RoundedCornerShape(16.dp)
                    )
                    .border(
                        1.dp, Color.Black, RoundedCornerShape(16.dp)
                    ),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,

                ) {
                Text(
                    text = "Pergunta ${pergunta.id} de 3",
                    fontSize = 28.sp
                )
            }

            CardQuiz(navController, quizScreenViewModel, pergunta)


        }
    }


}