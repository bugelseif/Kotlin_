package Collections

fun main() {
    val string = arrayListOf("bolsa", "mala", "mochila", "sacola") // inferencia de dado implicita

    for (item in string){
        println(item.uppercase())
    }
}