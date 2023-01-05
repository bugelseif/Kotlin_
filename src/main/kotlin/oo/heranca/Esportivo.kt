package oo.heranca

interface Esportivo {
    var turbo: Boolean

    // implementação padrão da interface
    fun ligarTurbo(){
        turbo=true
    }
    fun desligarTurbo(){
        turbo=false
    }
}