fun main() {
    print("Введите двузначное число: ")
    val num = readLine()!!.toInt()

    if (num !in 10..99 && num !in -99..-10) {
        println("Число должно быть двузначным")
    }

    val abs = Math.abs(num)
    val fd = abs / 10
    val sd = abs % 10

    when {
        fd > sd -> println("Первая цифра ($fd) больше второй ($sd)")
        fd < sd -> println("Вторая цифра ($sd) больше первой ($fd)")
        else -> println("Цифры одинаковы")
    }
}
