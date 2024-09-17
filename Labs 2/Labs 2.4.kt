import kotlin.math.pow

fun main() {
    print("Введите число: ")
    val a = readLine()!!.toDouble()
    print("Введите степень: ")
    val b = readLine()!!.toDouble()
    val result = a.pow(b)
    println("Результат: $result")
}
