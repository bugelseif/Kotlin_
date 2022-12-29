package Classes

class Filme{
    val nome: String
    val anoLancamento: Int
    val genero:String

    constructor(nome:String, anoLancamento:Int, genero: String){
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main() {
    val filme = Filme("Arcane", 2020, "Animação")
    println("${filme.nome} foi lançado em ${filme.anoLancamento}")
}