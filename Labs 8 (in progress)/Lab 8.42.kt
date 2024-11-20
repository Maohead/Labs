fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5, 2, 6)
    print("Введите индекс: ")
    val element = readln().toInt()

    val result = findFirstOccurrence(arr, element)
    if (result != -1) {
        println("Индекс первого вхождения: $element: $result")
    } else {
        println("Элемент $element не найден: $result")
    }
}

fun findFirstOccurrence(arr: IntArray, element: Int): Int {
    return arr.indexOfFirst { it == element }
}