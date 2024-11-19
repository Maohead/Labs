fun main() {
    print("Введите число: ")
    val a = readln().toInt()

    val result = chastnoe(a)
    if (result) {
        println("Число четное.")
    } else {
        println("Число нечетное")
    }
}

fun chastnoe(a: Int): Boolean {
    return a % 2 == 0
}