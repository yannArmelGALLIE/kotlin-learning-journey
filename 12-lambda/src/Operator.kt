class Operator {
    val addition = { x: Int, y: Int -> x + y}
    val soustraction = { x: Int, y: Int -> x - y}
    val  division = { x: Int, y: Int -> x / y}
    inline fun executeOperation(x: Int, y: Int, operation : (Int, Int) ->  Int) = operation(x, y)
}