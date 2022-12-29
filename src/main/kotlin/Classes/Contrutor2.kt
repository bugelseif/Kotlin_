package Classes

class Filme2(val nome: String, val anoLancamento: Int, val genero: String)

fun main() {
    val filme = Filme2("Interestellar", 2000, "Ficção")
    println("${filme.nome} foi lançado em ${filme.anoLancamento}, genero: ${filme.genero}")
}