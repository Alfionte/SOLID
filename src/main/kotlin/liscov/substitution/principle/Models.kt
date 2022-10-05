package liscov.substitution.principle

open class Bird {
    open fun fly() {
        println("I'm a bird and I can fly")
    }
}

class Seagull : Bird() {
    override fun fly() {
        println("I'm a seagull and I can fly")
    }
}

class Penguin : Bird() {
    override fun fly() {
        println("I'm a penguin, I'm also a bird but I cannot fly ;_;")
    }
}
