package single.responsibility.principle.single.responsibility.views

import single.responsibility.principle.single.responsibility.Adv

interface AdvView {
    fun showAdv()
}

class AdvViewImpl(
    private val adv: Adv,
) : AdvView {

    override fun showAdv() = println("SRP: Car adv: ${adv.advString}")
}