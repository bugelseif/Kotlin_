package Collections

fun main() {
    val map = hashMapOf(1 to "Mis", 2 to "Pure", 3 to "Old")

    for((id, nome) in map){
        println("$id) $nome")
    }
}