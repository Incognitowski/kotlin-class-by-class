package kt07readingFromAndWritingToTerminal

// Reading from and writing to the terminal window.
fun main() {
    println("Hello from Kotlin! What is your name?")
    val userName = readlnOrNull()
        ?: throw Exception("Your name cannot be blank.")
    println("Hi, $userName. Please, input your favorite number (you can use decimals as well):")
    val hisFavoriteNumber = readlnOrNull()?.toLongOrNull()
        ?: throw Exception("Sorry, that seems to be an invalid number...")
    println("It's so great to know that $userName's favorite number is $hisFavoriteNumber. Bye bye :)")
}