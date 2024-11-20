fun main() {
    val array = intArrayOf(5, 3, 9, 6, 1, 12, 8)

    val (min, max) = findMinAndMax(array)

    println("Минимальное значение: $min")
    println("Максимальное значение: $max")
}

fun findMinAndMax(arr: IntArray): Pair<Int, Int> {
    if (arr.isEmpty()) {
        throw IllegalArgumentException("Массив пуст.")
    }

    var min = arr[0]
    var max = arr[0]

    for (i in 1 until arr.size) {
        if (arr[i] < min) {
            min = arr[i]
        }
        if (arr[i] > max) {
            max = arr[i]
        }
    }

    return Pair(min, max)
}