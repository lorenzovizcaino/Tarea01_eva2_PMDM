package com.antonio.tarea01_eva2_pmdm.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.antonio.tarea01_eva2_pmdm.R

@Composable
fun ComposeColumnInBox() {
    Box(modifier = Modifier
        .background(Color.Yellow)
        .padding(40.dp)) {


        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Cyan),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Greeting(
                name = stringResource(R.string.hola),
                modifier = Modifier


            )

            Greeting(
                name = stringResource(id = R.string.jetpack_compose),
                modifier = Modifier


            )

            Greeting(
                name = stringResource(R.string.otro_texto_hardcodeado),
                modifier = Modifier
                    .align(Alignment.End)


            )

        }
    }
}