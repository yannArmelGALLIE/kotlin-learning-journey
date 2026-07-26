fun main(args: Array<String>) {
    val texte = "Bonjour tout le monde"
    println(getDefaultSize(texte))

    val tableau = listOf<String>("Bonjour", "Tout", "Le", "Monde")
    println(getDefaultSize(tableau))
}

fun getDefaultSize(anyObject: Any): Int = when(anyObject) {
    is String -> anyObject.length
    is List<*> -> anyObject.size
    else -> 0
}