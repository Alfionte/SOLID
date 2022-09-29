package single.responsibility.principle.wrong

/**
 * Single Responsibility Principle, what does it mean? It means that a software module should have one reason to change, then that's what I call a responsibility, a reason to change.
 *
 * Medium https://medium.com/@gabriele.porcelli/single-responsibility-principle-for-developers-uxers-testers-50f0e704d07f
 * Gist https://gist.github.com/xpepper/4981a717dd2a4f78e895
 */
object SingleResponsibilityPrincipleWrongUseCase {

    fun runExample() {
        println("Single responsibility principle wrong")
        // Multiple responsibility
        val panda = Car("Panda", "blue", 100)
        println("Car rendered: ${panda.showCar()}")
        println("Car price: ${panda.calcPrice()}")
        println("Car adv: ${panda.getAdv()}")

        println("---")
    }
}