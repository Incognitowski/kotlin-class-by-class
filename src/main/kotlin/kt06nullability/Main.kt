package kt06nullability

import kotlin.random.Random

// Nullability
fun main() {
    var firstString: String? = null
    var secondString: String? = "Banana"

    if (Random.nextInt() % 2 == 0) {
        secondString = null
    }

    if (Random.nextInt() % 2 == 0) {
        firstString = "Strawberry"
    }

    val lengthOfSecondString = secondString?.length

    val firstCharactersOfString = secondString?.take(3)
        ?: throw Exception("secondString was null")

    val veryDangerousNeverDoThis = firstString!!.take(3)

    val thirdString: String? = if (Random.nextInt() % 2 == 0) null else "Blueberry"

    if (thirdString != null) {
        thirdString.uppercase()
        thirdString.lowercase()
    }

    val lengthOfThirdString = thirdString?.length

    "7.9".toDouble() // This could raise a "NumberFormatException" if the string is invalid

    "ABCD".toDoubleOrNull()
        ?: throw Exception("Hey pal, that's an invalid string :0") // See?
    // When we use this, we can make sure we properly treat this kind of parsing
    // with a custom message

}