package Classes

class Geladeira(val marca: String, val litros: Int)
data class Televisao(val marca: String, val polegadas: Int)

fun main() {
    val g1 = Geladeira("Brastemp", 320)
    val g2 = Geladeira("Brastemp", 320)

    println(g1 == g2) // equals(não implementado) - compara os objetos - false
    println(g1.toString()) // toString(não implementado)

    val t1 = Televisao("Samsung", 32)
    val t2 = Televisao("Samsung", 32)

    println(t1 == t2) // equals - compara dos dados dos objetos - true
    println(t1 === t2) // equals - compara o endereço de memoria
    println(t1.toString())
    println(t1.copy(polegadas = 50)) // não altera a referencia
    println(t1.toString())

    // destruturing em data class
    val(marca, pol) = t1
    println("$marca $pol'")
}