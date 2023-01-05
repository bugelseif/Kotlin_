package oo.encapsulamento

import Collections.print

private val dentroDoArquivo = 1
//protected val somenteDentroDeClasses = 2
internal val dentroDoProjeto = 3
val publica = 4

open class Capsula(){  // open = classe aberta para herança
    private val dentroDaClasse = 1
    protected val porHeranca = 2
    internal val dentroDoProjeto = 3
    val publica = 4
}

class CapsulaFilha : Capsula(){
    fun verificarAcessos(){
//        println(Capsula().dentroDaClasse) // privada na superclasse
//        println(Capsula().porHeranca) // não precisa instancias a superclasse
        println(porHeranca)
        println(dentroDoProjeto)
        println(publica)
    }
}

fun topLevel(){
//        println(Capsula().dentroDaClasse) // privada na superclasse
//        println(Capsula().porHeranca) // fun top level não herda
    println(dentroDoProjeto)
    println(publica)
}

