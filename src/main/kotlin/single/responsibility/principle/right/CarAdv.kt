package single.responsibility.principle.right

interface Adv {
    val advString: String
}

class CarAdv(private val calculator: PriceCalculator) : Adv {

    private val baseAdvString = "Best price here, today it's yours for just: "

    override val advString: String
        get() = baseAdvString + calculator.calculatePrice()
}