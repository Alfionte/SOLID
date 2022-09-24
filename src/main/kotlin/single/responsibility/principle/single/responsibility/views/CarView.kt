package single.responsibility.principle.single.responsibility.views

import single.responsibility.principle.single.responsibility.models.CarModel

interface CarView {
    fun showCar()
}

class CarViewImpl(
    private val car: CarModel,
) : CarView {

    override fun showCar() = println("SRP: Car rendered: this is a ${car.color} ${car.model}")
}