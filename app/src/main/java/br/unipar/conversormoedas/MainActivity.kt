package br.unipar.conversormoedas

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextValor =  findViewById<EditText>(R.id.editDolar)
        val editTextTaxa =   findViewById<EditText>(R.id.editConversao)
        val btnConverter =   findViewById<Button>(R.id.btnConverter)
        val labelResultado = findViewById<TextView>(R.id.labelResultado)

        btnConverter.setOnClickListener {
            val valorStr = editTextValor.text.toString()
            val taxaStr = editTextTaxa.text.toString()

            if (valorStr.isNotEmpty() and taxaStr.isNotEmpty()) {
                val resultado = valorStr.toFloat() * taxaStr.toFloat()
                labelResultado.text = "Resultado: R$$resultado"
            } else {
                labelResultado.text = "Insira valores válidos"
            }
        }
    }
}
