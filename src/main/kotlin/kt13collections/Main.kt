package kt13collections

fun main() {
    val listOfFamousBrazilianQuotes = listOf(
        "Never poke a jaguar with a short stick.",
        "Too much alms, the saint will be suspicious.",
        "A dog bitten by a snake is afraid of sausages.",
        "She who knows, knows. She who doesn't know, claps her hands.",
    )

    // listOfFamousBrazilianQuotes.add("God helps those who wake up early.")

    val lastQuote = listOfFamousBrazilianQuotes.last()
    val firstQuote = listOfFamousBrazilianQuotes.first()

    // But what is the list was empty?
    listOfFamousBrazilianQuotes.isEmpty()     // You can check with this,
    listOfFamousBrazilianQuotes.isNotEmpty()  // or this,
    listOfFamousBrazilianQuotes.lastOrNull()  // or you can use lastOrNull, so you don't raise an exception
    listOfFamousBrazilianQuotes.firstOrNull() // or firstOrNull

    val listOfListOfQuotes = listOfFamousBrazilianQuotes.chunked(2) // Debug the function to see this result.

    listOfFamousBrazilianQuotes.getOrNull(2) // Tries to get the third element, null if it was not found.

    val emptyListOfIntByDefault = emptyList<Int>() // Create an empty list like this, useful for default parameters.

    val sequenceOfNumbers = mutableListOf<Int>()
    sequenceOfNumbers.add(1)
    sequenceOfNumbers.add(2)
    sequenceOfNumbers.add(3)
    sequenceOfNumbers.add(5)
    sequenceOfNumbers.addAll(listOf(8, 13, 21))

    sequenceOfNumbers += 34 // This also works

    val yetAnotherWayOfCreatingLists = listOf("A", "B", "C") + listOf("D", "E", "F")

    val anotherWayOfCreatingAList = buildList {
        add(1)
        add(2)
        add(3)
        add(5)
        addAll(listOf(8, 13, 21))
    }

    println("Here's the list we created")
    sequenceOfNumbers.forEach {
        println(it)
    }

    val sumOfAllNumbersInList = sequenceOfNumbers.sumOf { it }

    val listOfNumbersTurnedString = sequenceOfNumbers.map {
        it.toString()
    }
}