package Collections

fun main() {
    val aprovados = hashSetOf("Maria", "Fernanda", "Teresa", "Joana")
    aprovados.add("Natalia")
    for(aprovado in aprovados){
        aprovado.print()
    }

    val aprovadosOrdemInsercao = linkedSetOf("Maria", "Fernanda", "Teresa", "Joana")
    for(aprovado in aprovadosOrdemInsercao){
        aprovado.print()
    }

    val aprovadosOrdemAlfabetica = sortedSetOf("Maria", "Fernanda", "Teresa", "Joana")
    for(aprovado in aprovadosOrdemAlfabetica){
        aprovado.print()
    }

    //definir a ordenação
    aprovados.sortedBy { it.substring(1) }.print()

}