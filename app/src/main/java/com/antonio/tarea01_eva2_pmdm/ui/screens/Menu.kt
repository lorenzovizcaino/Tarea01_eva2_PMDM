package com.antonio.tarea01_eva2_pmdm.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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

        Button(onClick = { navController.navigate(route = Screens.CalculadoraOperaciones.route) }) {
            Text(text = "Calculadora Operaciones")
        }

    }
}