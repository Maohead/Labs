fun main() {
    print("Введите строку: ")
    val input = readln().toString()

    val result = getLength(input)
    println("Длина строки: $result")
}

fun getLength(input: String): Int {
    return input.length
}