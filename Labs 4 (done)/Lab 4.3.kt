fun main() {
    print("Введите число: ")
    val score = readLine()!!.toInt()
    val ocenka = when(score) {
        5 -> "Отлично"
        4 -> "Хорошо"
        3 -> "Удовлетворительно"
        2 -> "Неудовлетворительно"
        else -> "Оценка неверна"
    }
    println("Оценка: $ocenka")
}