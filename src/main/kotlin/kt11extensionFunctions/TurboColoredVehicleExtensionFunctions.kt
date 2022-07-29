package kt11extensionFunctions

import kt09inheritance.TurboColoredVehicle

fun TurboColoredVehicle.getSpeedInfo(): String {
    return "Top speed is ${getTopSpeed()} with turbo-charger $turboBrand"
}