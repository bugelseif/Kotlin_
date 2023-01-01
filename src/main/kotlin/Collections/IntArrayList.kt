package Collections

fun main() {
    val pares = arrayListOf(2,4,6,8)
    val impares = intArrayOf(1,3,5,7)

    for (numero in impares.union(pares).sorted()){
        print("$numero ")
    }

}