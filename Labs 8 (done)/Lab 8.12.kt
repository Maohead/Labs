fun main() {
    print("Введите число: ")
    val number = readln().toInt()
    println(google(number))
}

fun google(number: Int): String {
    return "G" + "o".repeat(number) + "gle"
}