fun main() {
    print("Введите номер дня недели от 1 до 7: ")
    val num = readLine()!!.toInt()

    when(num) {
        1 -> println("Понедельник")
        2 -> println("Вторник")
        3 -> println("Среда")
        4 -> println("Четверг")
        5 -> println("Пятница")
        6 -> println("Суббота")
        7 -> println("Воскресение")
        else -> println("Некорректный номер дня недели.")
    }
}
