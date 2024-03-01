package com.antonio.tarea01_eva2_pmdm.ui.miscompose

import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.Composable

@Composable
fun showToast(string: String, context: Context) {

    Toast.makeText(context, string, Toast.LENGTH_SHORT).show()

}