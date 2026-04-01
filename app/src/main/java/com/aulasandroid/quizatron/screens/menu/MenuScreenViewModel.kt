package com.aulasandroid.quizatron.screens.menu

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf

class MenuScreenViewModel {
    private val _nome = mutableStateOf("")
    val nome: State<String> = _nome

    fun atualizarNome(novoNome: String) {
        _nome.value = novoNome
    }
}