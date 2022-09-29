package open.close.principle.wrong

import open.close.principle.wrong.models.Vehicle

// Open close principle - wrong
object OpenClosePrincipleWrongUseCase {


    private fun addFuel(vehicle: Vehicle) {

        when (vehicle) {
            is Vehicle.OCPAirplaneModel -> println("Adding: ${vehicle.airplaneFuel}")
            is Vehicle.OCPCarModel -> println("Adding: ${vehicle.gasoline}")
            is Vehicle.OCPTrainModel -> println("Adding: ${vehicle.electricity}")
        }
    }

    fun runExample() {
        println("Open close principle - wrong")
        val car = Vehicle.OCPCarModel("gasoline")
        val train = Vehicle.OCPTrainModel("electricity")
        val airplane = Vehicle.OCPAirplaneModel("airplane fuel")

        addFuel(car)
        addFuel(train)
        addFuel(airplane)
        println("---")
    }
}