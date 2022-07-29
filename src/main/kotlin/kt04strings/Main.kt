package kt04strings

// String manipulation
fun main() {
    val linksFavoriteQuoteButMessedUp = "It’s@dangerous@to@go@alone,@take@this!"
    val linksFavoriteQuote = linksFavoriteQuoteButMessedUp.replace("@", " ")

    val myFavoriteMovie = "Interstellar"
    val myFavoriteMovieSentence = "My favorite movie is: $myFavoriteMovie"

    val anotherMovie = "Bram Stroker's Dracula"

    val completeSentence = buildString {
        append(myFavoriteMovieSentence)
        append(", but I also like $anotherMovie")
    }

    val completeSentenceButUpperCase = completeSentence.uppercase()

    val complexString = """
        [
            "Miles Davis",
            "Louis Armstrong",
            "John Coltrane",
            "Charles Mingus",
            "Thelonious Monk",
            "Ella Fitzgerald",
            "Charlie Parker",
            "Duke Ellington",
            "Chet Baker",
            "Ornette Coleman",
        ]
    """.trimIndent()

    val bestJazzMusicians = complexString
        .removePrefix("[")
        .removeSuffix("]")
        .replace("\"", "")
        .replace("\n", "")
        .replace("  ", "")
        .split(",") // Inferred type: List<String>

    val theWorstString = "                          a lot of space around me                                   "
    val fixedTheWorstString = theWorstString.trim() // Could also do theWorstString.trimStart().trimEnd()

    var aFewLetters = "MLKJIHGFEDCBA"
    aFewLetters = aFewLetters.reversed()

    var abcIsInCorrectOrder = aFewLetters.startsWith("ABC") // Inferred type: Boolean

    val myDreamCarInLowerCase = "bmw m4"
    val brand = myDreamCarInLowerCase.take(3)
    val model = myDreamCarInLowerCase.takeLast(2)

    val carBrandIsBMW = myDreamCarInLowerCase.uppercase().contains("BMW") // Inferred type: Boolean

    val anotherSentence = "Junior's dream car is the ${myDreamCarInLowerCase.uppercase()}"
}