fun main() {
    print("Введите число n: ")
    val n = readln().toInt()

    println(printNumber(n))
}

fun printNumber(n: Int): List<Int> {
    return if (n == 0) {
        emptyList()
    } else {
        (n downTo 1).toList()
    }
}