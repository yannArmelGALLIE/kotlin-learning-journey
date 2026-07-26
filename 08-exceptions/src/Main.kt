fun main(args: Array<String>) {
    val num1: Int = 9
    val num2: Int = 3
    try {
        val sous: Int = soustraction(num1, num2)
        println("$num1 - $num2 = $sous")
    } catch(e: Exception) {
        println(e.message)
    }

    val user = User("yann@gmail.com",null)
    val email = user.email ?: fail("Email requis")
    val password = user.password ?: fail("Mot de passe requis")
}

private fun soustraction(a: Int, b: Int): Int =
    if (a >= b) a - b
    else throw Exception("$a est plus petit que $b")

class User (val email: String?, val password: String?)

private fun fail(message: String): Nothing = throw IllegalStateException(message)
