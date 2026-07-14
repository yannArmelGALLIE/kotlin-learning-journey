import kotlin.math.min

//fun pour définir une fonction et la nommer
//args pour déclarer le type

fun main(args:  Array<String>) {
    println(minOf(1,2))
    println(minOf(15, 10))

    //Une expression est un bloc de code qui peut retourner une valeur
    minOf(12, 22)

    //Une instruction est un bloc de code qui ne retourne aucune valeur
    val nom: String = "GALLIE"
}

private fun minOf(a: Int, b: Int): Int {
    return if (a > b) a else b
}