package com.aulasandroid.quizatron.screens.quiz

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class QuizScreenViewModel: ViewModel() {

    data class Opcao (
        val text: String,
        val value: Boolean = false
    )

    data class Pergunta(
        val id: Int,
        val pergunta: String,
        val opcoes: List<Opcao>
    )

    private val _perguntas = listOf(
            Pergunta(
                id = 1,
                pergunta = "Se o inimigo cura muito, qual item fazer?",
                opcoes = listOf(
                    Opcao("Gume do Infinito", false),
                    Opcao("Sedenta por Sangue", false),
                    Opcao("Lembrete Mortal", true),
                    Opcao("Furacão de Runaan", false)
                )
            ),
            Pergunta(
                id = 2,
                pergunta = "Qual item dá velocidade de ataque?",
                opcoes = listOf(
                    Opcao("Furacão de Runaan", true),
                    Opcao("Armadura de Espinhos", false),
                    Opcao("Cajado do Vazio", false),
                    Opcao("Warmog", false)
                )
            ),
            Pergunta(
                id = 3,
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
        viewModelScope.launch {
            delay(250)
            if (_perguntaAtualIndex.value < _perguntas.size - 1) {
                _perguntaAtualIndex.value++
//            Log.i("teste", "${_perguntaAtualIndex.value}")
            } else {
                navController.navigate("result/${pontos.value}")
            }
        }
    }

    val perguntas = _perguntas

    private val _pontos = mutableStateOf(0)
    val pontos: State<Int> = _pontos

    fun adicionarPontos() {
        _pontos.value++
    }


}