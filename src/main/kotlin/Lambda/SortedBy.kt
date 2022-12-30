package Lambda

fun main() {
    val nomes = arrayListOf("Pachi", "Carol", "Lissa", "Vivis", "Amanda")
    var ordenados = nomes.sortedBy { it }
    println(ordenados)
    ordenados = nomes.sortedBy { it.reversed() }
    println(ordenados)

}