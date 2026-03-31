package com.example.seguimiento2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ConversionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversion)

        val input = findViewById<EditText>(R.id.etNumero)
        val btnConvertir = findViewById<Button>(R.id.btnConvertir)
        val resultado = findViewById<TextView>(R.id.tvResultado)

        btnConvertir.setOnClickListener {
            val numero = input.text.toString().toDoubleOrNull()

            if (numero != null) {
                val convertido = numero * 3.78  // ejemplo: dólares a soles
                resultado.text = "Resultado: $convertido"
            } else {
                resultado.text = "Ingrese un número válido"
            }
        }
    }
}