package Collections

fun main() {
    val numeros = Array<Int>(10){i -> i*2}

    for (numero in numeros){
        println(numero)
    }
    println()
    println(numeros[1])
    println(numeros.get(2))
    println()
    numeros[1] = 20
    numeros.set(2,20)
    println(numeros[1])
    println(numeros.get(2))
}