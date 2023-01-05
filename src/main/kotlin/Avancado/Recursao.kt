package Avancado

var result: Int = 1
var atual: Int = 0

fun fatorial(num: Int) : Int{
    result *= num
    atual = num
    if(atual != 1){
        atual -= 1
        return fatorial(atual)
    }
    return result
}

//--------
fun fatorialRefactor(num: Int): Int = when(num){
    in 0..1 -> 1
    in 2..Int.MAX_VALUE -> num * fatorialRefactor(num - 1)
    else -> throw IllegalArgumentException("Numero negativo")
}

fun main() {
    println(fatorial(5))
    println(fatorialRefactor(5))

}