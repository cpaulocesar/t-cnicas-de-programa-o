package br.edu.fatecpg.livros

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val autor:EditText = findViewById(R.id.edtAutor)
        val livro:EditText = findViewById(R.id.edtNome)
        val btn:Button = findViewById(R.id.btnCadastrar)

        btn.setOnClickListener(){
            val intent = Intent(this, LivroActivity::class.java)
            intent.putExtra("autor", autor.text.toString())
            intent.putExtra("livro", livro.text.toString())
            startActivity(intent)
        }
    }
}