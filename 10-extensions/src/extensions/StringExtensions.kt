package extensions

fun String.sayHello() = println("Bonjour, $this")

var StringBuilder.firstLetter: Char
    get() = get(0)
    set(value) = set(0, value)