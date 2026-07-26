fun main(args: Array<String>) {

    //While et do
    val isARainyDay: Boolean = true

    while(!isARainyDay) print("Je n'aime pas la pluie")

    do print("Je n'aime pas la pluie") while(!isARainyDay)

    print("\n")

    //for
    val names = listOf<String>("GALLIE", "Koffi", "Yann-Armel")

    for (name in names) println("Le nom est : $name")

    for (i in names.indices) println("Le nom avec l'indice $i est : ${names[i]}")

    for ((index, value) in names.withIndex()) println("Le nom avec avec l'index $index est : $value")
}