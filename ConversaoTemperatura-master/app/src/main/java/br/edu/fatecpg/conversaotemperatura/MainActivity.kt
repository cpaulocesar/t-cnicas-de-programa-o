package br.edu.fatecpg.conversaotemperatura

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val temperatura:EditText = findViewById(R.id.edtText_temp)
        val btn:Button = findViewById(R.id.btnCalcular)
        val text:TextView = findViewById(R.id.txtView)

        btn.setOnClickListener {
            val tempCelsius = temperatura.text.toString()
            if (tempCelsius.isNotEmpty()) {
                val tempFah = (tempCelsius.toDouble() * 9/5) + 32
                text.text = "A temperatura inserida foi: $tempCelsius °C e em Fahrenheit foi $tempFah"
            } else {
                text.text = "Por favor, insira um valor válido."
            }
        }
    }
}