package com.antonio.tarea01_eva2_pmdm.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.AppBarDefaults
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Share

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.antonio.tarea01_eva2_pmdm.R
import com.antonio.tarea01_eva2_pmdm.ui.miscompose.EspacioH
import com.antonio.tarea01_eva2_pmdm.ui.miscompose.MyButton
import com.antonio.tarea01_eva2_pmdm.ui.miscompose.showToast
import com.antonio.tarea01_eva2_pmdm.ui.navigation.Screens
import kotlin.random.Random

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Menu(navController: NavController) {



    Scaffold(
        topBar = {

            MyTopBar()

        },
        content = {padding ->
            Botones(padding,navController)

        }
    )





}

@Composable
fun MyTopBar(
    backgroundColor: Color = Color.Black,
    contentColor: Color = Color.White,
    elevation: Dp = AppBarDefaults.TopAppBarElevation
) {
    val context= LocalContext.current
    TopAppBar(

        navigationIcon = {
            IconButton(onClick = {showToast2(string = "Ir hacia atras", context = context) }) {
                Icon(imageVector = Icons.Filled.ArrowBack,
                    contentDescription = "Ir hacia atras",
                    tint = Color.White
                )
            }
        },
        title = {Text("Scaffold con Botones") },
        actions = {
            IconButton(onClick = { showToast2("Añadir a marcadores",context)
            }) {
                Icon(painter = painterResource(id = R.drawable.ic_bookmark),
                    contentDescription = "marcadores",
                    tint = Color.White
                )
            }
            IconButton(onClick = { showToast2("Compartir",context)
            }) {
                Icon(imageVector = Icons.Filled.Share,
                    contentDescription = "Compartir",
                    tint = Color.White
                )
            }

            IconButton(onClick = { showToast2("Ver mas", context)
            }) {
                Icon(imageVector = Icons.Filled.MoreVert,
                    contentDescription = "Ver más",
                    tint = Color.White
                )
            }
        },
        backgroundColor = backgroundColor,
        contentColor = contentColor,
        elevation = elevation

    )
}



@Composable
fun Botones(padding: PaddingValues, navController: NavController) {
    val scrollState = rememberScrollState()
    val lista: List <Botones> =listOf(
        Botones (stringResource(R.string.tabla_multiplicar)) { navController -> navController.navigate(route = Screens.TablaMultiplicar.route) },
        Botones (stringResource(R.string.ejemplo_columnas_1)) { navController -> navController.navigate(route = Screens.ComposeColumn1.route) },
        Botones (stringResource(R.string.ejemplo_columnas_2)) { navController -> navController.navigate(route = Screens.ComposeColumn2.route) },
        Botones (stringResource(R.string.ejemplo_filas_1)) { navController -> navController.navigate(route = Screens.ComposeRow1.route) },
        Botones (stringResource(R.string.ejemplo_column_in_box)) { navController -> navController.navigate(route = Screens.ComposeColumnInBox.route) },
        Botones (stringResource(R.string.ejemplo_compose_mix)) { navController -> navController.navigate(route = Screens.ComposeMix.route) },
        Botones (stringResource(R.string.ejemplo_botones_1)) { navController -> navController.navigate(route = Screens.ComposeBotones1.route) },
        Botones (stringResource(R.string.ejemplo_botones_2)) { navController -> navController.navigate(route = Screens.ComposeBotones2.route) },
        Botones (stringResource(R.string.ejemplo_botones_con_icono)) { navController -> navController.navigate(route = Screens.BotonesConIcono.route) },
        Botones (stringResource(R.string.calculadora_sumas)) { navController -> navController.navigate(route = Screens.CalculadoraSumas.route) },
        Botones (stringResource(R.string.calculadora_operaciones)) { navController -> navController.navigate(route = Screens.Calculadora.route) },
        Botones (stringResource(R.string.contador_state_hosting)) { navController -> navController.navigate(route = Screens.ContadorST.route) },
        Botones (stringResource(R.string.dado_livedata)) { navController -> navController.navigate(route = Screens.MainScreenDado.route) },
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(padding)
            .verticalScroll(scrollState),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        lista.forEach{item->
            MyButton(
                function = {item.onClick(navController)},
                texto = item.nombre,
                color=Color(Random.nextLong(0xFF000000, 0xFFFFFFFF)),
                elevacion = 12.dp,
                colorBorde=Color.Yellow,
                grosorBorde=3.dp,
                tamanhoTexto = 20.sp)

            EspacioH(espacio = 20)

        }




    }




}








