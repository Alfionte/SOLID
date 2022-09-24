package single.responsibility.principle.single.responsibility.views

import single.responsibility.principle.single.responsibility.PriceCalculator

interface PriceView {
    fun showPrice()
}

class PriceViewImpl(
    private val calculator: PriceCalculator,
) : PriceView {

    override fun showPrice() = println("SRP: Car price: ${calculator.calculatePrice()}")
}