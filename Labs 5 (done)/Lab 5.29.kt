fun main() {
    print("Введите число N: ")
    val n = readLine()!!.toInt()

    var sum = 0.0
    for (i in 1..n) {
        sum += 1.0 / i
    }

    println("Сумма ряда: $sum")
}