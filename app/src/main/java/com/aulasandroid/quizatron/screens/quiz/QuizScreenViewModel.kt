package com.aulasandroid.quizatron.screens.quiz

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.LiveData
import androidx.navigation.NavController
import com.aulasandroid.quizatron.components.OptionQuiz

class QuizScreenViewModel {

    data class Opcao (
        val text: String,
        val value: Boolean = false
    )

    data class Pergunta(
        val pergunta: String,
        val opcoes: List<Opcao>
    )

    private val _perguntas = listOf(
            Pergunta(
                pergunta = "Se o inimigo cura muito, qual item fazer?",
                opcoes = listOf(
                    Opcao("Gume do Infinito", false),
                    Opcao("Sedenta por Sangue", false),
                    Opcao("Lembrete Mortal", true),
                    Opcao("Furacão de Runaan", false)
                )
            ),
            Pergunta(
                pergunta = "Qual item dá velocidade de ataque?",
                opcoes = listOf(
                    Opcao("Furacão de Runaan", true),
                    Opcao("Armadura de Espinhos", false),
                    Opcao("Cajado do Vazio", false),
                    Opcao("Warmog", false)
                )
            ),
            Pergunta(
                pergunta = "Qual item é de crítico?",
                opcoes = listOf(
                    Opcao("Gume do Infinito", true),
                    Opcao("Morellonomicon", false),
                    Opcao("Zhonya", false),
                    Opcao("Redenção", false)
                )
            )
    )

    private val _perguntaAtualIndex = mutableStateOf(0)
    val perguntaAtualIndex: State<Int> = _perguntaAtualIndex

    fun proximaPergunta(navController: NavController) {
        if (_perguntaAtualIndex.value < _perguntas.size - 1) {
            _perguntaAtualIndex.value++
            Log.i("teste", "${_perguntaAtualIndex.value}")
        } else {
            navController.navigate("result")
        }
    }

    val perguntas = _perguntas




}