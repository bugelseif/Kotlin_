package Lambda

class Calculadora1 {
    var resultado = 0

    fun soma(valor1: Int, valor2: Int){
        resultado += valor1 + valor2
    }

    fun add(valor: Int){
        resultado += valor
    }
}

fun main() {
    val calculadora = Calculadora1()
    calculadora.apply { soma(5,4) }.apply { add(5) }.apply { println(resultado) }

    calculadora.apply {
        soma(5,4)
        add(5)
        println(resultado)
    }

    with(calculadora){
        soma(4,5)
        add(5)
        println(resultado)
    }
}