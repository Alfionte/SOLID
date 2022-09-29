package open.close.principle.wrong.models


sealed class Vehicle {

    data class OCPCarModel(val gasoline: String) : Vehicle()

    data class OCPTrainModel(val electricity: String) : Vehicle()

    data class OCPAirplaneModel(val airplaneFuel: String) : Vehicle()
}



