package com.argentina.programa.argentinaprogramaangelyunesproyecto


import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.test.*
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@OptIn(kotlinx.coroutines.ExperimentalCoroutinesApi::class)
class MainViewModelUnitTest {

    private lateinit var viewModel: MainViewModel

    @get:Rule
    val instantTaskRule = InstantTaskExecutorRule()
    private val dispatcher = TestCoroutineDispatcher()

    @Before
    fun setup() {
        Dispatchers.setMain(dispatcher)
        viewModel = MainViewModel()
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
        dispatcher.cleanupTestCoroutines()
    }

    @Test
    fun mainViewModel_ComparePhrases() = dispatcher.runBlockingTest {
        val phrase1 = "Hello, world"
        val phrase2 = "Hello, world"
        val result = viewModel.compararFrases(phrase1, phrase2)
        assertEquals("Las frases son iguales.", result)
    }
    @Test
    fun mainViewModel_ComparePhrases_NotEqual() = dispatcher.runBlockingTest {
        val phrase1 = "Hello, world"
        val phrase2 = "Hola, mundo"  // Frase diferente
        val result = viewModel.compararFrases(phrase1, phrase2)
        assertEquals("Las frases son diferentes.", result)
    }
}
