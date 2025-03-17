package br.edu.fatecpg.cadastrodealunos

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MatriculaActivity : AppCompatActivity(R.layout.activity_matricula) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val txtNomeAluno: TextView = findViewById(R.id.txtNomeAluno)
        val txtMatricula: TextView = findViewById(R.id.txtMatricula)
        val btnGerarMatricula: Button = findViewById(R.id.btnGerarMatricula)

        val nomeAluno = intent.getStringExtra("nomeAluno")
        txtNomeAluno.text = "Aluno: $nomeAluno"

        btnGerarMatricula.setOnClickListener {
            val matricula = Random.nextInt(0, 99999)
            txtMatricula.text = "Matrícula: $matricula"
        }
    }
}