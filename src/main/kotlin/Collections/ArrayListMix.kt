package Collections

fun main() {
    val listaMix = arrayListOf("Amanda", 7, 1.5, true, 'w')

    for(item in listaMix){
        if(item is String){
            println(item.uppercase())
        }else{
            println(item)
        }
    }
}