data class User (var email: String, var password: String, var isConnnected: Boolean) {

    companion object {
        fun newInstanceAfterSignUp(email: String, password: String) = User(email, password, true)
    }
}