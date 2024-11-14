fun main() {
    print("Введите число: ")
    val num = readLine()!!.toInt()

    var sum = 0
    var temp = num
    while (temp > 0) {
        sum += temp % 10
        temp /= 10
    }
    println("Сумма цифр числа $num равна $sum")
}
