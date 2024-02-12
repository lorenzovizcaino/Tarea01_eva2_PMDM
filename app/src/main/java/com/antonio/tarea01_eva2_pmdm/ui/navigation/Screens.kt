package com.antonio.tarea01_eva2_pmdm.ui.navigation

sealed class Screens(val route:String){
    object Menu: Screens("initial_screen")//info a aparecer en pantalla

    object ComposeBotones1: Screens("ejBotones1")//info a aparecer en pantalla
    object ComposeBotones2: Screens("ejBotones2")//info a aparecer en pantalla
    object BotonesConIcono: Screens("ejBotones3")//info a aparecer en pantalla
    object CalculadoraSumas: Screens("ejCalculadoraSumas")//info a aparecer en pantalla
    object CalculadoraOperaciones: Screens("ejCalculadoraOperaciones")//info a aparecer en pantalla

}
