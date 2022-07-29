package kt14enum

fun getRandomJuiceFlavor(): JuiceFlavor = JuiceFlavor.values().random()

fun getRandomSpirit(): Spirit = Spirit.values().random()

fun generateRandomDrink(
    juiceFlavor: JuiceFlavor = getRandomJuiceFlavor(),
    spirit: Spirit = getRandomSpirit(),
): Drink {
    return Drink(juiceFlavor, spirit)
}

fun main() {
    val theWorstDrinkOfAllHumanHistory = Drink(
        JuiceFlavor.GRAPE,
        Spirit.WHISKY
    )

    val randomDrinkWithGin = generateRandomDrink(spirit = Spirit.GIN)

    val randomDrinkWithWatermelonJuice = generateRandomDrink(juiceFlavor = JuiceFlavor.WATERMELON)

    val reallyRandomDrink = generateRandomDrink()

    println(buildString {
        append("Our random drink contains ${reallyRandomDrink.juiceFlavor} juice,")
        append("and ${reallyRandomDrink.spirit} with an alcohol content of ${reallyRandomDrink.spirit.alcoholPercentage}")
    })
}