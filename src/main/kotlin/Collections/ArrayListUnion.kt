package Collections

fun main() {
    val numeros = arrayListOf(1, 2, 3, 4)
    val nomes = arrayListOf("Morganna", "Pachi", "Lissa", "Luh")
    val uniao = numeros + nomes //sobrecarca de operador +

    for (item in uniao){
        print("$item ")
    }
}