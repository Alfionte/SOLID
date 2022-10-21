package dependency.inversion.principle.wrong


class Arms {
    fun grabFood() {
        println("I take food - direct implementation")
    }
}

class Legs {
    fun walk() {
        println("I walk - direct implementation")
    }
}

class Cyborg(
    private val arms: Arms = Arms(),
    private val legs: Legs = Legs()
) {

    init {
        println("I'm a cyborg")
    }

    fun grabFood() = arms.grabFood()

    fun walk() = legs.walk()

}