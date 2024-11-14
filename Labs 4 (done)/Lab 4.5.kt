fun main() {
    print("Введите число: ")
    val a = readLine()!!.toInt()

    val sign = when {
        a > 0 -> "Положительное число"
        a < 0 -> "Отрицательное число"
        else -> "Ноль"
    }
    println(sign)
}