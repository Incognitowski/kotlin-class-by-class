package kt12interface

interface ICoffeeMaker {
    fun addBeans(type: CoffeeBean)
    fun makeCoffee(): Coffee
}