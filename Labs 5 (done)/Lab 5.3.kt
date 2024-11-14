fun main() {
    print("Введите число: ")
    val n = readLine()!!.toInt()
    var sum = 0
    for (i in 1..n) {
        sum += i
    }
    println("Сумма чисел от 1 до $n равна $sum")
}