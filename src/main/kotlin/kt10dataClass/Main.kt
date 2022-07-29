package kt10dataClass

import java.time.LocalDate

// Data

data class User(
    val name: String,
    val birthDate: LocalDate,
    val height: Double? = null
)

fun main() {
    val user = User("Junior", LocalDate.of(1999, 6, 7), 1.74) // Full information

    val anotherUser = User("Christopher", LocalDate.of(2002, 10, 22)) // We skipped "height", so null is the default

    val userWithNamedParameters = User(
        // Notice that, by using named parameters, we can "randomize" the order in which we inform stuff
        birthDate = LocalDate.of(1987, 12, 12),
        name = "Carlos",
        height = 1.87, // notice this trailing comma, it's useful for a prettier versioning :)
    )

    printUserInformation(user)

    println(anotherUser)

    val copyOfUser = userWithNamedParameters.copy(height = 2.07)

    copyOfUser.hashCode()
    copyOfUser.toString()
}

fun printUserInformation(user: User) {
    println("Name: ${user.name}")
    println("Birth date: ${user.birthDate}")
    println("Height: ${user.height ?: "No height informed"}")
}