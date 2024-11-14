fun main() {
    print("Введите число: ")
    val hour = readLine()!!.toInt()
    val time = when(hour) {
        in 0..5 -> "Ночь"
        in 6..11 -> "Утро"
        in 12..17-> "День"
        in 17..23 -> "Вечер"
        else -> "Неверное время"
    }
    println("Сейчас $time.")
}