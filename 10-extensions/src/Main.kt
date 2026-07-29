import extensions.sayHello
import extensions.firstLetter

fun main() {
    val message: String = "Je m'appelle Yann-Armel"
    message.sayHello()

    val message2 = StringBuilder("gallie")
    println("${message2.firstLetter} est la première lettre de $message2")
    message2.firstLetter = 'G'
    println("${message2.firstLetter} est la première lettre de $message2")
}