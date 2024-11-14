fun main() {
    print("Введите число N: ")
    val n = readLine()!!.toInt()
    val sumOfSquares = calculateSumOfSquares(n)
    println("Сумма квадратов чисел от 1 до $n равна: $sumOfSquares")
}

fun calculateSumOfSquares(n: Int): Int {
    var sum = 0
    for (i in 1..n) {
        sum += i * i
    }
    return sum
}