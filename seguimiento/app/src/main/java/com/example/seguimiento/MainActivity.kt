package com.example.seguimiento

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.seguimiento.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d(TAG, "onCreate")

        // Botón SegundaActividad
        binding.btnMostrar.setOnClickListener {
            val intent = Intent(this, SegundaActividad::class.java)
            startActivity(intent)
        }

        // Botón ConversionActivity
        val btnConversion = findViewById<Button>(R.id.btnConversion)

        btnConversion.setOnClickListener {
            val intent = Intent(this, ConversionActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart()   { super.onStart();   Log.d(TAG, "onStart") }
    override fun onRestart(){ super.onRestart(); Log.d(TAG, "onRestart") }
    override fun onResume() { super.onResume();  Log.d(TAG, "onResume") }
    override fun onPause()  { super.onPause();   Log.d(TAG, "onPause") }
    override fun onStop()   { super.onStop();    Log.d(TAG, "onStop") }
    override fun onDestroy(){ super.onDestroy(); Log.d(TAG, "onDestroy") }
}