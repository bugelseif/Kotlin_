package Classes

val diretamenteNoArquivo = "Bom dia"

fun topLevel(){
    val local = "Fulano!"
    println("${diretamenteNoArquivo} ${local}")
}

class Exemplo{
    var variavelDeInstancia: String = "Boa noite"

    companion object{
        @JvmStatic val constanteDeClasse = "Cicrano"
    }
    fun fazer(){
        val local: Int = 7
        if (local>3){
            val variavelDeBloco = "Beltrano"
            println("$variavelDeInstancia, $constanteDeClasse, $local e $variavelDeBloco ")
        }
    }
}

fun main() {
    topLevel()
    Exemplo().fazer() // fun fazer precisa de um objeto instanciado
    println(Exemplo.constanteDeClasse) // membro static java, acessa diretamente da classe
}