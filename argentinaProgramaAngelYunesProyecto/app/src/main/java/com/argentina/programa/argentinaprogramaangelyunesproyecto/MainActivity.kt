package com.argentina.programa.argentinaprogramaangelyunesproyecto

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var editText1: EditText
    private lateinit var editText2: EditText
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        editText1 = findViewById(R.id.editText1)
        editText2 = findViewById(R.id.editText2)
        val buttonCompare = findViewById<Button>(R.id.buttonCompare)
        val textResult = findViewById<TextView>(R.id.textResult)

        buttonCompare.setOnClickListener {
            val frase1 = editText1.text.toString()
            val frase2 = editText2.text.toString()
            val resultado = viewModel.compararFrases(frase1, frase2)
            textResult.text = resultado
        }
    }
}