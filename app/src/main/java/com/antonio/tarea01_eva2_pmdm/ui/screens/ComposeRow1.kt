package com.antonio.tarea01_eva2_pmdm.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.antonio.tarea01_eva2_pmdm.R

@Composable
fun ComposeRow1(){
    Row(
        modifier= Modifier
            .fillMaxWidth()
            .background(Color.Cyan)
            .padding(20.dp),
        verticalAlignment = Alignment.CenterVertically,

        // horizontalArrangement = Arrangement.SpaceAround,//cómo se colocan de forma vertical los eltos
        //con SpaceEvenly->en función del espacio que tienen(dejando encima y debajo)
        //SpaceBetween->mismo espacio entre cada uno los huecos(sin espacio encima 1erElto ni debajo últimoElto)
        //SpaceAround->como Evenly pero dejando mismo espacio encima primero y debajo último (siendo la mitad que el q existe entre eltos)

        //horizontalArrangement = Arrangement.SpaceAround
    )
    {

        Greeting(
            name = stringResource(R.string.hola_texto_hardcodeado),

            )
        Greeting(
            name = stringResource(R.string.jetpack_compose),
            modifier = Modifier
                .background(Color.Magenta)
                .align(Alignment.Top)

        )


    }



}