package com.example.seguimiento

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ConversionActivity : AppCompatActivity() {
    lateinit var etMonto: EditText
    lateinit var tvResultado: TextView
    lateinit var btnConvertir: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversion)

        etMonto = findViewById(R.id.etMonto)
        tvResultado = findViewById(R.id.tvResultado)
        btnConvertir = findViewById(R.id.btnConvertir)

        btnConvertir.setOnClickListener {

            if (etMonto.text.toString().isEmpty()) {
                etMonto.error = "Ingrese monto"
                return@setOnClickListener
            }

            val monto = etMonto.text.toString().toDouble()
            val resultado = monto * 3.8

            tvResultado.text = "S/ $resultado"
        }
    }
}