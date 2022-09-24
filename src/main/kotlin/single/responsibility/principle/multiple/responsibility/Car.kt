package single.responsibility.principle.multiple.responsibility

data class Car(
    var model: String,
    private val color: String,
    private val rawPrice: Int,
) {

    private val taxes = 30

    // UI designers
    fun showCar() = "this is a $color $model"

    // Financial department
    fun calcPrice() = rawPrice - taxes

    // Marketing
    fun getAdv() = "Best price here, today it's yours for just ${calcPrice() }"

}