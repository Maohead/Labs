fun main() {
    print("Введите число N: ")
    val n = readLine()?.toIntOrNull()

    if (n == null || n <= 0) {
        println("Введите положительное целое число.")
        return
    }

    val sum = calculateSum(n)
    println("Сумма чисел от 1 до $n: $sum")
}

fun calculateSum(n: Int): Int {
    return (1..n).sum()
}
