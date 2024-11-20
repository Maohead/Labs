fun main() {
    print("Введите текст: ")
    val a = readln().toString()

    val result = removeSpaces(a)

    println("Исходная строка: $a")
    println("Строка без пробелов: $result")
}

fun removeSpaces(str: String): String {
    return str.replace(" ", "")
}