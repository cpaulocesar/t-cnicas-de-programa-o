package br.edu.fatecpg.calculo

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val tensao: EditText = findViewById(R.id.edtTensao)
        val resistencia: EditText = findViewById(R.id.edtResistencia)
        val corrente: EditText = findViewById(R.id.edtCorrente)
        val btn: Button = findViewById(R.id.btnCalcular)
        val text: TextView = findViewById(R.id.txtResultado)

        btn.setOnClickListener {
            val calcTensao = tensao.text.toString().toDoubleOrNull()
            val calcResistencia = resistencia.text.toString().toDoubleOrNull()
            val calcCorrente = corrente.text.toString().toDoubleOrNull()

            when {
                calcTensao == null && calcResistencia != null && calcCorrente != null -> {
                    val resultado = calcCorrente * calcResistencia
                    text.text = "Tensão: $resultado V"
                }
                calcResistencia == null && calcTensao != null && calcCorrente != null -> {
                    val resultado = calcTensao / calcCorrente
                    text.text = "Resistência: $resultado Ω"
                }
                calcCorrente == null && calcTensao != null && calcResistencia != null -> {
                    val resultado = calcTensao / calcResistencia
                    text.text = "Corrente: $resultado A"
                }
                else -> {
                    Toast.makeText(this, "Preencha ao menos 2 campos! .", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}