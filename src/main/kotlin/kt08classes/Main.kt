package kt08classes

// Classes
fun main() {
    val classA = ClassA()
    classA.doWhatever()

    val classB = ClassB(3)
    classB.doWhatever()

    val classC = ClassC(3)
    classC.thatGuysFavoriteNumber
    classC.doWhatever()

    val classD = ClassD(3)
    classD.yourFavoriteNumber
    classD.doWhatever()

    val classE = ClassE(3)
    classE.doWhatever()
    // barFour.thatGuysFavoriteNumberButHidden is not accessible here

    val classF = ClassF(3)
    classF.doWhatever()
    // barFive.thatGuysFavoriteNumberTimesTwo is not accessible here

}

class ClassA {
    fun doWhatever() {
        TODO()
    }
}

class ClassB(yourFavoriteNumber: Long) {
    fun doWhatever() {
        // yourFavoriteNumber is not accessible here
    }
}

class ClassC(yourFavoriteNumber: Long) {

    val thatGuysFavoriteNumber = yourFavoriteNumber

    fun doWhatever() {
        // yourFavoriteNumber is not accessible here
        // but thatGuysFavoriteNumber is
        thatGuysFavoriteNumber
    }
}

class ClassD(val yourFavoriteNumber: Long) {

    fun doWhatever() {
        yourFavoriteNumber
    }
}

class ClassE(private val yourFavoriteNumber: Long) {

    fun doWhatever() {
        yourFavoriteNumber
    }
}

class ClassF(yourFavoriteNumber: Long) {

    private val thatGuysFavoriteNumberTimesTwo: Long

    init {
        thatGuysFavoriteNumberTimesTwo = yourFavoriteNumber * 2
    }

    fun doWhatever() {
        // yourFavoriteNumber is not accessible here
    }
}

