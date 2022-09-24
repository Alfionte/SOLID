import single.responsibility.principle.multiple.responsibility.Car
import single.responsibility.principle.single.responsibility.Adv
import single.responsibility.principle.single.responsibility.CarAdv
import single.responsibility.principle.single.responsibility.CarPriceCalculator
import single.responsibility.principle.single.responsibility.PriceCalculator
import single.responsibility.principle.single.responsibility.models.CarModel
import single.responsibility.principle.single.responsibility.views.*

/**
 * Single Responsibility Principle, what does it mean? It means that a software module should have one reason to change, then that's what I call a responsibility, a reason to change.
 *
 * Medium https://medium.com/@gabriele.porcelli/single-responsibility-principle-for-developers-uxers-testers-50f0e704d07f
 * Gist https://gist.github.com/xpepper/4981a717dd2a4f78e895
 */
fun main() {

    // Multiple responsibility
    val panda = Car("Panda", "blue", 100)
    println("Car rendered: ${panda.showCar()}")
    println("Car price: ${panda.calcPrice()}")
    println("Car adv: ${panda.getAdv()}")

    println("---")

    // Single responsibility

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