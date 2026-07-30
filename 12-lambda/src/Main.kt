import Operator

//Une lambda  est une fonction que l'on pourra directement utiliser en tant que valeur,
//une fonction qui n'a pas de nom  sans  le mot clé fun

fun main() {
    //Une lambda
    { println("Hello World!") }

    //Une fonction anonyme
    fun() { println("Hello World!") }

    println(Operator().addition(5, 6))
    println(Operator().soustraction(9, 3))
    println(Operator().division(12, 6))

    println(Operator().executeOperation(1, 2, Operator().addition))
    println(Operator().executeOperation(19, 10, Operator().soustraction))
    println(Operator().executeOperation(81, 9, Operator().division))
}