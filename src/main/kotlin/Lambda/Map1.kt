package Lambda

class Produto(val nome: String, val preco: Double)

val materialEscolar = listOf(
    Produto("Lapis de cor", 21.9),
    Produto("Caneta", 1.9),
    Produto("Regua", 2.7),
    Produto("Borracha", 5.8),
    Produto("Apontador", 8.9),
)

fun main() {
    val totalizar = { total: Double, atual: Double -> total + atual }
    val precoTotal = materialEscolar.map { it.preco }.reduce(totalizar)
    println(precoTotal)
}