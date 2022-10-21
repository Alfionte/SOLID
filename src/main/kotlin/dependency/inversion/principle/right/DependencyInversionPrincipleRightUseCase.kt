package dependency.inversion.principle.right


/* Dependency Inversion Principle
   Entities must depend on abstractions, not on concretions. It states that the high-level module must not depend on the low-level module, but they should depend on abstractions.
 */
object DependencyInversionPrincipleRightUseCase {

    fun runExample() {
        println("Dependency Inversion Principle - right")

        Cyborg(
            Arms(),
            Legs()
        ).let {
            it.getFood()
            it.walk()
        }

        println("---")
    }
}