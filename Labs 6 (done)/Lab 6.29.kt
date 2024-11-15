fun main() {
    val numbers = intArrayOf(1, 3, 5, 7, 9)
    val median = findMedian(numbers)
    println("Медиана: $median")
}

fun findMedian(numbers: IntArray): Double {
    numbers.sort()

    val arraySize = numbers.size

    if (arraySize % 2 == 0) {
        val middleIndex = arraySize / 2
        return (numbers[middleIndex - 1] + numbers[middleIndex]) / 2.0
    } else {
        val middleIndex = arraySize / 2
        return numbers[middleIndex].toDouble()
    }
}