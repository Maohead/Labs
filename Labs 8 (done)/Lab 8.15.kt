fun main() {
    print("Введите первое число: ")
    val a = readln().toInt()
    print("Введите второе число: ")
    val b = readln().toInt()

    val result = sravnenie(a, b)
    println("Результат: $result")
}

fun sravnenie(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}