package single.responsibility.principle.right.views

import single.responsibility.principle.right.PriceCalculator

interface PriceView {
    fun showPrice()
}

class PriceViewImpl(
    private val calculator: PriceCalculator,
) : PriceView {

    override fun showPrice() = println("SRP: Car price: ${calculator.calculatePrice()}")
}