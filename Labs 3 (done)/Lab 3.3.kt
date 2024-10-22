fun main() {
    print("Первое число: ")
    val a = readLine()!!.toInt()
    print("Второе число: ")
    val b = readLine()!!.toInt()
    val num = if (a % 2 != 0) a else b
    println("Нечетное число: $num")
}
