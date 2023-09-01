package com.argentina.programa.argentinaprogramaangelyunesproyecto

import org.junit.Assert.assertEquals
import org.junit.Test

class MainViewModelTest {

    @Test
    fun testCompararFrases() {
        val viewModel = MainViewModel()
        val resultado = viewModel.compararFrases("Hola, mundo", "Hola, mundo")
        assertEquals("Las frases son iguales.", resultado)
    }
}
