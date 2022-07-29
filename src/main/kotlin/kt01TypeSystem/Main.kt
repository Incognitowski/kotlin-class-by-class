package kt01TypeSystem

// Type System
fun main() {
    val foo : Int = 1   // Type: Int
    val bar = 2         // Type: Int (but inferred)
    var baz = foo + bar // Type: Int
    baz += 5
    baz *= 3
    val firstString = "Praise the sun!"
    val secondString = "... but use sunscreen."
    var thirdString = firstString + secondString
    thirdString += " Preferably a good one."
}

