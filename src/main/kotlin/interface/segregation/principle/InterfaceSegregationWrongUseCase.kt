package `interface`.segregation.principle


/*  Interface Segregation Principle
    A client should never be forced to implement an interface that it doesn’t use, or clients shouldn’t be forced to depend on methods they do not use.
*/
object InterfaceSegregationWrongUseCase {

    fun runExample() {
        println("Interface segregation principle")
        println("We can consider it as the Liscov substitution principle applied to interfaces.")
        println("---")
    }
}