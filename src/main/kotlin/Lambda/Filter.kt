package Lambda

data class Aluno(val nome: String, val nota: Double)

fun main() {
    val alunos = arrayListOf(
        Aluno("Bruna", 7.5),
        Aluno("Morganna", 10.0),
        Aluno("Carlos", 4.4),
        Aluno("Joelma", 8.4),
        Aluno("Tomas", 5.0)
    )
    val aprovados = alunos.filter{ it.nota >= 7.0 }.sortedBy { it.nome }
    println(aprovados)

}