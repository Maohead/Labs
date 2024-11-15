fun main() {
    val numbers = intArrayOf(5, 2, 9, 1, 7, 3, 8, 4, 6)
    println("Массив: ")
    println(numbers.joinToString(separator = " "))

    val secondMax = findSecondMax(numbers)

    if (secondMax != null) {
        println("Второй по величине элемент: $secondMax")
    } else {
        println("В массиве нет второго по величине элемента.")
    }
}

fun findSecondMax(array: IntArray): Int? {
    if (array.size < 2) {
        return null
    }

    var max = array[0]
    var secondMax = array[0]

    for (i in 1 until array.size) {
        if (array[i] > max) {
            secondMax = max
            max = array[i]
        } else if (array[i] > secondMax && array[i] != max) {
            secondMax = array[i]
        }
    }

    return secondMax
}