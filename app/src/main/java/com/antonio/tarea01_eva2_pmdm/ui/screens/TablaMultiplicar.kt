package com.antonio.tarea01_eva2_pmdm.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TablaMultiplicar() {
    var valorTextField by remember { mutableStateOf("") }
    var texto by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(value = valorTextField, onValueChange = {valorTextField=it})
        Button(onClick = {
            texto=CalcularTabla(Integer.parseInt(valorTextField))

        }) {
            Text(text = "Calcular")
        }
        println(texto)


        Text(text = texto, color = Color.White, fontSize = 20.sp, textAlign = TextAlign.Center,modifier = Modifier
            .background(Color.LightGray)
            .fillMaxWidth())


    }

}

private fun CalcularTabla(num: Int): String {
    var texto=""
    for (i in 0..10){
        texto+="$num x $i = ${num*i}\n"
    }


    return texto

}