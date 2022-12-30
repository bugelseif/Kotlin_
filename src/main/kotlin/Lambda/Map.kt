package Lambda

fun main() {
    val alunos = arrayListOf("Julia", "Mateus", "Ada", "Leo")
    alunos.map{ it.uppercase() }.apply { print(this) }
    println(alunos)
}