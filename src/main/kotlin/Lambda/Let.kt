package Lambda

fun main() {
    val listaComNulos: List<String?> = listOf("A", null,"B", null,"C", null)
    for (item in listaComNulos){
        item?.let{
            println(it)
        }
    }
}