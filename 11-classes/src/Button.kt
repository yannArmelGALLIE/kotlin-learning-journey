open class Button (var color: String = "Rouge", var text: String = "Par defaut") {

    init {
        println("Le bouton $text est crée")
    }

    fun showColor() = println("La couleur du  bouton $text est $color")
}