package oo.polimorfismo

class Feijao(val peso:Double)
class Arroz(val peso: Double)

class Pessoa(var peso: Double){
    fun comer(feijao: Feijao){
        peso += feijao.peso
    }
    fun comer(arroz: Arroz){
        peso += arroz.peso
    }
}

fun main() {
    val feijao = Feijao(0.300)
    val arroz = Arroz(0.400)

    val bruna = Pessoa(60.0)
    bruna.comer(feijao)
    bruna.comer(arroz)

    println(bruna.peso)

}
