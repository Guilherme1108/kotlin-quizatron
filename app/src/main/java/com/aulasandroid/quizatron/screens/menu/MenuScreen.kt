package com.aulasandroid.quizatron.screens.menu

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aulasandroid.quizatron.R

@Composable
fun MenuScreen(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(206, 125, 52, 255)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier
                .size(64.dp),
            painter = painterResource(R.drawable.ic_android_black_24dp),
            contentDescription = "Nave",
            colorFilter = ColorFilter.tint(Color.White)
        )

        Text(
            text = "QUIZATRON 3000"
        )

        Button(
            modifier = Modifier
                .fillMaxWidth(),
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Yellow,
            ),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                text = "Calcular",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }

    }

}