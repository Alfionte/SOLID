package liscov.substitution.principle


/*  Liskov Substitution Principle (Behavioural subtyping)
    Let Φ(x) be a property provable about objects x of type T. Then Φ(y) should be true for objects y of type S where S is a subtype of T.
    A sub type should behave like a super type as far as you can tell by using the super type methods.
    (So it's not that the sub type cannot behave differently, but as long as you limit your interactions to the super type methods, it should behave as expected)
 */
object LiscovPrincipleWrongUseCase {

    private fun fly(bird: Bird) {
        bird.fly()
    }

    fun runExample() {
        println("Liscov substitution principle - wrong")

        fly(Bird())
        fly(Seagull())
        fly(Penguin())

        println("---")
    }
}