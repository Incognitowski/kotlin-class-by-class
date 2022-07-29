package kt15object

object MilkJar {
    private var milkRemaining = 1_000.0 // in milliliters

    fun milkLeft(): Double = milkRemaining

    fun removeMilk(amount: Double) {
        if (amount > milkRemaining)
            throw IllegalStateException("You tried to remove $amount ml from the milk jar, but it only contained $milkRemaining ml")
        milkRemaining -= amount
        if (milkRemaining == 0.0)
            println("The milk jar is empty :(")
    }

}