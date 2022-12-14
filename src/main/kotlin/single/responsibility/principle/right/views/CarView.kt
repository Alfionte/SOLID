package single.responsibility.principle.right.views

import single.responsibility.principle.right.models.CarModel

interface CarView {
    fun showCar()
}

class CarViewImpl(
    private val car: CarModel,
) : CarView {

    override fun showCar() = println("SRP: Car rendered: this is a ${car.color} ${car.model}")
}