import Button
import User

fun main() {
    var button =  Button()
    var button2 = Button("Vert", "Valider")
    var button3 = Button(text="Confirmer", color="Bleu")

    button.showColor()
    button2.showColor()
    button3.showColor()

    var user1 = User("gallie@gmail.com", "mdp", true)
    var user2 = User.newInstanceAfterSignUp("yann@gmail.com","motDEPasse")

    println(user1.toString())
    println(user2.toString())

    if (user1 == user2) {
        println("Ils sont égaux")
    } else {
        println("Ils sont différents")
    }
}