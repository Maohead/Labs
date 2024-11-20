fun concatenateStrings(str1: String, str2: String): String {
    return str1 + str2
}

fun main() {
    print("Первая строка: ")
    val str1 = readln().toString()
    print("Вторая строка: ")
    val str2 = readln().toString()

    val result = concatenateStrings(str1, str2)
    println(result)
}