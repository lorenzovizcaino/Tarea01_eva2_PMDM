package com.antonio.tarea01_eva2_pmdm.ui.navigation

sealed class Screens(val route:String){
    object Menu: Screens("initial_screen")//info a aparecer en pantalla


    object TablaMultiplicar: Screens("tablaMultiplicar")//info a aparecer en pantalla
    object ComposeColumn1: Screens("ejColumn1")//info a aparecer en pantalla
    object ComposeColumn2: Screens("ejColumn2")//info a aparecer en pantalla
    object ComposeRow1: Screens("ejRow1")//info a aparecer en pantalla
    object ComposeColumnInBox: Screens("ejColumnInBox")//info a aparecer en pantalla
    object ComposeMix: Screens("ejMix")//info a aparecer en pantalla
    object ComposeBotones1: Screens("ejBotones1")//info a aparecer en pantalla
    object ComposeBotones2: Screens("ejBotones2")//info a aparecer en pantalla
    object BotonesConIcono: Screens("ejBotones3")//info a aparecer en pantalla
    object CalculadoraSumas: Screens("ejCalculadoraSumas")//info a aparecer en pantalla
    object Calculadora: Screens("ejCalculadoraOperaciones")//info a aparecer en pantalla
    object ContadorST: Screens("ejContadorStateHosting")//info a aparecer en pantalla
    object MainScreenDado: Screens("ejContadorStateHosting")//info a aparecer en pantalla

}
