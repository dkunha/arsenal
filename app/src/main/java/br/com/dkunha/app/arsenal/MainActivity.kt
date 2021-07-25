package br.com.dkunha.app.arsenal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.dkunha.lib.arsenal.utils.Teste

class MainActivity : AppCompatActivity() {
    private val t = Teste()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        t.variavel
    }
}