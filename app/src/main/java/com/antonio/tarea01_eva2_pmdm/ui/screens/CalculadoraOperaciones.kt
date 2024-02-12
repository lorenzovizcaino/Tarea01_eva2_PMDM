package com.antonio.tarea01_eva2_pmdm.ui.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.RadioButton
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.text.DecimalFormat

@Preview
@Composable
fun CalculadoraOperaciones() {
    val context = LocalContext.current
    var number1 by rememberSaveable { mutableStateOf("")}
    var number2 by rememberSaveable { mutableStateOf("")}
    var resultado by rememberSaveable {mutableStateOf("0.0")}
    var color by remember { mutableStateOf(Color.Black) }
    var operacion by rememberSaveable {mutableStateOf("Suma")}


    var num1 = 0.0
    var num2 = 0.0
    var resul=0.0
    val formato = DecimalFormat("#.##")

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
        operacion=MyRadioButton()

        Text(
            text = "Resultado = $resultado", color = color, fontSize = 36.sp
        )


        Button(onClick = {

            when{

                operacion =="Suma" -> resul=(num1+num2)
                operacion =="Resta" -> resul=(num1-num2)
                operacion =="Multiplicacion" -> resul=(num1*num2)
                operacion =="Division" -> resul=(num1/num2)
            }
            resultado=formato.format(resul).toString()



            when {
                resultado.toDouble() > 25 -> color = Color.Cyan
                resultado.toDouble() < 25 -> color = Color.Blue
                else -> color = Color.Red
            }

        }) {
            Text(text = "Calcular")


        }
    }
}
@Composable
fun MyRadioButton(): String {
    var operacion by rememberSaveable {mutableStateOf("Suma")}
    Column (modifier=Modifier.fillMaxWidth().padding(start=60.dp),horizontalAlignment = Alignment.Start){
        Row() {
            RadioButton(selected = operacion == "Suma", onClick = { operacion="Suma" })
            Text(text = "Suma", modifier = Modifier.padding(top = 12.dp))
        }

        Row() {
            RadioButton(selected = operacion == "Resta", onClick = { operacion="Resta" })
            Text(text = "Resta", modifier = Modifier.padding(top = 12.dp))
        }

        Row() {
            RadioButton(selected = operacion == "Multiplicacion", onClick = { operacion="Multiplicacion" })
            Text(text = "Multiplicacion", modifier = Modifier.padding(top = 12.dp))
        }

        Row() {
            RadioButton(selected = operacion == "Division", onClick = { operacion="Division" })
            Text(text = "Division", modifier = Modifier.padding(top = 12.dp))
        }


    }
    return operacion
}



