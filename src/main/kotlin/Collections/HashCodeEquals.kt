package Collections

class Objeto(val nome: String, val descricao: String){
    override fun hashCode(): Int {
        return nome.length
    }

    override fun equals(other: Any?): Boolean {
        if(other is Objeto){
            return nome.equals(other.nome, ignoreCase = true)
        }
        return false
    }
}

fun main() {
    val conjunto = hashSetOf(
        Objeto("Mesa", "madeira e parafusos"),
        Objeto("Cadeira", "não tem ):"),
        Objeto("faca", "metal"),
        Objeto("Copo", "vrido")
    )

    conjunto.contains(Objeto("faca", "preta")).print()
}