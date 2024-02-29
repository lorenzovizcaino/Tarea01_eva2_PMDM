package com.antonio.tarea01_eva2_pmdm.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.antonio.tarea01_eva2_pmdm.ui.screens.BotonesConIcono
import com.antonio.tarea01_eva2_pmdm.ui.screens.Calculadora

import com.antonio.tarea01_eva2_pmdm.ui.screens.CalculadoraSumas
import com.antonio.tarea01_eva2_pmdm.ui.screens.ComposeBotones1
import com.antonio.tarea01_eva2_pmdm.ui.screens.ComposeBotones2
import com.antonio.tarea01_eva2_pmdm.ui.screens.ComposeColumn1
import com.antonio.tarea01_eva2_pmdm.ui.screens.ComposeColumn2
import com.antonio.tarea01_eva2_pmdm.ui.screens.ComposeColumnInBox
import com.antonio.tarea01_eva2_pmdm.ui.screens.ComposeMix
import com.antonio.tarea01_eva2_pmdm.ui.screens.ComposeRow1
import com.antonio.tarea01_eva2_pmdm.ui.screens.ContadorST
import com.antonio.tarea01_eva2_pmdm.ui.screens.MainScreenDado
import com.antonio.tarea01_eva2_pmdm.ui.screens.Menu
import com.antonio.tarea01_eva2_pmdm.ui.screens.TablaMultiplicar

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = Screens.Menu.route) {
        //pantalla principal con la navegación
        composable(route = Screens.Menu.route) { Menu(navController) }//Nombre del fichero .kt al que navegar

        composable(route = Screens.TablaMultiplicar.route) {
            TablaMultiplicar() //Nombre de la función composable a la que navegar
        }
        composable(route = Screens.ComposeColumn1.route) {
            ComposeColumn1() //Nombre de la función composable a la que navegar
        }
        composable(route = Screens.ComposeColumn2.route) {
            ComposeColumn2() //Nombre de la función composable a la que navegar
        }
        composable(route = Screens.ComposeRow1.route) {
            ComposeRow1() //Nombre de la función composable a la que navegar
        }
        composable(route = Screens.ComposeColumnInBox.route) {
            ComposeColumnInBox() //Nombre de la función composable a la que navegar
        }
        composable(route = Screens.ComposeMix.route) {
            ComposeMix() //Nombre de la función composable a la que navegar
        }
        composable(route = Screens.ComposeBotones1.route) {
            ComposeBotones1() //Nombre de la función composable a la que navegar
        }
        composable(route = Screens.ComposeBotones2.route) {
            ComposeBotones2() //Nombre de la función composable a la que navegar
        }
        composable(route = Screens.BotonesConIcono.route) {
            BotonesConIcono() //Nombre de la función composable a la que navegar
        }
        composable(route = Screens.CalculadoraSumas.route) {
            CalculadoraSumas() //Nombre de la función composable a la que navegar
        }
        composable(route = Screens.Calculadora.route) {
            Calculadora() //Nombre de la función composable a la que navegar
        }
        composable(route = Screens.ContadorST.route) {
            ContadorST() //Nombre de la función composable a la que navegar
        }
        composable(route = Screens.MainScreenDado.route) {
            MainScreenDado() //Nombre de la función composable a la que navegar
        }

    }
}