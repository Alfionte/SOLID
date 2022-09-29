package single.responsibility.principle.right.views

import single.responsibility.principle.right.Adv

interface AdvView {
    fun showAdv()
}

class AdvViewImpl(
    private val adv: Adv,
) : AdvView {

    override fun showAdv() = println("SRP: Car adv: ${adv.advString}")
}