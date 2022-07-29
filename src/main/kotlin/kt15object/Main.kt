package kt15object

fun main() {
    val garfield = object : Cat {
        override fun purr() {
            println("**purrrrrrrr*")
        }

        override fun meow(whatIsTheCatSaying: String) {
            println("The cat says: $whatIsTheCatSaying")
        }

        override fun fetchGift(): String {
            return listOf("stick", "leaf", "bird", "rat", "mouse").random()
        }

        override fun drinkMilk(amount: Double) {
            MilkJar.removeMilk(amount)
            println("The cat is pleased that he drank $amount ml of milk from the jar")
            println("Milk remaining in the jar: ${MilkJar.milkLeft()} ml")
        }
    }

    // val milkJar = MilkJar() // Notice we cannot create another MilkJar, it is a SINGLETON in our program.

    val giftFromGarfield = garfield.fetchGift()
    println("Garfield got us a $giftFromGarfield")

    garfield.purr()

    garfield.meow("I hate mondays")

    garfield.drinkMilk(237.00)
    garfield.drinkMilk(322.50)

    try { // Tries to run this
        garfield.drinkMilk(501.25)
    } catch (e : Exception) { // Runs this if the block above raises an exception
        println("Tried to drink 501 ml of milk, but was not able to do so. Here's what the milk jar told me: ${e.message}")
    } finally { // Runs this regardless of success or fail
        println("I'm not sure whether or not the operation succeeded or failed... but I hope everyone is having a great lesson!")
    }
}