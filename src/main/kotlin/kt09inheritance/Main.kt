package kt09inheritance

import kotlin.random.Random

// Inheritance
fun main() {
    // val vehicle = Vehicle() // Impossible, you cannot create an abstract class
    val coloredVehicle = ColoredVehicle("sapphire")
    coloredVehicle.color
    coloredVehicle.numberOfWheels
    coloredVehicle.getTopSpeed() // 250.0

    val turboColoredVehicle = TurboColoredVehicle("emerald")
    turboColoredVehicle.color
    turboColoredVehicle.numberOfWheels
    turboColoredVehicle.getTopSpeed() // 290.0
    turboColoredVehicle.turboBrand // accessible

    val turboColoredVehicleCastedToColoredVehicle = turboColoredVehicle as ColoredVehicle
    // turboColoredVehicleCastedToColoredVehicle.turboBrand // not accessible
    turboColoredVehicleCastedToColoredVehicle.getTopSpeed() // 250.0

    val randomTypeOfVehicle = if (Random.nextInt() % 2 == 0) {
        TurboColoredVehicle("emerald")
    } else {
        LowRiderVehicle("cyan")
    }

    if (randomTypeOfVehicle is LowRiderVehicle) {
        TODO()
    }

    val randomNumber = Random.nextInt()

    val anotherRandomTypeOfVehicle = when {
        randomNumber % 3 == 0 -> TurboColoredVehicle("emerald")
        randomNumber % 2 == 0 -> LowRiderVehicle("emerald")
        else -> BananaVehicle("yellow")
    }

    when (anotherRandomTypeOfVehicle) {
        is TurboColoredVehicle -> TODO()
        is LowRiderVehicle -> TODO()
        else -> TODO()
    }
}

abstract class Vehicle {
    val numberOfWheels = 4
    abstract fun getTopSpeed(): Double
}

open class ColoredVehicle(val color: String) : Vehicle() {
    override fun getTopSpeed(): Double {
        return 250.0
    }
}

class TurboColoredVehicle(color: String) : ColoredVehicle(color) {
    val turboBrand = "HKS"
    override fun getTopSpeed(): Double {
        return 290.0
    }
}

// Not possible because TurboColoredVehicle is not open
// class FlyingTurboColoredVehicle(color: String) : TurboColoredVehicle(color) {}

class LowRiderVehicle(color: String) : ColoredVehicle(color) {
    override fun getTopSpeed(): Double {
        return 125.0
    }
}

class BananaVehicle(color: String) : ColoredVehicle(color) {
    override fun getTopSpeed(): Double {
        return 0.0
    }
}