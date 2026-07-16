//On utilise class pour créer une classe suivi du nom de celle-ci

fun  main (args: Array<String>) {
    var user1 = User("koffi@gmail.com", "mdp", 20)

    println("Mon e-mail est ${user1.email} et j'ai ${user1.age} ans")

}

class User (email: String,  var password: String, var age: Int) {
    var email: String = email
        get() {
            println("User is getting their mail")
            return field
        }
        set(value) {
            println("User is setting their mail")
            field = value
        }
}