import utils.logMessage

fun main(args: Array<String>) {
    logMessage("C'est mon message")
    repetitiveMessage("Tentative de connexion...", "Un problème est survenu", 3,1000, false)
}

fun repetitiveMessage(message: String, errorMessage: String, repeat: Int, delay: Int, isSilent: Boolean) {

    fun delayFunction() {
        try {
            Thread.sleep(delay.toLong())
        } catch (e: InterruptedException) {
            println(errorMessage)
        }
    }

    fun printMessage(i: Int) {
        if (!isSilent) println("$message $i time(s)")
    }

    delayFunction()
    for (i in 0 until repeat) printMessage(i)
}