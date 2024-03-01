package com.antonio.tarea01_eva2_pmdm.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.antonio.tarea01_eva2_pmdm.ui.miscompose.myTextField
import com.antonio.tarea01_eva2_pmdm.ui.miscompose.showToast

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CalculadoraSumas() {

    val context = LocalContext.current
    var number1 by rememberSaveable { mutableStateOf("") }
    var number2 by rememberSaveable { mutableStateOf("") }
    var suma by rememberSaveable { mutableStateOf("0.0") }
    var color by remember { mutableStateOf(Color.Black) }

    var num1 = 0.0
    var num2 = 0.0

    try {
        num1 = number1.toDouble()
        num2 = number2.toDouble()
    } catch (e: NumberFormatException) {
        if (!(number1 == "" || number2 == "")) {
            showToast("Solo Numeros", context)
        }

    }

    Column(
        modifier = Modifier.padding(top = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        myTextField(number1, { number1 = it }, "Numero 1")
        myTextField(number2, { number2 = it }, "Numero 2")
        Text(
            text = "Suma = $suma", color = color, fontSize = 36.sp
        )

        Button(onClick = {
            suma = (num1 + num2).toString()
            when {
                suma.toDouble() > 25 -> color = Color.Cyan
                suma.toDouble() < 25 -> color = Color.Blue
                else -> color = Color.Red
            }

        }) {
            Text(text = "Calcular")


        }


    }
}