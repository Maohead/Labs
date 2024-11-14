fun main() {
    println("Введите стороны треугольника: ")
    val a = readLine()!!.toDouble()
    val b = readLine()!!.toDouble()
    val c = readLine()!!.toDouble()

    val triangleType = when {
        a + b <= c || a + c <= b || b + c <= a -> "Такого треугольника не существует."
        a == b && b == c -> "Равносторонний треугольник."
        a == b || a == c || b == c-> "Равнобедренный треугольник."
        else -> "Разносторонний треугольник."
    }
    println(triangleType)
}