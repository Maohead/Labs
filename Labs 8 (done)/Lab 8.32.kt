fun main() {
    print("Введите текст: ")
    val a = readln().toString()

    val reversedStr = reverseString(a)

    println("Исходная строка: $a")
    println("Строка в обратном порядке: $reversedStr")
}

fun reverseString(a: String): String {
    return a.reversed()
}