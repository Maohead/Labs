fun main() {
    print("Введите число: ")
    val n = readLine()!!.toInt()
    var factorial = 1
    for (i in 1..n) {
        factorial *= i
    }
    println("Факториал $n равнен $factorial")
}