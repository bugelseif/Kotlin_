package Lambda

fun main() {
    val soma = {x: Int, y: Int ->
        x+y // return ultima linha
    }
    println(soma(1,2))
}