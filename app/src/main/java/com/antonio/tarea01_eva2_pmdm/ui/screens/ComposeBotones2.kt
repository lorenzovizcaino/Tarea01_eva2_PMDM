package com.antonio.tarea01_eva2_pmdm.ui.screens

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ComposeBotones2() {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val context = LocalContext.current
        Button(colors = ButtonDefaults.buttonColors(Color(103, 80, 164)),
            onClick = {
                showToast2("ButtonConButton", context)
            }) {
            Text(text = "ButtonConButton")
        }
        Button(modifier = Modifier.border(4.dp, Color.Blue, shape = CircleShape),
            colors = ButtonDefaults.buttonColors(Color.Magenta),

            onClick = {
                showToast2("ButtonEnText", context)
            }) {
            Text(text = "ButtonEnText", color = Color.Black)
        }
        Button(

            colors = ButtonDefaults.buttonColors(Color.Green),
            onClick = {
                showToast2("ButtonEnBox", context)
            }
        ) {
            Text(text = "ButtonEnBox", fontSize = 22.sp)
        }
    }

}

fun showToast2(string: String, context: Context) {

    Toast.makeText(context, string, Toast.LENGTH_SHORT).show()

}