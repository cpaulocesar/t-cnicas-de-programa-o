package br.edu.fatecpg.cadastrodealunos

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val nomeAluno: EditText = findViewById(R.id.edtNomeAluno)
        val btnCadastrar: Button = findViewById(R.id.btnCadastrar)

        btnCadastrar.setOnClickListener {
            val intent = Intent(this, MatriculaActivity::class.java)
            intent.putExtra("nomeAluno", nomeAluno.text.toString())
            startActivity(intent)
        }
    }
}