fun main() {
    print("Введите число: ")
    val n = readln().toInt()

    val result = factorial(n)
    println("Факториал: $result")
}

fun factorial(n: Int): Int {
    return if (n == 0) {
        1
    } else {
        n * factorial(n - 1)
    }
}
