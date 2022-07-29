package kt11extensionFunctions

import kt09inheritance.TurboColoredVehicle
import kt10dataClass.User
import java.time.LocalDate

// Extension functions

fun Double.toStringWithComma(): String {
    return this.toString().replace(".", ",")
}

fun main() {
    User("Junior", LocalDate.of(1999, 6, 7), 1.74).printUserInformation()
    println(TurboColoredVehicle("sapphire").getSpeedInfo())

    val doubleAsString = 120.29.toStringWithComma()
}
