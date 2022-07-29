package kt05conditionsPartOne

import kotlin.random.Random

// Conditions
fun main() {
    val firstString = "ABCDEFG"

    if (firstString.startsWith("ABC")) {
        TODO()
    }

    val randomNumber = Random.nextInt()
    if (randomNumber % 2 == 0) {
        TODO()
    }

    val anotherRandomNumber = Random.nextInt()
    val numberIsEven = anotherRandomNumber % 2 == 0
    if (numberIsEven) {
        TODO()
    } else {
        // TODO: 25/07/2022
    }

    val yetAnotherRandomNumber = Random.nextInt()

    // If statements can be used to return values implicitly
    val fruit = if (yetAnotherRandomNumber % 5 == 0) {
        "Banana"
    } else if (yetAnotherRandomNumber % 4 == 0) {
        "Orange"
    } else if (yetAnotherRandomNumber % 3 == 0) {
        "Watermelon"
    } else if (yetAnotherRandomNumber % 2 == 0) {
        "Blueberry"
    } else {
        "Strawberry"
    }

    // When statements can also be used to return values implicitly
    val colorOfFruit = when (fruit) {
        "Banana" -> {
            "Yellow"
        }
        "Orange" -> {
            "Orange"
        }
        "Watermelon" -> {
            "Green"
        }
        "Blueberry" -> {
            "Blue"
        }
        "Strawberry" -> {
            "Red"
        }
        else -> throw Exception("No mapped color for $fruit")
    }

    val fruitButInAPrettierWay = when {
        yetAnotherRandomNumber % 5 == 0 -> "Banana"
        yetAnotherRandomNumber % 4 == 0 -> "Orange"
        yetAnotherRandomNumber % 3 == 0 -> "Watermelon"
        yetAnotherRandomNumber % 2 == 0 -> "Blueberry"
        else -> "Strawberry"
    }
}