package Lambda

fun main() {
    println("Digite a mensagem")
    val entrada = readLine()
    val mensagem = entrada.takeIf { it?.trim() != "" } ?: "Sem mensagem"

    println(mensagem)
}