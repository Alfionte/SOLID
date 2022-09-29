package open.close.principle.right.models


sealed class Vehicle {

    data class OCPCarModel(val gasoline: String) : Vehicle(), Refillable {
        override fun getFuel() = gasoline
    }

    data class OCPTrainModel(val electricity: String) : Vehicle(), Refillable {
        override fun getFuel() = electricity
    }

    data class OCPAirplaneModel(val airplaneFuel: String) : Vehicle(), Refillable {
        override fun getFuel() = airplaneFuel
    }
}

interface Refillable{
    fun getFuel() : String
}



