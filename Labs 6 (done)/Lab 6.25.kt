fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val elementToFind = 5
    val isFound = linearSearch(numbers, elementToFind)

    println("Элемент $elementToFind ${if (isFound) "найден" else "не найден"} в массиве.")
}

fun linearSearch(array: IntArray, elementToFind: Int): Boolean {
    for (element in array) {
        if (element == elementToFind) {
            return true
        }
    }

    return false
}