package com.antonio.tarea01_eva2_pmdm.ui.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class DadoViewModel: ViewModel (){
    private var _numero = MutableLiveData(0)
    val numero get() = _numero

    fun changeNumber() {
        _numero.value = Random.nextInt(from = 1, until = 7)
    }
}