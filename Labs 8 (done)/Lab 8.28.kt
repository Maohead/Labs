fun main() {
    print("Введите число N: ")
    val n = readLine()?.toIntOrNull()

    if (n == null || n <= 0) {
        println("Введите положительное целое число.")
        return
    }

    val array = createArray(n)
    println("Созданный массив: ${array.joinToString(", ")}")
}

fun createArray(n: Int): Array<Int> {
    return Array(n) { it + 1 }
}
