fun main() {
    print("Введите любой текст в строчку: ")
    val text = readLine()!!.toString()
    val length = when (text.length) {
        0 -> "Строка пустая."
        1 -> "Строка состоит из одного символа."
        in 2..10 -> "Строка короткая."
        in 11..50 -> "Строка средней длины."
        else -> "Строка длинная."
    }
    println("Длина строки: ${text.length}. $length")
}