package com.antonio.tarea01_eva2_pmdm.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.antonio.tarea01_eva2_pmdm.ui.screens.BotonesConIcono
import com.antonio.tarea01_eva2_pmdm.ui.screens.CalculadoraOperaciones
import com.antonio.tarea01_eva2_pmdm.ui.screens.CalculadoraSumas
import com.antonio.tarea01_eva2_pmdm.ui.screens.ComposeBotones1
import com.antonio.tarea01_eva2_pmdm.ui.screens.ComposeBotones2
import com.antonio.tarea01_eva2_pmdm.ui.screens.Menu

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = Screens.Menu.route) {
        //pantalla principal con la navegación
        composable(route = Screens.Menu.route) { Menu(navController) }//Nombre del fichero .kt al que navegar
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
        composable(route = Screens.CalculadoraOperaciones.route) {
            CalculadoraOperaciones() //Nombre de la función composable a la que navegar
        }

    }
}