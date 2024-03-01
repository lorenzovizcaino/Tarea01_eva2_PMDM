package com.antonio.tarea01_eva2_pmdm.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.antonio.tarea01_eva2_pmdm.ui.miscompose.myTextField

@Preview
@Composable
fun Calculadora() {
    Calculadora(CalculadoraViewModel())
}

@Composable
fun Calculadora(viewModel: CalculadoraViewModel){
    var lista= listOf<String>("Suma","Resta","Multiplicacion","Division")
    var context= LocalContext.current
    Column(
        modifier = Modifier.padding(top = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        myTextField(viewModel.number1, {viewModel.Operando1(it)}, "Numero 1")
        myTextField(viewModel.number2, {viewModel.Operando2(it)}, "Numero 2")


        MyRadioButton3(lista,viewModel)

        Text(
            text = "Resultado = ${viewModel.resultado}", color = viewModel.color, fontSize = 36.sp
        )


        Button(onClick = {
            try{
            viewModel.ObtenerResultado()
            }catch (e:NumberFormatException){
                showToast2("Debe de Introducir Operandos",context)
            }

        }) {
            Text(text = "Calcular")


        }
    }
}

@Composable
fun MyRadioButton3(lista: List<String>, viewModel: CalculadoraViewModel) {
    Column (modifier= Modifier
        .fillMaxWidth()
        .padding(start = 60.dp),horizontalAlignment = Alignment.Start){
        for (i in 0..lista.size-1){
            Row() {
                RadioButton(selected = viewModel.operacion == lista[i], onClick = { viewModel.ObtenerOperacion(lista[i]) })
                Text(text = lista[i], modifier = Modifier.padding(top = 12.dp))
            }

        }
    }
}




