package Collections

fun main() {
    val alunos = arrayListOf("Carol", "Patricia", "Carla", "Anne")

    for (aluno in alunos){
        println(aluno)
    }

    for((indice, aluno) in alunos.withIndex()){
        println("$indice - $aluno")
    }
}