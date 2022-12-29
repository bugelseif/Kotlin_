package Classes

class Cliente{
    var nome: String = ""
}

fun main() {
    val cliente = Cliente()
    cliente.nome = "Bruna"
    println(cliente.nome)
}