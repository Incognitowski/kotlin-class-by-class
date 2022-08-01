package kt17readingFromResources

object ResourceReader {

    fun readFile(): String {
        return this::class.java.getResource("/kt17/i_used_to_be_an_adventurer_like_you.txt").readText()
    }

}

fun main() {
    val contentOfFile = ResourceReader.readFile()
    val howManyLines = contentOfFile.lines().size

    println("Total lines in file: $howManyLines")
    println("I used to be an adventurer like you... ")
    println(contentOfFile)
}