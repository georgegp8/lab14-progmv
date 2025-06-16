package com.example.lab14

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class WorkActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work)

        // Botón "Iniciar tarea"
        findViewById<Button>(R.id.btn_start_task).setOnClickListener {
            Toast.makeText(this, "Tarea iniciada correctamente.", Toast.LENGTH_SHORT).show()
        }

        // Botón "Volver al inicio"
        findViewById<Button>(R.id.btn_volver).setOnClickListener {
            finish() // Cierra esta actividad
        }
    }
}