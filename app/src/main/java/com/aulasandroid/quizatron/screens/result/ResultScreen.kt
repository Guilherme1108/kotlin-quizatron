package com.aulasandroid.quizatron.screens.result

import android.widget.Space
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.aulasandroid.quizatron.R

@Composable
fun ResultScreen(modifier: Modifier = Modifier, navController: NavController, pontos: Int) {

    Column(modifier = modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Image(
            modifier = Modifier
                .size(64.dp),
            painter = painterResource(R.drawable.quiz),
            contentDescription = "Logo"
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .background(Color(98, 219, 251, 255)),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

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
                if (pontos == 0) {
                    Text(
                        text = "Eu teria vergonha!",
                        fontSize = 28.sp
                    )
                } else if (pontos == 1) {
                    Text(
                        text = "Péssimo!",
                        fontSize = 28.sp
                    )
                } else if (pontos == 2) {
                    Text(
                        text = "Quase lá!",
                        fontSize = 28.sp
                    )
                } else {
                    Text(
                        text = "Parabéns!",
                        fontSize = 28.sp
                    )
                }

            }

            Text(
                text = "Você acertou ${pontos} de 3 perguntas",
                fontSize = 28.sp
            )

        }

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            modifier = Modifier
                .width(300.dp)
                .height(64.dp),
            onClick = {
                navController.navigate("menu")
            },
            border = BorderStroke(1.dp, Color.Black),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(254,222,47),
            ),
            shape = RoundedCornerShape(32.dp)
        ) {
            Text(
                text = "Jogar Novamente",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }

    }

}