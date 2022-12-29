package Classes

enum class DiasSemana(val id: Int, val nome: String, val util: Boolean){
    DOMINGO(1, "Domingo", false),
    SEGUNDA(2, "Segunda", true),
    TERCA(3,"Terça", true),
    QUARTA(4, "Quarta", true),
    QUINTA(5,"Quinta", true),
    SEXTA(6,"Sexta", true),
    SABADO(7,"Sabado", false)
}

fun main() {
    for (dia in DiasSemana.values()){
        println("O dia ${dia.nome} é um dia ${if (dia.util) "util" else "fds"}.")
    }
}