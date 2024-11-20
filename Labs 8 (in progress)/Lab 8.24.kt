fun main() {
    print("Введите текст: ")
    val a = readln().toString()

    val result = toUp(a)
    println("Вверхний регистр: $result")
}

fun toUp(a: String): String {
    return a.uppercase()
}