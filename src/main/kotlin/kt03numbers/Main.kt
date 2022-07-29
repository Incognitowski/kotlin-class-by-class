package kt03numbers

import java.math.BigDecimal

// Numeric Types
fun main() {
    val firstNumber = 1 // Inferred type: Int
    val secondNumber = 2.3 // Inferred type: Double
    val thirdNumber : Long = 4
    val fourthNumber = 5L // Inferred type: Long
    val fifthNumber = 6F // Inferred type: Float
    val reallyLongAwkwardNumber = 54498413214
    val reallyLongEasyToReadNumber = 54_498_413_214

    // val hugeNumber : Int = 654946546654 // Doesn't work because it's too large to fit an integer.
    val hugeNumber : Long = 654946546654

    val sumOfTwoNumbers = firstNumber + thirdNumber // This works because they are of "similar" types
    val productOfTwoNumbers = secondNumber * fourthNumber // This works, but notice the inferred type of the result

    val firstBigDecimal = BigDecimal(reallyLongEasyToReadNumber)
    val secondBigDecimal = BigDecimal(firstNumber)
    val deductionOfTwoBigDecimals = firstBigDecimal.subtract(secondBigDecimal)

    val doubleFromAString = "14.7".toDoubleOrNull()
        ?: throw Exception("That string is not a double :(")
}