package dependency.inversion.principle.right

interface GrabFoodCapability {
    fun grabFood()
}

interface WalkCapability {
    fun walk()
}

class Arms : GrabFoodCapability{
    override fun grabFood() {
        println("I take food")
    }
}

class Legs : WalkCapability{
    override fun walk() {
        println("I walk")
    }
}

class Cyborg(
    private val grabFoodCapability: GrabFoodCapability,
    private val walkCapability: WalkCapability
) {

    init {
        println("I'm a cyborg")
    }

    fun getFood() = grabFoodCapability.grabFood()

    fun walk() = walkCapability.walk()

}