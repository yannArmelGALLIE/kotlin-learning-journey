//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //1 Avec val la variable est immuable
    val question: String = "Quel est ton nom ?"
    println("Question : $question")

    //2 Avec var la variable est  muable
    var question2: String = "Quel est ton nom ?"
    question2 = "Quel est ton âge ?"
    println("Question 2 : $question2")

    // Les types  = String, Int, Boolean
    val nom: String = "GALLIE"
    val age: Int = 20
    val etudiant: Boolean = true
    println("Je m'appelle $nom et j'ai $age ans")

    val message: String
    if (etudiant) {
        message = "Je suis étudiant"
    } else {
        message = "Je ne suis pas étudiant"
    }
    println(message)

    var alerte: String? = "Cette variable peut être null"
    println(alerte?.uppercase())

    println(API_URL)
}

//Une constante  est une variable dont la valeur est connue au moment de la compilation
const val API_URL: String = "https://mon_api.com"