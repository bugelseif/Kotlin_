package Avancado

annotation class Positivo
annotation class NaoVazio

class Pessoa(id: Int, nome: String){
    @Positivo
    var id: Int = id

    @NaoVazio
    var nome: String= nome
}

//Reflexao
fun getValor(obj: Any, nomeAtributo: String): Any {
    val atributo = obj.javaClass.getDeclaredField(nomeAtributo) // retorna o atributo
    val estaAcessivel = atributo.canAccess(obj) // verifica o nivel de acesso

    atributo.isAccessible = true // torna o atributo acessivel
    val valor = atributo.get(obj) // retorna o valor do atributo
    atributo.isAccessible = estaAcessivel // torna o atributo com nivel de acesso original

    return valor
}

fun validar(obj: Any): List<String>{ // string não vazia
    val msgs = ArrayList<String>()
    obj::class.members.forEach{ member-> //acessa a classe
        member.annotations.forEach{ annotation ->
            val valor = getValor(obj, member.name)
            when(annotation){
                is Positivo ->
                    if(valor !is Int || valor <= 0){
                        msgs.add("O valor $valor não é positivo")
                    }
                is NaoVazio ->
                    if(valor !is String || valor.trim().isEmpty()){
                        msgs.add("O valor $valor atual não é uma String valida")
                    }
            }
        }
    }
    return msgs
}

fun main() {
    val obj1 = Pessoa(2, "Andry")
    println(validar(obj1))

//    val obj2 = Pessoa(-1, "")
//    println(validar(obj2))
}