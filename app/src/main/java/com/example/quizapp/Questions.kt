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
            "Afghanistan",
            "Australia",
            "India",
            "Guatemala",
            1,
            R.drawable.afghanistan
        ),
        Question(
            "Guess the country from its flag",
            "Congo",
            "Albania",
            "Cameroon",
            "Tuvalu",
            2,
            R.drawable.albania
        ),
        Question(
            "Guess the country from its flag",
            "Algeria",
            "Slovenia",
            "Mongolia",
            "Azerbaijan",
            1,
            R.drawable.algeria
        ),
        Question(
            "Guess the country from its flag",
            "Andorra",
            "Burkina Faso",
            "France",
            "Germany",
            1,
            R.drawable.andorra
        ),
        Question(
            "Guess the country from its flag",
            "Angola",
            "Sao Tome and Principe",
            "Eritrea",
            "Venezuela",
            1,
            R.drawable.angola
        ),
        Question(
            "Guess the country from its flag",
            "Gabon",
            "Nauru",
            "Slovakia",
            "Argentina",
            4,
            R.drawable.argentina
        ),
        Question(
            "Guess the country from its flag",
            "Albania",
            "Cyprus",
            "Armenia",
            "United States",
            3,
            R.drawable.armenia
        ),
        Question(
            "Guess the country from its flag",
            "Latvia",
            "Indonesia",
            "Cuba",
            "Australia",
            4,
            R.drawable.australia
        ),
        Question(
            "Guess the country from its flag",
            "Laos",
            "Austria",
            "Cameroon",
            "Burkina Faso",
            2,
            R.drawable.austria
        ),
        Question(
            "Guess the country from its flag",
            "Burundi",
            "Libya",
            "Lebanon",
            "Azerbaijan",
            4,
            R.drawable.azerbaijan
        ),
        Question(
            "Guess the country from its flag",
            "Bangladesh",
            "Zambia",
            "Bahamas",
            "New Zealand",
            3,
            R.drawable.bahamas
        ),
        Question(
            "Guess the country from its flag",
            "Bahrain",
            "Malawi",
            "Brazil",
            "Samoa",
            1,
            R.drawable.bahrain
        ),
        Question(
            "Guess the country from its flag",
            "Sweden",
            "Sudan",
            "Bangladesh",
            "Liechtenstein",
            3,
            R.drawable.bangladesh
        ),
        Question(
            "Guess the country from its flag",
            "Uzbekistan",
            "Belarus",
            "Bolivia",
            "Bahrain",
            2,
            R.drawable.belarus
        ),
        Question(
            "Guess the country from its flag",
            "Ireland",
            "Belgium",
            "Brazil",
            "Germany",
            2,
            R.drawable.belgium
        ),
        Question(
            "Guess the country from its flag",
            "Belize",
            "Malaysia",
            "Indonesia",
            "Netherlands",
            1,
            R.drawable.belize
        ),
        Question(
            "Guess the country from its flag",
            "Czech Republic",
            "Luxembourg",
            "Benin",
            "Liberia",
            3,
            R.drawable.benin
        ),
        Question(
            "Guess the country from its flag",
            "Turkey",
            "Bhutan",
            "Hungary",
            "Uruguay",
            2,
            R.drawable.bhutan
        ),
        Question(
            "Guess the country from its flag",
            "Bolivia",
            "South Sudan",
            "Syria",
            "Djibouti",
            1,
            R.drawable.bolivia
        ),
        Question(
            "Guess the country from its flag",
            "Czech Republic",
            "Bosnia and Herzegovina",
            "Nicaragua",
            "Malaysia",
            2,
            R.drawable.bosnia_and_herzegovina
        ),
        Question(
            "Guess the country from its flag",
            "Tajikistan",
            "United Arab Emirates",
            "Botswana",
            "San Marino",
            3,
            R.drawable.botswana
        ),
        Question(
            "Guess the country from its flag",
            "Ukraine",
            "Brazil",
            "South Korea",
            "Belgium",
            2,
            R.drawable.brazil
        ),
        Question(
            "Guess the country from its flag",
            "Austria",
            "Brunei",
            "Kenya",
            "Mauritania",
            2,
            R.drawable.brunei
        ),
        Question(
            "Guess the country from its flag",
            "Benin",
            "Finland",
            "Bulgaria",
            "Senegal",
            3,
            R.drawable.bulgaria
        ),
        Question(
            "Guess the country from its flag",
            "Finland",
            "Togo",
            "Burkina Faso",
            "Papua New Guinea",
            3,
            R.drawable.burkina_faso
        ),
        Question(
            "Guess the country from its flag",
            "Tanzania",
            "New Zealand",
            "Congo (DRC)",
            "Burundi",
            4,
            R.drawable.burundi
        ),
        Question(
            "Guess the country from its flag",
            "Congo",
            "Guinea",
            "Cambodia",
            "Sao Tome and Principe",
            3,
            R.drawable.cambodia
        ),
        Question(
            "Guess the country from its flag",
            "Singapore",
            "Montenegro",
            "Cameroon",
            "Mauritania",
            3,
            R.drawable.cameroon
        ),
        Question(
            "Guess the country from its flag",
            "Gabon",
            "Congo",
            "Canada",
            "Philippines",
            3,
            R.drawable.canada
        ),
        Question(
            "Guess the country from its flag",
            "Bulgaria",
            "Bangladesh",
            "Canada",
            "Cape Verde",
            4,
            R.drawable.cape_verde
        ),
        Question(
            "Guess the country from its flag",
            "Sweden",
            "Central African Republic",
            "Cyprus",
            "Uganda",
            2,
            R.drawable.central_african_republic
        ),
        Question(
            "Guess the country from its flag",
            "Solomon Islands",
            "Benin",
            "Maldives",
            "Chad",
            4,
            R.drawable.chad
        ),
        Question(
            "Guess the country from its flag",
            "Solomon Islands",
            "Niger",
            "Romania",
            "Chile",
            4,
            R.drawable.chile
        ),
        Question(
            "Guess the country from its flag",
            "Samoa",
            "Algeria",
            "China",
            "Uganda",
            3,
            R.drawable.china
        ),
        Question(
            "Guess the country from its flag",
            "Colombia",
            "Uganda",
            "Rwanda",
            "Hungary",
            1,
            R.drawable.colombia
        ),
        Question(
            "Guess the country from its flag",
            "Canada",
            "Italy",
            "Comoros",
            "Mozambique",
            3,
            R.drawable.comoros
        ),
        Question(
            "Guess the country from its flag",
            "Netherlands",
            "Congo",
            "Afghanistan",
            "Vietnam",
            2,
            R.drawable.congo
        ),
        Question(
            "Guess the country from its flag",
            "Paraguay",
            "Dominican Republic",
            "Congo (DRC)",
            "Peru",
            3,
            R.drawable.congo_drc
        ),
        Question(
            "Guess the country from its flag",
            "Costa Rica",
            "Sweden",
            "Jamaica",
            "Tajikistan",
            1,
            R.drawable.costa_rica
        ),
        Question(
            "Guess the country from its flag",
            "Cuba",
            "Croatia",
            "Madagascar",
            "Czech Republic",
            2,
            R.drawable.croatia
        ),
        Question(
            "Guess the country from its flag",
            "Cuba",
            "Somalia",
            "North Korea",
            "Palau",
            1,
            R.drawable.cuba
        ),
        Question(
            "Guess the country from its flag",
            "Cyprus",
            "Canada",
            "Liechtenstein",
            "Jordan",
            1,
            R.drawable.cyprus
        ),
        Question(
            "Guess the country from its flag",
            "Belgium",
            "Czech Republic",
            "Greece",
            "Senegal",
            2,
            R.drawable.czech_republic
        ),
        Question(
            "Guess the country from its flag",
            "Denmark",
            "Brazil",
            "Zimbabwe",
            "Pakistan",
            1,
            R.drawable.denmark
        ),
        Question(
            "Guess the country from its flag",
            "Djibouti",
            "Russia",
            "Chile",
            "Tonga",
            1,
            R.drawable.djibouti
        ),
        Question(
            "Guess the country from its flag",
            "Saint Vincent and the Grenadines",
            "Czech Republic",
            "Honduras",
            "Dominica",
            4,
            R.drawable.dominica
        ),
        Question(
            "Guess the country from its flag",
            "Finland",
            "Saint Kitts and Nevis",
            "Zambia",
            "Dominican Republic",
            4,
            R.drawable.dominican_republic
        ),
        Question(
            "Guess the country from its flag",
            "Vatican City",
            "Ecuador",
            "Kazakhstan",
            "Mauritania",
            2,
            R.drawable.ecuador
        ),
        Question(
            "Guess the country from its flag",
            "Myanmar",
            "Portugal",
            "Egypt",
            "Nepal",
            3,
            R.drawable.egypt
        ),
        Question(
            "Guess the country from its flag",
            "El Salvador",
            "Guinea",
            "Gambia",
            "Benin",
            1,
            R.drawable.el_salvador
        ),
        Question(
            "Guess the country from its flag",
            "Argentina",
            "Slovakia",
            "Equatorial Guinea",
            "Samoa",
            3,
            R.drawable.equatorial_guinea
        ),
        Question(
            "Guess the country from its flag",
            "Slovakia",
            "Eritrea",
            "Gabon",
            "Albania",
            2,
            R.drawable.eritrea
        ),
        Question(
            "Guess the country from its flag",
            "Estonia",
            "Vanuatu",
            "Switzerland",
            "Belize",
            1,
            R.drawable.estonia
        ),
        Question(
            "Guess the country from its flag",
            "Bhutan",
            "Ethiopia",
            "Austria",
            "Kuwait",
            2,
            R.drawable.ethiopia
        ),
        Question(
            "Guess the country from its flag",
            "Fiji",
            "Poland",
            "Ghana",
            "Indonesia",
            1,
            R.drawable.fiji
        ),
        Question(
            "Guess the country from its flag",
            "Fiji",
            "Saint Kitts and Nevis",
            "China",
            "Finland",
            4,
            R.drawable.finland
        ),
        Question(
            "Guess the country from its flag",
            "Guatemala",
            "North Macedonia",
            "Mexico",
            "France",
            4,
            R.drawable.france
        ),
        Question(
            "Guess the country from its flag",
            "Burkina Faso",
            "Gabon",
            "Tonga",
            "Morocco",
            2,
            R.drawable.gabon
        ),
        Question(
            "Guess the country from its flag",
            "Mongolia",
            "Micronesia",
            "Gambia",
            "Niger",
            3,
            R.drawable.gambia
        ),
        Question(
            "Guess the country from its flag",
            "Georgia",
            "Turkmenistan",
            "Togo",
            "Thailand",
            1,
            R.drawable.georgia
        ),
        Question(
            "Guess the country from its flag",
            "Germany",
            "Belize",
            "Mauritius",
            "Zambia",
            1,
            R.drawable.germany
        ),
        Question(
            "Guess the country from its flag",
            "Cameroon",
            "Guinea",
            "Ghana",
            "El Salvador",
            3,
            R.drawable.ghana
        ),
        Question(
            "Guess the country from its flag",
            "Rwanda",
            "Greece",
            "Nauru",
            "Comoros",
            2,
            R.drawable.greece
        ),
        Question(
            "Guess the country from its flag",
            "Dominican Republic",
            "Indonesia",
            "Nicaragua",
            "Guatemala",
            4,
            R.drawable.guatemala
        ),
        Question(
            "Guess the country from its flag",
            "Bosnia and Herzegovina",
            "Guinea",
            "Namibia",
            "Saint Vincent and the Grenadines",
            2,
            R.drawable.guinea
        ),
        Question(
            "Guess the country from its flag",
            "Guinea-Bissau",
            "Bangladesh",
            "Timor-Leste",
            "Saint Kitts and Nevis",
            1,
            R.drawable.guinea_bissau
        ),
        Question(
            "Guess the country from its flag",
            "Guyana",
            "Bulgaria",
            "Germany",
            "Czech Republic",
            1,
            R.drawable.guyana
        ),
        Question(
            "Guess the country from its flag",
            "Pakistan",
            "Oman",
            "Fiji",
            "Haiti",
            4,
            R.drawable.haiti
        ),
        Question(
            "Guess the country from its flag",
            "Belize",
            "Czech Republic",
            "Malaysia",
            "Honduras",
            4,
            R.drawable.honduras
        ),
        Question(
            "Guess the country from its flag",
            "Hungary",
            "Mali",
            "Haiti",
            "Netherlands",
            1,
            R.drawable.hungary
        ),
        Question(
            "Guess the country from its flag",
            "Mongolia",
            "United States",
            "Iceland",
            "Zimbabwe",
            3,
            R.drawable.iceland
        ),
        Question(
            "Guess the country from its flag",
            "Croatia",
            "Egypt",
            "Italy",
            "India",
            4,
            R.drawable.india
        ),
        Question(
            "Guess the country from its flag",
            "Belgium",
            "Indonesia",
            "Sierra Leone",
            "Saint Kitts and Nevis",
            2,
            R.drawable.indonesia
        ),
        Question(
            "Guess the country from its flag",
            "Iran",
            "Kenya",
            "Belgium",
            "Bangladesh",
            1,
            R.drawable.iran
        ),
        Question(
            "Guess the country from its flag",
            "Paraguay",
            "Romania",
            "Cuba",
            "Iraq",
            4,
            R.drawable.iraq
        ),
        Question(
            "Guess the country from its flag",
            "Ireland",
            "Philippines",
            "Botswana",
            "Ecuador",
            1,
            R.drawable.ireland
        ),
        Question(
            "Guess the country from its flag",
            "Italy",
            "Solomon Islands",
            "Bhutan",
            "Turkmenistan",
            1,
            R.drawable.italy
        ),
        Question(
            "Guess the country from its flag",
            "Mauritius",
            "Jamaica",
            "Central African Republic",
            "Senegal",
            2,
            R.drawable.jamaica
        ),
        Question(
            "Guess the country from its flag",
            "Sierra Leone",
            "Japan",
            "Solomon Islands",
            "Bahamas",
            2,
            R.drawable.japan
        ),
        Question(
            "Guess the country from its flag",
            "Jordan",
            "Monaco",
            "Tonga",
            "Singapore",
            1,
            R.drawable.jordan
        ),
        Question(
            "Guess the country from its flag",
            "Guyana",
            "Estonia",
            "Kazakhstan",
            "Turkey",
            3,
            R.drawable.kazakhstan
        ),
        Question(
            "Guess the country from its flag",
            "Ghana",
            "Haiti",
            "Kenya",
            "Marshall Islands",
            3,
            R.drawable.kenya
        ),
        Question(
            "Guess the country from its flag",
            "Turkey",
            "Kiribati",
            "Thailand",
            "Italy",
            2,
            R.drawable.kiribati
        ),
        Question(
            "Guess the country from its flag",
            "Kazakhstan",
            "Bolivia",
            "Algeria",
            "North Korea",
            4,
            R.drawable.north_korea
        ),
        Question(
            "Guess the country from its flag",
            "Suriname",
            "Saudi Arabia",
            "Burundi",
            "South Korea",
            4,
            R.drawable.south_korea
        ),
        Question(
            "Guess the country from its flag",
            "Kuwait",
            "Rwanda",
            "Fiji",
            "Peru",
            1,
            R.drawable.kuwait
        ),
        Question(
            "Guess the country from its flag",
            "China",
            "Lesotho",
            "Kyrgyzstan",
            "Bhutan",
            3,
            R.drawable.kyrgyzstan
        ),
        Question(
            "Guess the country from its flag",
            "Luxembourg",
            "Laos",
            "Indonesia",
            "Cuba",
            2,
            R.drawable.laos
        ),
        Question(
            "Guess the country from its flag",
            "Saint Lucia",
            "Uzbekistan",
            "Jamaica",
            "Latvia",
            4,
            R.drawable.latvia
        ),
        Question(
            "Guess the country from its flag",
            "Lebanon",
            "Tunisia",
            "Samoa",
            "Italy",
            1,
            R.drawable.lebanon
        ),
        Question(
            "Guess the country from its flag",
            "Lesotho",
            "Colombia",
            "Haiti",
            "Cape Verde",
            1,
            R.drawable.lesotho
        ),
        Question(
            "Guess the country from its flag",
            "Liberia",
            "Samoa",
            "Croatia",
            "Hungary",
            1,
            R.drawable.liberia
        ),
        Question(
            "Guess the country from its flag",
            "South Africa",
            "Ethiopia",
            "Libya",
            "Venezuela",
            3,
            R.drawable.libya
        ),
        Question(
            "Guess the country from its flag",
            "Estonia",
            "Ukraine",
            "Liechtenstein",
            "Syria",
            3,
            R.drawable.liechtenstein
        ),
        Question(
            "Guess the country from its flag",
            "Peru",
            "Palau",
            "Lithuania",
            "Guinea",
            3,
            R.drawable.lithuania
        ),
        Question(
            "Guess the country from its flag",
            "Luxembourg",
            "Bulgaria",
            "Syria",
            "Mongolia",
            1,
            R.drawable.luxembourg
        ),
        Question(
            "Guess the country from its flag",
            "Bahrain",
            "Afghanistan",
            "Madagascar",
            "Kuwait",
            3,
            R.drawable.madagascar
        ),
        Question(
            "Guess the country from its flag",
            "Tajikistan",
            "Malawi",
            "Haiti",
            "Cyprus",
            2,
            R.drawable.malawi
        ),
        Question(
            "Guess the country from its flag",
            "Samoa",
            "Uzbekistan",
            "Montenegro",
            "Malaysia",
            4,
            R.drawable.malaysia
        ),
        Question(
            "Guess the country from its flag",
            "Maldives",
            "Canada",
            "Bosnia and Herzegovina",
            "United Arab Emirates",
            1,
            R.drawable.maldives
        ),
        Question(
            "Guess the country from its flag",
            "Saint Lucia",
            "Mali",
            "Azerbaijan",
            "Lithuania",
            2,
            R.drawable.mali
        ),
        Question(
            "Guess the country from its flag",
            "Morocco",
            "Malta",
            "Chile",
            "Bahamas",
            2,
            R.drawable.malta
        ),
        Question(
            "Guess the country from its flag",
            "Liechtenstein",
            "Bahamas",
            "Marshall Islands",
            "Liberia",
            3,
            R.drawable.marshall_islands
        ),
        Question(
            "Guess the country from its flag",
            "Uganda",
            "Mauritania",
            "Guatemala",
            "Tunisia",
            2,
            R.drawable.mauritania
        ),
        Question(
            "Guess the country from its flag",
            "Mauritius",
            "Lesotho",
            "Sao Tome and Principe",
            "Mexico",
            1,
            R.drawable.mauritius
        ),
        Question(
            "Guess the country from its flag",
            "Germany",
            "Mexico",
            "Cyprus",
            "Dominica",
            2,
            R.drawable.mexico
        ),
        Question(
            "Guess the country from its flag",
            "Armenia",
            "Dominica",
            "Kuwait",
            "Micronesia",
            4,
            R.drawable.micronesia
        ),
        Question(
            "Guess the country from its flag",
            "Turkey",
            "Guatemala",
            "Honduras",
            "Moldova",
            4,
            R.drawable.moldova
        ),
        Question(
            "Guess the country from its flag",
            "Uruguay",
            "Monaco",
            "Cameroon",
            "Malawi",
            2,
            R.drawable.monaco
        ),
        Question(
            "Guess the country from its flag",
            "Mongolia",
            "Nigeria",
            "France",
            "Eritrea",
            1,
            R.drawable.mongolia
        ),
        Question(
            "Guess the country from its flag",
            "Lebanon",
            "Japan",
            "Gambia",
            "Montenegro",
            4,
            R.drawable.montenegro
        ),
        Question(
            "Guess the country from its flag",
            "Armenia",
            "Morocco",
            "Tonga",
            "El Salvador",
            2,
            R.drawable.morocco
        ),
        Question(
            "Guess the country from its flag",
            "South Korea",
            "India",
            "Bhutan",
            "Mozambique",
            4,
            R.drawable.mozambique
        ),
        Question(
            "Guess the country from its flag",
            "Lebanon",
            "Tanzania",
            "Myanmar",
            "Philippines",
            3,
            R.drawable.myanmar
        ),
        Question(
            "Guess the country from its flag",
            "Tuvalu",
            "Rwanda",
            "South Korea",
            "Namibia",
            4,
            R.drawable.namibia
        ),
        Question(
            "Guess the country from its flag",
            "Nauru",
            "Cape Verde",
            "Guyana",
            "Dominica",
            1,
            R.drawable.nauru
        ),
        Question(
            "Guess the country from its flag",
            "Azerbaijan",
            "Cameroon",
            "Nepal",
            "Solomon Islands",
            3,
            R.drawable.nepal
        ),
        Question(
            "Guess the country from its flag",
            "Latvia",
            "Zambia",
            "Kazakhstan",
            "Netherlands",
            4,
            R.drawable.netherlands
        ),
        Question(
            "Guess the country from its flag",
            "South Sudan",
            "Philippines",
            "Cape Verde",
            "New Zealand",
            4,
            R.drawable.new_zealand
        ),
        Question(
            "Guess the country from its flag",
            "Seychelles",
            "Egypt",
            "Guinea-Bissau",
            "Nicaragua",
            4,
            R.drawable.nicaragua
        ),
        Question(
            "Guess the country from its flag",
            "Niger",
            "Vanuatu",
            "Morocco",
            "Afghanistan",
            1,
            R.drawable.niger
        ),
        Question(
            "Guess the country from its flag",
            "Liechtenstein",
            "Nigeria",
            "Montenegro",
            "Bhutan",
            2,
            R.drawable.nigeria
        ),
        Question(
            "Guess the country from its flag",
            "Suriname",
            "Kazakhstan",
            "North Macedonia",
            "Trinidad and Tobago",
            3,
            R.drawable.north_macedonia
        ),
        Question(
            "Guess the country from its flag",
            "Norway",
            "Vietnam",
            "Italy",
            "Peru",
            1,
            R.drawable.norway
        ),
        Question(
            "Guess the country from its flag",
            "Tunisia",
            "Mauritius",
            "Oman",
            "North Korea",
            3,
            R.drawable.oman
        ),
        Question(
            "Guess the country from its flag",
            "United States",
            "Ireland",
            "Samoa",
            "Pakistan",
            4,
            R.drawable.pakistan
        ),
        Question(
            "Guess the country from its flag",
            "El Salvador",
            "Palau",
            "Moldova",
            "Tunisia",
            2,
            R.drawable.palau
        ),
        Question(
            "Guess the country from its flag",
            "Tuvalu",
            "Djibouti",
            "Sri Lanka",
            "Panama",
            4,
            R.drawable.panama
        ),
        Question(
            "Guess the country from its flag",
            "Mauritania",
            "Saint Vincent and the Grenadines",
            "Papua New Guinea",
            "Afghanistan",
            3,
            R.drawable.papua_new_guinea
        ),
        Question(
            "Guess the country from its flag",
            "Iran",
            "Ethiopia",
            "Paraguay",
            "Montenegro",
            3,
            R.drawable.paraguay
        ),
        Question(
            "Guess the country from its flag",
            "Nicaragua",
            "Myanmar",
            "Peru",
            "Turkmenistan",
            3,
            R.drawable.peru
        ),
        Question(
            "Guess the country from its flag",
            "Peru",
            "Philippines",
            "Nigeria",
            "Denmark",
            2,
            R.drawable.philippines
        ),
        Question(
            "Guess the country from its flag",
            "Poland",
            "Indonesia",
            "Philippines",
            "Trinidad and Tobago",
            1,
            R.drawable.poland
        ),
        Question(
            "Guess the country from its flag",
            "Bulgaria",
            "Germany",
            "Portugal",
            "Turkmenistan",
            3,
            R.drawable.portugal
        ),
        Question(
            "Guess the country from its flag",
            "Gabon",
            "Equatorial Guinea",
            "Qatar",
            "Congo (DRC)",
            3,
            R.drawable.qatar
        ),
        Question(
            "Guess the country from its flag",
            "Palestine",
            "Bahrain",
            "Greece",
            "Nigeria",
            1,
            R.drawable.palestine
        ),
        Question(
            "Guess the country from its flag",
            "Romania",
            "Nepal",
            "Micronesia",
            "Switzerland",
            1,
            R.drawable.romania
        ),
        Question(
            "Guess the country from its flag",
            "Venezuela",
            "Russia",
            "United States",
            "Malaysia",
            2,
            R.drawable.russia
        ),
        Question(
            "Guess the country from its flag",
            "Marshall Islands",
            "Greece",
            "Congo (DRC)",
            "Rwanda",
            4,
            R.drawable.rwanda
        ),
        Question(
            "Guess the country from its flag",
            "Saint Kitts and Nevis",
            "Cameroon",
            "Monaco",
            "France",
            1,
            R.drawable.saint_kitts_and_nevis
        ),
        Question(
            "Guess the country from its flag",
            "United States",
            "Saint Lucia",
            "Poland",
            "New Zealand",
            2,
            R.drawable.saint_lucia
        ),
        Question(
            "Guess the country from its flag",
            "Saint Vincent and the Grenadines",
            "San Marino",
            "Guatemala",
            "Chad",
            1,
            R.drawable.saint_vincent_and_the_grenadines
        ),
        Question(
            "Guess the country from its flag",
            "Colombia",
            "New Zealand",
            "Tunisia",
            "Samoa",
            4,
            R.drawable.samoa
        ),
        Question(
            "Guess the country from its flag",
            "Myanmar",
            "Spain",
            "San Marino",
            "Vietnam",
            3,
            R.drawable.san_marino
        ),
        Question(
            "Guess the country from its flag",
            "Saint Lucia",
            "Namibia",
            "Cuba",
            "Sao Tome and Principe",
            4,
            R.drawable.sao_tome_and_principe
        ),
        Question(
            "Guess the country from its flag",
            "Nauru",
            "Guyana",
            "Guatemala",
            "Saudi Arabia",
            4,
            R.drawable.saudi_arabia
        ),
        Question(
            "Guess the country from its flag",
            "Portugal",
            "Oman",
            "Senegal",
            "Sweden",
            3,
            R.drawable.senegal
        ),
        Question(
            "Guess the country from its flag",
            "Iceland",
            "Serbia",
            "Mozambique",
            "Bosnia and Herzegovina",
            2,
            R.drawable.serbia
        ),
        Question(
            "Guess the country from its flag",
            "Germany",
            "Hungary",
            "Seychelles",
            "Kuwait",
            3,
            R.drawable.seychelles
        ),
        Question(
            "Guess the country from its flag",
            "Rwanda",
            "Botswana",
            "Sierra Leone",
            "Comoros",
            3,
            R.drawable.sierra_leone
        ),
        Question(
            "Guess the country from its flag",
            "Georgia",
            "Singapore",
            "Malaysia",
            "United Kingdom",
            2,
            R.drawable.singapore
        ),
        Question(
            "Guess the country from its flag",
            "Uzbekistan",
            "Slovakia",
            "Fiji",
            "Benin",
            2,
            R.drawable.slovakia
        ),
        Question(
            "Guess the country from its flag",
            "Mauritius",
            "South Korea",
            "Rwanda",
            "Slovenia",
            4,
            R.drawable.slovenia
        ),
        Question(
            "Guess the country from its flag",
            "Micronesia",
            "Belize",
            "Estonia",
            "Solomon Islands",
            4,
            R.drawable.solomon_islands
        ),
        Question(
            "Guess the country from its flag",
            "Maldives",
            "Sierra Leone",
            "United States",
            "Somalia",
            4,
            R.drawable.somalia
        ),
        Question(
            "Guess the country from its flag",
            "South Africa",
            "Serbia",
            "Malawi",
            "North Macedonia",
            1,
            R.drawable.south_africa
        ),
        Question(
            "Guess the country from its flag",
            "South Sudan",
            "Lesotho",
            "Italy",
            "Maldives",
            1,
            R.drawable.south_sudan
        ),
        Question(
            "Guess the country from its flag",
            "Russia",
            "Saint Kitts and Nevis",
            "Somalia",
            "Spain",
            4,
            R.drawable.spain
        ),
        Question(
            "Guess the country from its flag",
            "Oman",
            "Sri Lanka",
            "France",
            "Hungary",
            2,
            R.drawable.sri_lanka
        ),
        Question(
            "Guess the country from its flag",
            "Oman",
            "Australia",
            "Maldives",
            "Sudan",
            4,
            R.drawable.sudan
        ),
        Question(
            "Guess the country from its flag",
            "Turkey",
            "Tuvalu",
            "Suriname",
            "Mauritania",
            3,
            R.drawable.suriname
        ),
        Question(
            "Guess the country from its flag",
            "Nicaragua",
            "Sweden",
            "Chile",
            "Sudan",
            2,
            R.drawable.sweden
        ),
        Question(
            "Guess the country from its flag",
            "Switzerland",
            "Mali",
            "Slovakia",
            "Sao Tome and Principe",
            1,
            R.drawable.switzerland
        ),
        Question(
            "Guess the country from its flag",
            "Syria",
            "Brazil",
            "Tanzania",
            "Mongolia",
            1,
            R.drawable.syria
        ),
        Question(
            "Guess the country from its flag",
            "New Zealand",
            "Tajikistan",
            "Dominican Republic",
            "Bangladesh",
            2,
            R.drawable.tajikistan
        ),
        Question(
            "Guess the country from its flag",
            "Malawi",
            "North Korea",
            "Tanzania",
            "Fiji",
            3,
            R.drawable.tanzania
        ),
        Question(
            "Guess the country from its flag",
            "North Korea",
            "Kyrgyzstan",
            "Malawi",
            "Thailand",
            4,
            R.drawable.thailand
        ),
        Question(
            "Guess the country from its flag",
            "Moldova",
            "Guinea",
            "Timor-Leste",
            "Botswana",
            3,
            R.drawable.timor_leste
        ),
        Question(
            "Guess the country from its flag",
            "Angola",
            "Rwanda",
            "Belarus",
            "Togo",
            4,
            R.drawable.togo
        ),
        Question(
            "Guess the country from its flag",
            "Gabon",
            "Thailand",
            "Tonga",
            "Bhutan",
            3,
            R.drawable.tonga
        ),
        Question(
            "Guess the country from its flag",
            "Trinidad and Tobago",
            "Australia",
            "Guatemala",
            "Eritrea",
            1,
            R.drawable.trinidad_and_tobago
        ),
        Question(
            "Guess the country from its flag",
            "Tunisia",
            "Sudan",
            "Croatia",
            "Ghana",
            1,
            R.drawable.tunisia
        ),
        Question(
            "Guess the country from its flag",
            "Nigeria",
            "Turkey",
            "Tunisia",
            "Cape Verde",
            2,
            R.drawable.turkey
        ),
        Question(
            "Guess the country from its flag",
            "Nicaragua",
            "Turkmenistan",
            "Uruguay",
            "Guinea-Bissau",
            2,
            R.drawable.turkmenistan
        ),
        Question(
            "Guess the country from its flag",
            "Czech Republic",
            "South Africa",
            "Tuvalu",
            "Venezuela",
            3,
            R.drawable.tuvalu
        ),
        Question(
            "Guess the country from its flag",
            "Uganda",
            "Cyprus",
            "Jordan",
            "Cameroon",
            1,
            R.drawable.uganda
        ),
        Question(
            "Guess the country from its flag",
            "Ukraine",
            "Jordan",
            "Serbia",
            "Turkmenistan",
            1,
            R.drawable.ukraine
        ),
        Question(
            "Guess the country from its flag",
            "Malta",
            "Venezuela",
            "Equatorial Guinea",
            "United Arab Emirates",
            4,
            R.drawable.united_arab_emirates
        ),
        Question(
            "Guess the country from its flag",
            "United Kingdom",
            "Slovakia",
            "Ukraine",
            "Suriname",
            1,
            R.drawable.united_kingdom
        ),
        Question(
            "Guess the country from its flag",
            "Cambodia",
            "United States",
            "United Kingdom",
            "Jamaica",
            2,
            R.drawable.united_states
        ),
        Question(
            "Guess the country from its flag",
            "Uruguay",
            "Sao Tome and Principe",
            "Bahamas",
            "Latvia",
            1,
            R.drawable.uruguay
        ),
        Question(
            "Guess the country from its flag",
            "Tonga",
            "Lithuania",
            "Bhutan",
            "Uzbekistan",
            4,
            R.drawable.uzbekistan
        ),
        Question(
            "Guess the country from its flag",
            "Andorra",
            "Moldova",
            "Vanuatu",
            "Pakistan",
            3,
            R.drawable.vanuatu
        ),
        Question(
            "Guess the country from its flag",
            "Vatican City",
            "Montenegro",
            "Libya",
            "Switzerland",
            1,
            R.drawable.vatican_city
        ),
        Question(
            "Guess the country from its flag",
            "Uzbekistan",
            "Croatia",
            "Morocco",
            "Venezuela",
            4,
            R.drawable.venezuela
        ),
        Question(
            "Guess the country from its flag",
            "Zimbabwe",
            "Vietnam",
            "Portugal",
            "Thailand",
            2,
            R.drawable.vietnam
        ),
        Question(
            "Guess the country from its flag",
            "Spain",
            "Russia",
            "Yemen",
            "Norway",
            3,
            R.drawable.yemen
        ),
        Question(
            "Guess the country from its flag",
            "Morocco",
            "Zimbabwe",
            "Slovakia",
            "Zambia",
            4,
            R.drawable.zambia
        ),
        Question(
            "Guess the country from its flag",
            "Kiribati",
            "Greece",
            "Zimbabwe",
            "Brunei",
            3,
            R.drawable.zimbabwe
        )
    )


}
