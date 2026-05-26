package com.example.calculadoraapp

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtNumero1 = findViewById<EditText>(R.id.edtNumero1)
        val edtNumero2 = findViewById<EditText>(R.id.edtNumero2)

        val edtNota1 = findViewById<EditText>(R.id.edtNota1)
        val edtPeso1 = findViewById<EditText>(R.id.edtPeso1)

        val edtNota2 = findViewById<EditText>(R.id.edtNota2)
        val edtPeso2 = findViewById<EditText>(R.id.edtPeso2)

        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        val btnSomar = findViewById<Button>(R.id.btnSomar)
        val btnSubtrair = findViewById<Button>(R.id.btnSubtrair)
        val btnMultiplicar = findViewById<Button>(R.id.btnMultiplicar)
        val btnDividir = findViewById<Button>(R.id.btnDividir)
        val btnMedia = findViewById<Button>(R.id.btnMedia)

        btnSomar.setOnClickListener {

            val n1 = edtNumero1.text.toString().toDouble()
            val n2 = edtNumero2.text.toString().toDouble()

            txtResultado.text = "Resultado: ${n1 + n2}"
        }

        btnSubtrair.setOnClickListener {

            val n1 = edtNumero1.text.toString().toDouble()
            val n2 = edtNumero2.text.toString().toDouble()

            txtResultado.text = "Resultado: ${n1 - n2}"
        }

        btnMultiplicar.setOnClickListener {

            val n1 = edtNumero1.text.toString().toDouble()
            val n2 = edtNumero2.text.toString().toDouble()

            txtResultado.text = "Resultado: ${n1 * n2}"
        }

        btnDividir.setOnClickListener {

            val n1 = edtNumero1.text.toString().toDouble()
            val n2 = edtNumero2.text.toString().toDouble()

            txtResultado.text = "Resultado: ${n1 / n2}"
        }

        btnMedia.setOnClickListener {

            val nota1 = edtNota1.text.toString().toDouble()
            val peso1 = edtPeso1.text.toString().toDouble()

            val nota2 = edtNota2.text.toString().toDouble()
            val peso2 = edtPeso2.text.toString().toDouble()

            val media =
                ((nota1 * peso1) + (nota2 * peso2)) /
                        (peso1 + peso2)

            txtResultado.text = "Média Ponderada: $media"
        }
    }
}