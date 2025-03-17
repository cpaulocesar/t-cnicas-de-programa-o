package br.edu.fatecpg.livros

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class LivroActivity : AppCompatActivity(R.layout.activity_livro) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val txtLivro:TextView = findViewById(R.id.txtLivro)
        val txtAutor:TextView = findViewById(R.id.txtAutor)
        val fab:FloatingActionButton = findViewById(R.id.fabSair)
        val autor = intent.getStringExtra("autor")
        val livro = intent.getStringExtra("livro")

        txtLivro.text = "Livro: ${livro.toString()}"
        txtAutor.text = "Autor: ${autor.toString()}"
        fab.setOnClickListener(){
            finish()
        }
    }
}