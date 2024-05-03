package com.example.sumasapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt_numero1: TextView = findViewById(R.id.editTxt_num1)
        val txt_numero2: TextView = findViewById(R.id.editTxt_num2)
        val btn_calcular: Button = findViewById(R.id.btn_calcular)
        val txt_resultado: TextView = findViewById(R.id.text_resultado)

        btn_calcular.setOnClickListener {
            val Resultado = sumar(txt_numero1.text.toString().toInt(), txt_numero2.text.toString().toInt())
            txt_resultado.text = Resultado
        }
    }

    //Función Calcular
    fun sumar(numero1:Int, numero2: Int): String{
        Toast.makeText(this, "Sumando", Toast.LENGTH_SHORT).show()
        val suma:Int = numero1 + numero2
        return suma.toString()
    }
}