package Avancado

class Caixa<T>(val objeto: T){
    private val objetos = ArrayList<T>()

    init {
        adicionar(objeto)
    }

    fun adicionar(novoObjeto: T){
        objetos.add(novoObjeto)
    }

    override fun toString(): String = objetos.toString()
}

fun main() {
    val champ = Caixa("Lux")
    champ.adicionar("Zyra")
    champ.adicionar("Karma")
    champ.adicionar("Zoe")
    champ.adicionar("Malzahar")

    println(champ)

    val num = Caixa(1)
    num.adicionar(2)
    num.adicionar(3)
    num.adicionar(4)
    num.adicionar(5)
    num.adicionar(6)

    println(num)
}