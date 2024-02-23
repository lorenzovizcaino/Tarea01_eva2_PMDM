package com.antonio.tarea01_eva2_pmdm.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun ContadorST() {
    var contador by rememberSaveable { mutableStateOf(0) }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Button(
            colors = ButtonDefaults.buttonColors(Color.Red),
            shape = RectangleShape,
            elevation = ButtonDefaults.buttonElevation(12.dp),
            border = BorderStroke(3.dp,Color.Yellow),
            onClick = { contador++ },
            enabled = contador < 10
        ) {
            Text(text = "Contar", color = Color.Black)
        }
        if (contador > 0) {
            Text(text = "Has pulsado $contador veces")
        }


    }
}