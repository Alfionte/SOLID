package open.close.principle.right

import open.close.principle.right.models.Refillable
import open.close.principle.right.models.Vehicle

// Open close principle - right
object OpenClosePrincipleRightUseCase {

    private fun addFuel(refillable: Refillable) {
        println("Adding: ${refillable.getFuel()}")
    }

    fun runExample() {
        println("Open close principle - right")

        val car = Vehicle.OCPCarModel("gasoline")
        val train = Vehicle.OCPTrainModel("electricity")
        val airplane = Vehicle.OCPAirplaneModel("airplane fuel")

        addFuel(car)
        addFuel(train)
        addFuel(airplane)
        println("---")
    }
}