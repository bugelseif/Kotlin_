package Collections

fun main() {
    val map = HashMap<Long, String>()

    map.put(10010010020, "Norma")
    map.put(10010010030, "Tais")
    map.put(10010010040, "Renata")

    map.put(10010010040, "Karen") //subtitui

    for(par in map){
        println(par)
    }
    for(nome in map.values){
        println(nome)
    }

    for(cpf in  map.keys){
        println(cpf)
    }
    for((cpf, nome) in map){ //chave, valor
        println("$nome - CPF: $cpf")
    }
}