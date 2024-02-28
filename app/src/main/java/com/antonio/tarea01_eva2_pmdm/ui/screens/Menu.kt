package com.antonio.tarea01_eva2_pmdm.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.antonio.tarea01_eva2_pmdm.ui.navigation.Screens

@Composable
fun Menu(navController: NavController){

    //Si por ejemplo fuese un listado de botones que permiten navegar:

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Button(onClick = { navController.navigate(route = Screens.TablaMultiplicar.route) },colors = ButtonDefaults.buttonColors(Color.Red)) {
            Text(text = "Tabla Multiplicar")
        }



        MyButton({ navController.navigate(route = Screens.ComposeColumn1.route) }, "Ejemplo Columnas 1",Color.Red)

        Button(onClick = { navController.navigate(route = Screens.ComposeColumn2.route) }) {
            Text(text = "Ejemplo Columnas 2")
        }



        MyButton(function = { navController.navigate(route = Screens.ComposeRow1.route) }, texto ="Ejemplo filas 1" , color =Color.Red )

        Button(onClick = { navController.navigate(route = Screens.ComposeColumnInBox.route) }) {
            Text(text = "Ejemplo Column in Box")
        }

        Button(onClick = { navController.navigate(route = Screens.ComposeMix.route) }) {
            Text(text = "Ejemplo Compose Mix ")
        }

        Button(onClick = { navController.navigate(route = Screens.ComposeBotones1.route) }) {
            Text(text = "Ejemplo Botones 1")
        }

        Button(onClick = { navController.navigate(route = Screens.ComposeBotones2.route) }) {
            Text(text = "Ejemplo Botones 2")
        }

        Button(onClick = { navController.navigate(route = Screens.BotonesConIcono.route) }) {
            Text(text = "Ejemplo Botones con Icono")
        }

        Button(onClick = { navController.navigate(route = Screens.CalculadoraSumas.route) }) {
            Text(text = "Calculadora Sumas")
        }

        Button(onClick = { navController.navigate(route = Screens.Calculadora.route) }) {
            Text(text = "Calculadora Operaciones")
        }

        Button(onClick = { navController.navigate(route = Screens.ContadorST.route) }) {
            Text(text = "Contador State Hosting")
        }

    }
}

@Composable
fun MyButton(function: () -> Unit, texto: String, color: Color) {
    Button(onClick = function,colors = ButtonDefaults.buttonColors(color)) {
        Text(text =texto )
        //cc
    }

}
