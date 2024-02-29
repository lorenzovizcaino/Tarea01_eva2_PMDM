package com.antonio.tarea01_eva2_pmdm.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar

import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.antonio.tarea01_eva2_pmdm.ui.navigation.Screens
import kotlin.random.Random

@Composable
fun Menu(navController: NavController) {

    //Scaffold(topBar = { CustomTopBar() })



    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {



        MyButton(
            { navController.navigate(route = Screens.TablaMultiplicar.route) },
            "Tabla Multiplicar",
            color=Color(Random.nextLong(0xFF000000, 0xFFFFFFFF)),
            elevacion = 12.dp,
            colorBorde=Color.Yellow,
            grosorBorde=3.dp)

        MyButton(
            { navController.navigate(route = Screens.ComposeColumn1.route) },
            "Ejemplo Columnas 1",
            color=Color(Random.nextLong(0xFF000000, 0xFFFFFFFF)),
            elevacion = 12.dp,
            colorBorde=Color.Yellow,
            grosorBorde=3.dp)

        MyButton(
            { navController.navigate(route = Screens.ComposeColumn2.route) },
            "Ejemplo Columnas 2",
            color=Color(Random.nextLong(0xFF000000, 0xFFFFFFFF)),
            elevacion = 12.dp,
            colorBorde=Color.Yellow,
            grosorBorde=3.dp)


        MyButton(
            { navController.navigate(route = Screens.ComposeRow1.route) },
            "Ejemplo filas 1",
            color=Color(Random.nextLong(0xFF000000, 0xFFFFFFFF)),
            forma = CircleShape,
            elevacion = 12.dp,
            colorBorde=Color.Yellow,
            grosorBorde=3.dp)

        MyButton(
            { navController.navigate(route = Screens.ComposeColumnInBox.route) },
            "Ejemplo Column in Box",
            color=Color(Random.nextLong(0xFF000000, 0xFFFFFFFF)),
            forma = CircleShape,
            elevacion = 12.dp,
            colorBorde=Color.Yellow,
            grosorBorde=3.dp)

        MyButton(
            { navController.navigate(route = Screens.ComposeMix.route) },
            "Ejemplo Compose Mix",
            color=Color(Random.nextLong(0xFF000000, 0xFFFFFFFF)),
            forma = CircleShape,
            elevacion = 12.dp,
            colorBorde=Color.Yellow,
            grosorBorde=3.dp)

        MyButton(
            { navController.navigate(route = Screens.ComposeBotones1.route) },
            "Ejemplo Botones 1",
            color=Color(Random.nextLong(0xFF000000, 0xFFFFFFFF)),
            elevacion = 12.dp,
            colorBorde=Color.Yellow,
            grosorBorde=3.dp)

        MyButton(
            { navController.navigate(route = Screens.ComposeBotones2.route) },
            "Ejemplo Botones 2",
            color=Color(Random.nextLong(0xFF000000, 0xFFFFFFFF)),
            elevacion = 12.dp,
            colorBorde=Color.Yellow,
            grosorBorde=3.dp)

        MyButton(
            { navController.navigate(route = Screens.BotonesConIcono.route) },
            "Ejemplo Botones con Icono",
            color=Color(Random.nextLong(0xFF000000, 0xFFFFFFFF)),
            elevacion = 12.dp,
            colorBorde=Color.Yellow,
            grosorBorde=3.dp)

        MyButton(
            { navController.navigate(route = Screens.CalculadoraSumas.route) },
            "Calculadora Sumas",
            color=Color(Random.nextLong(0xFF000000, 0xFFFFFFFF)),
            forma = CircleShape,
            elevacion = 12.dp,
            colorBorde=Color.Yellow,
            grosorBorde=3.dp)

        MyButton(
            { navController.navigate(route = Screens.Calculadora.route) },
            "Calculadora Operaciones",
            color=Color(Random.nextLong(0xFF000000, 0xFFFFFFFF)),
            forma = CircleShape,
            elevacion = 12.dp,
            colorBorde=Color.Yellow,
            grosorBorde=3.dp)

        MyButton(
            { navController.navigate(route = Screens.ContadorST.route) },
            "Contador State Hosting",
            color=Color(Random.nextLong(0xFF000000, 0xFFFFFFFF)),
            forma = CircleShape,
            elevacion = 12.dp,
            colorBorde=Color.Yellow,
            grosorBorde=3.dp)

        MyButton(
            { navController.navigate(route = Screens.MainScreenDado.route) },
            "Dado LiveData",
            color=Color(Random.nextLong(0xFF000000, 0xFFFFFFFF)),
            forma = CircleShape,
            elevacion = 12.dp,
            colorBorde=Color.Yellow,
            grosorBorde=3.dp)










    }
}

@Composable
fun CustomTopBar() {
    TopAppBar(
        // Título de la barra superior
        title = { Text(text = "Ej. Scaffold-Top") },
    )
}




