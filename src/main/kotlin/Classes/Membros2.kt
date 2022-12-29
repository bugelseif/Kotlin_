package Classes

class Calculadora{
    private var resultado: Int = 0

    fun somar(vararg valores: Int) : Calculadora{
        valores.forEach { resultado += it }
        return this
    }
    fun multi(valor: Int): Calculadora{
        resultado *= valor
        return this
    }
    fun limpar(): Calculadora{
        resultado = 0
        return this
    }
    fun print(): Calculadora{
        println(resultado)
        return this
    }
    fun obterResultado(): Int{
        return resultado
    }
}

fun main() {
    val calculadora = Calculadora()
    calculadora.somar(1,2,3).multi(2).print()
    calculadora.multi(5).print().limpar()

    calculadora.somar(6,6,6)
    println(calculadora.obterResultado())
}