package Classes

class Pessoa1(var nome: String)
class Pessoa2(val nome: String)
class Pessoa3(nomeInicial: String){
    val nome: String = nomeInicial
}

fun main() {
    val p1 = Pessoa1(nome = "Kastro")
    p1.nome = "Morganna"
    println("${p1.nome}")

    val p2 = Pessoa2("Amanda")
    val p3 = Pessoa3(nomeInicial = "Bruna")

    println("${p2.nome} e ${p3.nome} sz")
}
