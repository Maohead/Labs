fun main() {
    print("Введите число N: ")
    val n = readLine()!!.toInt()

    for (i in 1..n) {
        for (j in 1..(n - i)) {
            print(" ")
        }
        for (j in 1..i) {
            print("$j ")
        }
        for (j in (i - 1) downTo 1) {
            print("$j ")
        }
        println()
    }
}