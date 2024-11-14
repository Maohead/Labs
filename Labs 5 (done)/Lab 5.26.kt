fun main() {
    print("Введите число N: ")
    val n = readLine()!!.toInt()

    var evenSum = 0
    var oddSum = 0

    for (i in 1..n) {
        if (i % 2 == 0) {
            evenSum += i
        } else {
            oddSum += i
        }
    }

    println("Сумма четных чисел: $evenSum")
    println("Сумма нечетных чисел: $oddSum")
}