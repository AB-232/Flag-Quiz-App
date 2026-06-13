package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editTextNameInput: EditText
    private lateinit var startButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextNameInput = findViewById(R.id.editTextInputName)
        startButton = findViewById(R.id.startButton)

        startButton.setOnClickListener {
            val name = editTextNameInput.text.toString()
            if (name.isNotBlank()) {
                // Send name and navigate to QuestionsActivity
                Intent(this@MainActivity, QuestionsActivity::class.java).also {
                    it.putExtra(Constants.NAME_MSG, name)
                    // Destroy this activity
                    startActivity(it)
                    finish()
                }

            } else Toast.makeText(this@MainActivity, "Please Enter your name", Toast.LENGTH_SHORT).show()
        }
    }
}