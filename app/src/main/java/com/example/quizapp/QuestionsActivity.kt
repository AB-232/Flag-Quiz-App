package com.example.quizapp

import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class QuestionsActivity : AppCompatActivity() {

    private lateinit var textViewQuestionText: TextView
    private lateinit var flagImageView: ImageView
    private lateinit var progressBar: ProgressBar
    private lateinit var textViewCurrentQuestionTracker: TextView
    private lateinit var answer1: TextView
    private lateinit var answer2: TextView
    private lateinit var answer3: TextView
    private lateinit var answer4: TextView
    private lateinit var checkButton: Button
    private lateinit var nextButton: Button
    private lateinit var finishButton: Button

    private var currentQuestion = 1
    private var correctAnswerNum = 0
    private var selectedAnswerNum = 0
    private var score = 0
    private lateinit var listOfAnswers: List<TextView>
    private val listOfUsedQuestions = mutableListOf<Question>()
    private val listOfQuestion = Constants.questionsList


    // App Is flexible you can change number of questions here
    // Set number of questions (1 to 30)
    private val numOfQuestions = 10


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        textViewQuestionText = findViewById(R.id.textViewQuestionText)
        flagImageView = findViewById(R.id.flagPhoto)
        progressBar = findViewById(R.id.progressBar)
        textViewCurrentQuestionTracker = findViewById(R.id.textViewTracker)
        answer1 = findViewById(R.id.answerOne)
        answer2 = findViewById(R.id.answerTwo)
        answer3 = findViewById(R.id.answerThree)
        answer4 = findViewById(R.id.answerFour)
        checkButton = findViewById(R.id.checkButton)
        nextButton = findViewById(R.id.nextButton)
        finishButton = findViewById(R.id.finishButton)

        listOfAnswers = listOf(
            answer1,
            answer2,
            answer3,
            answer4
        )


        // Setup Progress Bar
        progressBar.max = numOfQuestions
        progressBar.progress = currentQuestion
        textViewCurrentQuestionTracker.text = "$currentQuestion / $numOfQuestions"


        // Load first question
        fill(getRandomQuestion())

        // Handle all answer clicks
        answer1.setOnClickListener {
            selectedAnswerNum = 1
            selectedAnswer()

        }

        answer2.setOnClickListener {
            selectedAnswerNum = 2
            selectedAnswer()

        }

        answer3.setOnClickListener {
            selectedAnswerNum = 3
            selectedAnswer()

        }

        answer4.setOnClickListener {
            selectedAnswerNum = 4
            selectedAnswer()

        }


        checkButton.setOnClickListener {
            // Make sure user select option
            if (selectedAnswerNum == 0) Toast.makeText(
                this@QuestionsActivity,
                "Please choose Answer !",
                Toast.LENGTH_SHORT
            ).show()
            else checkButtonFun()
        }

        nextButton.setOnClickListener { nextButtonFun() }

        finishButton.setOnClickListener { finishButtonFun() }


    }

    private fun fill(question: Question) {
        // Update text of Current Question
        textViewCurrentQuestionTracker.text = "$currentQuestion / $numOfQuestions"

        // Get question's data and put It In GUI
        correctAnswerNum = question.numOfCorrectAns
        textViewQuestionText.text = question.questionText
        answer1.text = question.answerOneText
        answer2.text = question.answerTwoText
        answer3.text = question.answerThreeText
        answer4.text = question.answerFourText
        flagImageView.setImageResource(question.flagPhoto)

    }

    private fun checkButtonFun() {
        // Make If user press check he will become can't change answer
        listOfAnswers.forEach {
            it.isClickable = false
        }

        // Simple logic to color answer green and Increase score (If he select right answer)
        // Or color answer red and color right answer green (If he select wrong answer)
        if (selectedAnswerNum == correctAnswerNum) {
            score++
            colorCorrectAnswer(listOfAnswers[selectedAnswerNum - 1])
        } else {
            colorCorrectAnswer(listOfAnswers[correctAnswerNum - 1])
            colorWrongAnswer(listOfAnswers[selectedAnswerNum - 1])

        }

        // Show next or finish button depending on progress
        checkButton.visibility = View.INVISIBLE
        if (currentQuestion < numOfQuestions) nextButton.visibility = View.VISIBLE
        else finishButton.visibility = View.VISIBLE

    }

    private fun nextButtonFun() {
        // Update progress bar and current question
        progressBar.progress++
        currentQuestion++

        // Reset all buttons and variables
        reset()

        //Refill with new question
        fill(getRandomQuestion())

        // Hide next button and show check button
        nextButton.visibility = View.INVISIBLE
        checkButton.visibility = View.VISIBLE
    }

    private fun getRandomQuestion(): Question {
        // Get random question from list of questions
        var newQuestion = listOfQuestion.random()
        // Ensure question is not repeated
        while (newQuestion in listOfUsedQuestions) newQuestion = listOfQuestion.random()
        // Add question to list of used questions
        listOfUsedQuestions.add(newQuestion)
        return newQuestion


    }

    private fun finishButtonFun() {
        // Receive name from first page
        val nameFromPage1 = intent?.getStringExtra(Constants.NAME_MSG) ?: ""

        // Navigate to ResultActivity with score data
        Intent(this@QuestionsActivity, ResultActivity::class.java).also {
            // Pass name, score, and total questions
            it.putExtra(Constants.NAME_MSG, nameFromPage1)
            it.putExtra(Constants.SCORE_MSG, score)
            it.putExtra(Constants.TOTAL_QUESTION_MSG, numOfQuestions)
            // Destroy this activity
            startActivity(it)
            finish()
        }
    }

    private fun reset() {
        // Reset button background , font and color and make it clickable
        listOfAnswers.forEach {
            it.setBackgroundResource(R.drawable.default_button_bg)
            it.typeface = Typeface.DEFAULT
            it.setTextColor(getColor(R.color.dark_gray))
            it.isClickable = true
        }

        // Reset check logic's variables
        correctAnswerNum = 0
        selectedAnswerNum = 0
    }

    private fun selectedAnswer() {

        // Get selected answer
        val selectedAnswer = listOfAnswers[selectedAnswerNum - 1]

        // Reset all buttons to default
        // Make this step because user can change answer before check //
        // If we don't make this step when user change answer the first answer selected will be selected //
        listOfAnswers.forEach {
            it.setBackgroundResource(R.drawable.default_button_bg)
            it.typeface = Typeface.DEFAULT
            it.setTextColor(getColor(R.color.dark_gray))
        }

        // Highlight selected answer
        selectedAnswer.setBackgroundResource(R.drawable.selected_button_bg)
        selectedAnswer.setTextColor(getColor(R.color.black))
        selectedAnswer.setTypeface(selectedAnswer.typeface, Typeface.BOLD)
    }

    private fun colorCorrectAnswer(answer: TextView) {

        // Make sure all answers font are default
        listOfAnswers.forEach {
            it.typeface = Typeface.DEFAULT
        }

        // Make right answer with green color and black and bold font
        answer.setBackgroundResource(R.drawable.correct_answer_bg)
        answer.setTextColor(getColor(R.color.black))
        answer.setTypeface(answer.typeface, Typeface.BOLD)

    }

    private fun colorWrongAnswer(answer: TextView) {

        // Make wrong answer with red color and white font
        answer.setBackgroundResource(R.drawable.wrong_answer_bg)
        answer.setTextColor(getColor(R.color.white))
    }
}