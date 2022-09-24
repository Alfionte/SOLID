package single.responsibility.principle.single.responsibility

import single.responsibility.principle.single.responsibility.models.CarModel

interface PriceCalculator {
    fun calculatePrice(): Int
}

class CarPriceCalculator(private val carModel: CarModel) : PriceCalculator {
    private val taxes = 30

    override fun calculatePrice() = carModel.rawPrice - taxes
}