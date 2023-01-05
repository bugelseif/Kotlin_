package oo.polimorfismo

open class Comida(val peso: Double)
class Feijao2(peso: Double) : Comida(peso)
class Arroz2(peso: Double) : Comida(peso)
class Ovo(peso: Double) : Comida(peso)

class Pessoa2(var peso: Double){
    fun comer(comida: Comida){
        peso += comida.peso
    }
}

fun main() {
    val feijao = Feijao2(0.300)
    val arroz = Arroz2(0.400)
    val ovo = Ovo(0.100)

    val bruna = Pessoa2(60.0)
    bruna.comer(feijao)
    bruna.comer(arroz)
    bruna.comer(ovo)

    println(bruna.peso)

}
