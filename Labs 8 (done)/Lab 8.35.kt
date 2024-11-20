fun main() {
    print("Введите количество первых натуральных чисел: ")
    val n = readln().toInt()

    val result = sumFirstN(n)

    println("Сумма первых $n натуральных чисел равна $result")
}

fun sumFirstN(n: Int): Long {
    require(n >= 0) { "Число должно быть положительным." }

    return (1..n).sum().toLong()
}