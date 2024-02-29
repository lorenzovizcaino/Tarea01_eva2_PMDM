package com.antonio.tarea01_eva2_pmdm.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material.Text

import androidx.compose.material3.ButtonDefaults
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

@Composable
fun Menu(navController: NavController) {

    //Si por ejemplo fuese un listado de botones que permiten navegar:

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {



        MyButton(
            { navController.navigate(route = Screens.TablaMultiplicar.route) },
            "Tabla Multiplicar",
            color=Color.Red,
            elevacion = 12.dp,
            colorBorde=Color.Yellow,
            grosorBorde=3.dp)

        MyButton(
            { navController.navigate(route = Screens.ComposeColumn1.route) },
            "Ejemplo Columnas 1",
            color=Color.Red,
            elevacion = 12.dp,
            colorBorde=Color.Yellow,
            grosorBorde=3.dp)

        MyButton(
            { navController.navigate(route = Screens.ComposeColumn2.route) },
            "Ejemplo Columnas 2",
            color=Color.Red,
            elevacion = 12.dp,
            colorBorde=Color.Yellow,
            grosorBorde=3.dp)


        MyButton(
            { navController.navigate(route = Screens.ComposeRow1.route) },
            "Ejemplo filas 1",
            color=Color.Red,
            forma = CircleShape,
            elevacion = 12.dp,
            colorBorde=Color.Yellow,
            grosorBorde=3.dp)

        MyButton(
            { navController.navigate(route = Screens.ComposeColumnInBox.route) },
            "Ejemplo Column in Box",
            color=Color.Red,
            forma = CircleShape,
            elevacion = 12.dp,
            colorBorde=Color.Yellow,
            grosorBorde=3.dp)

        MyButton(
            { navController.navigate(route = Screens.ComposeMix.route) },
            "Ejemplo Compose Mix",
            color=Color.Red,
            forma = CircleShape,
            elevacion = 12.dp,
            colorBorde=Color.Yellow,
            grosorBorde=3.dp)

        MyButton(
            { navController.navigate(route = Screens.ComposeBotones1.route) },
            "Ejemplo Botones 1",
            color=Color.Red,
            forma = CircleShape,
            elevacion = 12.dp,
            colorBorde=Color.Yellow,
            grosorBorde=3.dp)

        MyButton(
            { navController.navigate(route = Screens.ComposeBotones2.route) },
            "Ejemplo Botones 2",
            color=Color.Red,
            elevacion = 12.dp,
            colorBorde=Color.Yellow,
            grosorBorde=3.dp)

        MyButton(
            { navController.navigate(route = Screens.BotonesConIcono.route) },
            "Ejemplo Botones con Icono",
            color=Color.Red,
            elevacion = 12.dp,
            colorBorde=Color.Yellow,
            grosorBorde=3.dp)

        MyButton(
            { navController.navigate(route = Screens.CalculadoraSumas.route) },
            "Calculadora Sumas",
            color=Color.Red,
            forma = CircleShape,
            elevacion = 12.dp,
            colorBorde=Color.Yellow,
            grosorBorde=3.dp)

        MyButton(
            { navController.navigate(route = Screens.Calculadora.route) },
            "Calculadora Operaciones",
            color=Color.Red,
            forma = CircleShape,
            elevacion = 12.dp,
            colorBorde=Color.Yellow,
            grosorBorde=3.dp)

        MyButton(
            { navController.navigate(route = Screens.ContadorST.route) },
            "Contador State Hosting",
            color=Color.Red,
            forma = CircleShape,
            elevacion = 12.dp,
            colorBorde=Color.Yellow,
            grosorBorde=3.dp)










    }
}




