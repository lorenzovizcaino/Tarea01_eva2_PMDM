package com.antonio.tarea01_eva2_pmdm.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.material.Text
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun MyButton(function: () -> Unit, texto: String, color: Color = Color.Blue, forma: Shape = RectangleShape, elevacion: Dp =0.dp, colorBorde: Color = Color.Blue, grosorBorde: Dp =0.dp) {
    Button(
        onClick = function,
        colors = ButtonDefaults.buttonColors(color),
        shape = forma,
        elevation = ButtonDefaults.buttonElevation(12.dp),
        border = BorderStroke(grosorBorde, colorBorde),
    )


    {
        Text(text = texto)

    }
}