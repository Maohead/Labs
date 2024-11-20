fun main() {
    print("Введите число N: ")
    val n = readLine()?.toIntOrNull()

    if (n == null || n <= 1) {
        println("Введите корректное число больше 1.")
        return
    }

    println("Простые числа до $n:")
    for (i in 2..n) {
        if (isPrime(i)) {
            println(i)
        }
    }
}

fun isPrime(number: Int): Boolean {
    if (number <= 1) return false
    for (i in 2..Math.sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) return false
    }
    return true
}