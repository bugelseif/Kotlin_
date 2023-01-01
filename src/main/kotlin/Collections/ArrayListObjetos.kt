package Collections

data class Fruta(var nome: String, var preco: Double)

fun main() {
    var frutas = arrayListOf(
        Fruta("Banana", 1.5),
        Fruta("Maça", 2.5),
        Fruta("Abacate", 5.5),
        Fruta("Limão",1.4),
        Fruta("Abacate", 4.5),

        )

    for(fruta in frutas){
        println("${fruta.nome} - ${fruta.preco}")
    }

    println(frutas[3])
    println(frutas.distinctBy { it.nome })
}