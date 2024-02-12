package com.antonio.tarea01_eva2_pmdm.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BotonesConIcono() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Botones con Icono", fontSize = 30.sp)
        Row {
            Icon(Icons.Default.ShoppingCart, contentDescription = "Carrito", tint = Color.Blue)
            Text(text = " BOTÓN")
        }
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.White),
            border = BorderStroke(2.dp, Color.Black)
        ) {
            Icon(Icons.Default.ShoppingCart, contentDescription = "Carrito", tint = Color.Blue)
            Text(text = " BOTÓN", color = Color.Blue)
        }

        Button(onClick = { /*TODO*/ }) {
            Icon(Icons.Default.ShoppingCart, contentDescription = "Carrito", tint = Color.White)
            Text(text = " BOTÓN")
        }

    }
}