package com.argentina.programa.argentinaprogramaangelyunesproyecto

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    fun compararFrases(frase1: String, frase2: String): String {
        return if (frase1 == frase2) {
            "Las frases son iguales."
        } else {
            "Las frases son diferentes."
        }
    }
}