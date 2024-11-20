fun main() {
    print("Введите текст: ")
    val a = readln().toString()

    val result = countChar(a)
    println("Количество символов в строке: $result")
}

fun countChar(a: String): Int {
    return a.length
}