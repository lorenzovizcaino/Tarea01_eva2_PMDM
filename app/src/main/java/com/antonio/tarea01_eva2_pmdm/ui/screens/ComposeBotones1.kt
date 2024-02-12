package com.antonio.tarea01_eva2_pmdm.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp

@Composable
fun ComposeBotones1() {
    var contadorButton1 by rememberSaveable { mutableStateOf(0) }
    var contadorButton2 by rememberSaveable { mutableStateOf(0) }
    var contadorButton3 by rememberSaveable { mutableStateOf(0) }
    var contadorButton3b by rememberSaveable { mutableStateOf(0) }
    var contadorButton4 by rememberSaveable { mutableStateOf(0) }
    var contadorButton4b by rememberSaveable { mutableStateOf(0) }
    var contadorButton5 by rememberSaveable { mutableStateOf(0) }
    var contadorButton5b by rememberSaveable { mutableStateOf(0) }
    var contadorButton6 by rememberSaveable { mutableStateOf(0) }
    var contadorButton6b by rememberSaveable { mutableStateOf(0) }
    var contadorButton7 by rememberSaveable { mutableStateOf(0) }
    var contadorButton7b by rememberSaveable { mutableStateOf(0) }


    Column(
        verticalArrangement = Arrangement.Center

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
                .border(width = 2.dp, Color.Black, shape = RectangleShape)
                .padding(6.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = { contadorButton1++ },
                colors = ButtonDefaults.buttonColors(Color.Yellow),
                shape = RectangleShape
            ) {
                Text(text = "$contadorButton1", color = Color.Black)
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
                .border(width = 2.dp, Color.Black, shape = RectangleShape)
                .padding(6.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = { contadorButton2++ },
                colors = ButtonDefaults.buttonColors(Color.Green),
                shape = RectangleShape
            ) {
                Text(text = "$contadorButton2", color = Color.Black)
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
                .border(width = 2.dp, Color.Black, shape = RectangleShape)
                .padding(6.dp)
                .clickable { contadorButton3b++ },
            horizontalArrangement = Arrangement.Center,
        ) {
            Button(
                onClick = { contadorButton3++ },
                colors = ButtonDefaults.buttonColors(Color.LightGray),
                shape = RectangleShape
            ) {
                Text(text = "$contadorButton3", color = Color.Black)
            }
            Text(text = "$contadorButton3b")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
                .border(width = 2.dp, Color.Black, shape = RectangleShape)
                .padding(6.dp),
            horizontalArrangement = Arrangement.Center,
        ) {
            Column(modifier = Modifier.background(Color.Yellow)) {
                Row(modifier = Modifier
                    .clickable { contadorButton4b++ }
                    .padding(12.dp),
                    verticalAlignment = Alignment.CenterVertically) {
                    Button(
                        onClick = { contadorButton4++ },
                        colors = ButtonDefaults.buttonColors(Color.Magenta),
                        shape = RectangleShape
                    ) {
                        Text(text = "$contadorButton4", color = Color.Black)
                    }
                    Text(text = "$contadorButton4b")
                }

            }

        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
                .border(width = 2.dp, Color.Black, shape = RectangleShape)
                .padding(6.dp)
                .clickable { contadorButton5b++ },
            horizontalArrangement = Arrangement.Center,
        ) {
            Button(
                onClick = { contadorButton5++ },
                colors = ButtonDefaults.buttonColors(Color.DarkGray),
                shape = RectangleShape
            ) {
                Text(text = "$contadorButton5", color = Color.Black)
            }
            Text(text = "$contadorButton5b")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
                .border(width = 2.dp, Color.Black, shape = RectangleShape)
                .padding(6.dp)
                .clickable { contadorButton6b++ },
            horizontalArrangement = Arrangement.Center,
        ) {
            Button(
                onClick = { contadorButton6++ },
                colors = ButtonDefaults.buttonColors(Color.Red),
                shape = RectangleShape
            ) {
                Text(text = "$contadorButton6", color = Color.Black)
            }
            Text(text = "$contadorButton6b")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
                .border(width = 2.dp, Color.Black, shape = RectangleShape)
                .padding(6.dp)
                .clickable { contadorButton7b++ },
            horizontalArrangement = Arrangement.Center,
        ) {
            Button(
                onClick = { contadorButton7++ },
                colors = ButtonDefaults.buttonColors(Color.Blue),
                shape = RectangleShape
            ) {
                Text(text = "$contadorButton7")
            }
            Text(text = "$contadorButton7b")
        }


    }

}