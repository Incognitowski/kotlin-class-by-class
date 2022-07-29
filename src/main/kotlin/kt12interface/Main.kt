package kt12interface

// Interfaces

open class CoffeeMaker : ICoffeeMaker {

    private val amountPerCup = 110.0

    private var beanType: CoffeeBean? = null

    override fun addBeans(type: CoffeeBean) {
        beanType = type
    }

    override fun makeCoffee(): Coffee {
        val beanType = beanType ?: throw Exception("No beans where added to the machine")
        return Coffee(amountPerCup, beanType)
    }
}

class SuperCoffeeMaker : CoffeeMaker(), IMilkFrother {
    override fun frothMilk(coffee: Coffee): Coffee {
        println("Frothing milk of coffee with bean type '${coffee.bean.placeOfOrigin}'...")
        return coffee
    }
}

fun main() {
    val coffeeMaker = CoffeeMaker()
    coffeeMaker.addBeans(CoffeeBean("India"))
    val coffee = coffeeMaker.makeCoffee()
    println(coffee)

    val superCoffeeMaker = SuperCoffeeMaker()
    superCoffeeMaker.addBeans(CoffeeBean("Nepal"))
    val anotherCoffee = superCoffeeMaker.makeCoffee()
    superCoffeeMaker.frothMilk(anotherCoffee)
    println(anotherCoffee)
}