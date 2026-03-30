package com.example.seguimiento

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.navigation.NavigationView
import android.widget.Button
import androidx.drawerlayout.widget.DrawerLayout
import android.view.Gravity

class DrawerActivity2 : AppCompatActivity(),
    NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drawer2)

        val navView = findViewById<NavigationView>(R.id.nav_view)
        navView.setNavigationItemSelectedListener(this)


        val drawer = findViewById<DrawerLayout>(R.id.drawer_layout)
        val btn = findViewById<Button>(R.id.btnAbrir)

        btn.setOnClickListener {
            drawer.openDrawer(Gravity.LEFT)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {

            R.id.nav_segunda -> {
                startActivity(Intent(this, SegundaActividad::class.java))
            }

            R.id.nav_conversion -> {
                startActivity(Intent(this, ConversionActivity::class.java))
            }
        }

        return true
    }
}