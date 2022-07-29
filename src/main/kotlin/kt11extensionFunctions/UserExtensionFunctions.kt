package kt11extensionFunctions

import kt10dataClass.User

fun User.printUserInformation() {
    println("Name: $name")
    println("Birth date: $birthDate")
    println("Height: ${height ?: "No height informed"}")
}