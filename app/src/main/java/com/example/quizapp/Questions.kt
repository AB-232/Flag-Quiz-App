package com.example.quizapp

// Make Question class (Model class for quiz questions)
data class Question(
    val questionText: String,
    val answerOneText: String,
    val answerTwoText: String,
    val answerThreeText: String,
    val answerFourText: String,
    val numOfCorrectAns: Int,
    val flagPhoto: Int
)


object Constants {

    //ID to use In Intent
    const val NAME_MSG = "NAME"
    const val SCORE_MSG = "SCORE"
    const val TOTAL_QUESTION_MSG = "NUM"

    //List of 30 Questions
    //You can add more
    val questionsList = listOf(
        Question(
            "Guess the country from its flag",
            "Italy",
            "Egypt",
            "Tunisia",
            "Sudan",
            2,
            R.drawable.egypt
        ),
        Question(
            "Guess the country from its flag",
            "Indonesia",
            "France",
            "Germany",
            "Italy",
            4,
            R.drawable.italy
        ),
        Question(
            "Guess the country from its flag",
            "Jordan",
            "Somalia",
            "Morocco",
            "Algeria",
            2,
            R.drawable.somalia
        ),
        Question(
            "Guess the country from its flag",
            "Tunisia",
            "Indonesia",
            "Lebanon",
            "Syria",
            2,
            R.drawable.indonesia
        ),
        Question(
            "Guess the country from its flag",
            "Qatar",
            "Kuwait",
            "Bahrain",
            "Oman",
            3,
            R.drawable.bahrain
        ),
        Question(
            "Guess the country from its flag",
            "Nepal",
            "Bhutan",
            "India",
            "Bangladesh",
            2,
            R.drawable.bhutan
        ),
        Question(
            "Guess the country from its flag",
            "Maldives",
            "Mauritius",
            "Seychelles",
            "Fiji",
            3,
            R.drawable.seychelles
        ),
        Question(
            "Guess the country from its flag",
            "Eswatini",
            "Lesotho",
            "Botswana",
            "Namibia",
            2,
            R.drawable.lesotho
        ),
        Question(
            "Guess the country from its flag",
            "Mali",
            "Niger",
            "Chad",
            "Senegal",
            3,
            R.drawable.chad
        ),
        Question(
            "Guess the country from its flag",
            "Chile",
            "Peru",
            "Argentina",
            "Bolivia",
            2,
            R.drawable.peru
        ),
        Question(
            "Guess the country from its flag",
            "Argentina",
            "Mexico",
            "Chile",
            "Brazil",
            4,
            R.drawable.brazil
        ),
        Question(
            "Guess the country from its flag",
            "Australia",
            "Canada",
            "New Zealand",
            "United Kingdom",
            2,
            R.drawable.canada
        ),
        Question(
            "Guess the country from its flag",
            "Vietnam",
            "Japan",
            "China",
            "South Korea",
            3,
            R.drawable.china
        ),
        Question(
            "Guess the country from its flag",
            "Bangladesh",
            "South Korea",
            "China",
            "Japan",
            4,
            R.drawable.japan
        ),
        Question(
            "Guess the country from its flag",
            "Germany",
            "Belgium",
            "France",
            "Austria",
            1,
            R.drawable.germany
        ),
        Question(
            "Guess the country from its flag",
            "Serbia",
            "Russia",
            "Slovakia",
            "Slovenia",
            2,
            R.drawable.russia
        ),
        Question(
            "Guess the country from its flag",
            "Tunisia",
            "Morocco",
            "Turkey",
            "Algeria",
            3,
            R.drawable.turkey
        ),
        Question(
            "Guess the country from its flag",
            "Saudi Arabia",
            "Iran",
            "Afghanistan",
            "Pakistan",
            4,
            R.drawable.pakistan
        ),
        Question(
            "Guess the country from its flag",
            "Saudi Arabia",
            "Pakistan",
            "Iran",
            "Iraq",
            1,
            R.drawable.saudi_arabia
        ),
        Question(
            "Guess the country from its flag",
            "Kenya",
            "Nigeria",
            "South Africa",
            "Ghana",
            3,
            R.drawable.south_africa
        ),
        Question(
            "Guess the country from its flag",
            "Ghana",
            "Nigeria",
            "Kenya",
            "Cameroon",
            2,
            R.drawable.nigeria
        ),
        Question(
            "Guess the country from its flag",
            "Italy",
            "Hungary",
            "Mexico",
            "Iran",
            3,
            R.drawable.mexico
        ),
        Question(
            "Guess the country from its flag",
            "Uruguay",
            "Paraguay",
            "Guatemala",
            "Argentina",
            4,
            R.drawable.argentina
        ),
        Question(
            "Guess the country from its flag",
            "Spain",
            "Portugal",
            "Romania",
            "Andorra",
            1,
            R.drawable.spain
        ),
        Question(
            "Guess the country from its flag",
            "Spain",
            "Portugal",
            "Brazil",
            "Italy",
            2,
            R.drawable.portugal
        ),
        Question(
            "Guess the country from its flag",
            "New Zealand",
            "United Kingdom",
            "Australia",
            "Canada",
            3,
            R.drawable.australia
        ),
        Question(
            "Guess the country from its flag",
            "Australia",
            "Fiji",
            "Samoa",
            "New Zealand",
            4,
            R.drawable.new_zealand
        ),
        Question(
            "Guess the country from its flag",
            "South Korea",
            "Japan",
            "China",
            "Vietnam",
            1,
            R.drawable.south_korea
        ),
        Question(
            "Guess the country from its flag",
            "Sweden",
            "Ukraine",
            "Kazakhstan",
            "Romania",
            2,
            R.drawable.ukraine
        ),
        Question(
            "Guess the country from its flag",
            "Niger",
            "Ireland",
            "India",
            "Ivory Coast",
            3,
            R.drawable.india
        )
    )
}
