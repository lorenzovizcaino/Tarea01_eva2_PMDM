package com.antonio.tarea01_eva2_pmdm.ui.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import java.text.DecimalFormat

class CalculadoraViewModel:ViewModel() {
    var number1 by mutableStateOf("")
        private set
    var number2 by mutableStateOf("")
        private set
    var resultado by  mutableStateOf("0.0")
        private set
    var color by mutableStateOf(Color.Black)
        private set
    var operacion by  mutableStateOf("Suma")
        private set

    val formato = DecimalFormat("#.##")

    fun Operando1(number1:String){
        this.number1=number1
    }

    fun Operando2(number2:String){
        this.number2=number2
    }

    fun ObtenerColor(color:Color){
        this.color=color
    }

    fun ObtenerOperacion(operacion:String){
        this.operacion=operacion
    }

    fun ObtenerResultado(){
        var resul=0.0
        when{


            operacion =="Suma" -> resul=(number1.toDouble()+number2.toDouble())
            operacion =="Resta" -> resul=(number1.toDouble()-number2.toDouble())
            operacion =="Multiplicacion" -> resul=(number1.toDouble()*number2.toDouble())
            operacion =="Division" -> resul=(number1.toDouble()/number2.toDouble())
        }
        resultado=formato.format(resul)




        when {
            resultado.toDouble() > 25 -> color = Color.Cyan
            resultado.toDouble() < 25 -> color = Color.Blue
            else -> color = Color.Red
        }

    }


}