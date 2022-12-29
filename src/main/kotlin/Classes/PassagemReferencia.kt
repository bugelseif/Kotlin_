package Classes

//fun porReferencia(velocidade: Int){
//    velocidade++
//}

data class Carro(var nome: String, var velocidade: Int = 0)

fun porReferencia(carro: Carro){
    carro.velocidade++
}

fun main() {
    var carro1 = Carro("carrinho")
    var carro2 = carro1
    carro2.nome = "muda o carro1"

    println(carro1)
    println(carro2)

    carro1 = Carro("novo carro")
    porReferencia(carro1)

    println(carro1)
    println(carro2)
}