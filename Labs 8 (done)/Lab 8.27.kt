fun main() {
    val a = intArrayOf(12, 5, 28, 1, 45, 33, 8, 99, 21, 16)
    print("Введите число для проверки: ")
    val target = readln().toInt()

    val result = proverka(a, target)
    if (result) {
        println("Число $target есть в массиве.")
    } else {
        println("Число $target отсутствует в массиве.")
    }
}

fun proverka(a: IntArray, target: Int): Boolean {
    return a.contains(target)
}