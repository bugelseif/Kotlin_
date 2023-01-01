package Collections

fun Any.print() = println(this)

fun main() {
    val conjunto = hashSetOf(2, "love", 5.5, true, 'a') // rw

    conjunto.add("Oi").print()
    conjunto.add(2).print()

    conjunto.contains('a').print()


    val num = setOf(1,2,3) //somente leitura

    (conjunto + num).print()
}