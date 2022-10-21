package dependency.inversion.principle.wrong


/* Dependency Inversion Principle
   Entities must depend on abstractions, not on concretions. It states that the high-level module must not depend on the low-level module, but they should depend on abstractions.
 */
object DependencyInversionPrincipleWrongUseCase {

    fun runExample() {
        println("Dependency Inversion Principle - wrong")

        Cyborg().let {
            it.grabFood()
            it.walk()
        }

        println("---")
    }
}