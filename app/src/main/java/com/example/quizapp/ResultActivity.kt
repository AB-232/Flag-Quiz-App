package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {

    private lateinit var textViewName : TextView
    private lateinit var textViewScoreMsg : TextView
    private lateinit var finishAndReplayButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        textViewName = findViewById(R.id.textViewName)
        textViewScoreMsg = findViewById(R.id.textViewScoreMsg)
        finishAndReplayButton = findViewById(R.id.finishAndReplayButton)

        // Receive data from QuestionsActivity
        val name = intent?.getStringExtra(Constants.NAME_MSG) ?: ""
        val score = intent.getIntExtra(Constants.SCORE_MSG , 0)
        val numOfQuestion = intent.getIntExtra(Constants.TOTAL_QUESTION_MSG,0)

        // Show name and score in screen
        textViewName.text = name
        textViewScoreMsg.text = "Your score is $score out of $numOfQuestion"

        finishAndReplayButton.setOnClickListener {
            // Restart quiz and return to MainActivity
            Intent(this@ResultActivity , MainActivity::class.java).also {
                // Destroy this activity
                startActivity(it)
                finish()
            }
        }

    }
}