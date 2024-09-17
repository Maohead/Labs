import kotlin.math.sqrt

fun main() {
    print("Введите число: ")
    val a = readLine()!!.toDouble()
    val b = sqrt(a)
    println("Квадратный корень из числа $a равен $b")
}
