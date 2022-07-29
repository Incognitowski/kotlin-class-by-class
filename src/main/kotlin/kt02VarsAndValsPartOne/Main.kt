package kt02VarsAndValsPartOne

// Variables and Values
fun main() {
    val firstNumber = 1 // We just defined a "val", a constant value, cannot be changed.
    var secondNumber = 2 // This is a "var", a variable, can be changed.

    // firstNumber = 7 // This doesn't work because firstNumber is a "val", a value.
    secondNumber = 7 // This works because secondNumber is a "var", a variable

    // Bear in mind, we must maintain the original inferred type of the variable when changing it.

    // secondNumber = "myName" // This does not work because the inferred type is Int, and not String
    // secondNumber = 1.23 // This also does not work, because the inferred type is Int, not Double

    secondNumber += 10 // This is the same as writing "secondNumber = secondNumber + 10"
}