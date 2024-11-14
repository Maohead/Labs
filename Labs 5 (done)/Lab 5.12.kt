fun main() {
    print("Введите начальное число: ")
    val start = readLine()!!.toInt()
    print("Введите шаг: ")
    val step = readLine()!!.toInt()
    print("Введите количество элементов: ")
    val count = readLine()!!.toInt()

    var current = start
    for (i in 1..count) {
        print("$current ")
        current += step
    }
}