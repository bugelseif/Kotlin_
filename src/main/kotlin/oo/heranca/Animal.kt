package oo.heranca

open class Animal(val nome: String)

class Cachorro: Animal{
    private val altura: Double

    constructor(nome: String, altura:Double): super(nome){
        this.altura = altura
    }

    constructor(nome: String) : this(nome, 0.0)

    override fun toString(): String {
        return "$nome tem $altura cm."
    }
}

fun main() {
    val dog = Cachorro("Carl", 25.0)
    val dog2 = Cachorro("Loren") //altura padrão do construtor

    println(dog)
    println(dog2)

}