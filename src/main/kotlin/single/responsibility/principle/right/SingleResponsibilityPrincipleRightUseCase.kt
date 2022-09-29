package single.responsibility.principle.right

import single.responsibility.principle.right.models.CarModel
import single.responsibility.principle.right.views.*

/**
 * Single Responsibility Principle, what does it mean? It means that a software module should have one reason to change, then that's what I call a responsibility, a reason to change.
 *
 * Medium https://medium.com/@gabriele.porcelli/single-responsibility-principle-for-developers-uxers-testers-50f0e704d07f
 * Gist https://gist.github.com/xpepper/4981a717dd2a4f78e895
 */
object SingleResponsibilityPrincipleRightUseCase {

    fun runExample() {
        println("Single responsibility principle right")

        val bmwX6 = CarModel("X6", "blue", 600)
        val calculator: PriceCalculator = CarPriceCalculator(bmwX6)
        val adv: Adv = CarAdv(calculator)

        val carView: CarView = CarViewImpl(bmwX6)
        val priceView: PriceView = PriceViewImpl(calculator)
        val advView: AdvView = AdvViewImpl(adv)

        carView.showCar()
        priceView.showPrice()
        advView.showAdv()

        println("---")
    }
}