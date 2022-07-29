package kt16scopeFunctions

import kotlin.random.Random

fun getRandomDouble(): Double {
    return Random.nextDouble().also {
        println("getRandomDouble generated $it")
    }
}

fun getRandomDoubleBoxed(): DoubleBox {
    return getRandomDouble().let { generatedDouble ->
        println("DoubleBox will be generated with $generatedDouble")
        DoubleBox(generatedDouble)
    }
}

fun main() {
    val doubleBox = getRandomDoubleBoxed()

    val car = CarBuilder().apply {
        color("Sapphire")
        wheelSize(20)
        directionType(DirectionType.ELECTRIC)
    }.build()

    val carPrice = car.run {
        var basePrice = 50_000.0
        if (this.hasHeatedSeats)
            basePrice += 5_000.99
        basePrice += when (this.transmissionType) {
            TransmissionType.MANUAL -> 3_000.50
            TransmissionType.AUTOMATIC -> 6_000.15
        }
        basePrice += when (this.directionType) {
            DirectionType.MECHANIC -> -5_000
            DirectionType.HYDRAULIC -> 1_500
            DirectionType.ELECTRIC -> 3_000
        }
        basePrice
    }

    println("Price for our vehicle is: $carPrice")

    val encapsulatedResult = car.runCatching {
        if (this.wheelSize > 18)
            throw IllegalStateException("This calculator cannot price vehicles with wheels larger than 18 inches")
        var basePrice = 50_000.0
        if (this.hasHeatedSeats)
            basePrice += 5_000.99
        basePrice += when (this.transmissionType) {
            TransmissionType.MANUAL -> 3_000.50
            TransmissionType.AUTOMATIC -> 6_000.15
        }
        basePrice += when (this.directionType) {
            DirectionType.MECHANIC -> -5_000
            DirectionType.HYDRAULIC -> 1_500
            DirectionType.ELECTRIC -> 3_000
        }
        basePrice
    }

    val vehiclePrice = if (encapsulatedResult.isSuccess) {
        encapsulatedResult.getOrNull() ?: throw IllegalStateException("Something went VERY wrong")
    } else null

    val exceptionOrNull = if (encapsulatedResult.isFailure) {
        encapsulatedResult.exceptionOrNull() ?: throw IllegalStateException("Something went VERY wrong")
    } else null

    // No one likes this one... avoid using it!
    with(car.color) {
        println("The color of the selected car is $this")
    }
}