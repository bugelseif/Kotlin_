package Classes

class Produto(var nome:String, var preco: Double, var desconto: Double, var ativo: Boolean){
    val inativo: Boolean get() = !ativo
    val precoDesconto: Double get() = preco * (1-desconto)
}

fun main() {
    val p1 = Produto("carro", 200.0, 0.2, ativo = true)
    println(p1.precoDesconto)
    println(p1.preco)

    val p2 = Produto("aviao", 500.0,.3, ativo = false)
    println("${p2.nome}\n\t De: R$${p2.preco} \n\tPor: R$${p2.precoDesconto}")

    if(p2.inativo){
        p2.preco = 0.0
        println("Depois de inativo: R$ ${p2.precoDesconto}")
    }
}