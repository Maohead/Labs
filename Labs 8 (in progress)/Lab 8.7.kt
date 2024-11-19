fun main() {
    print("Введите число: ")
    val a = readln().toInt()

    if (delenie100(a)) {
        println("Число делится на 100: ${delenie100(a)}")
    } else {
        println("Число НЕ делится на 100: ${delenie100(a)}")
    }
}

fun delenie100 (a: Int): Boolean {
    return a % 100 == 0
}