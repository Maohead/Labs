fun main() {
    val numbers = arrayOf(15, 2, 88, 45, 12)
    for (i in 0 until numbers.size - 1) {
        var minIndex = i
        for (j in i + 1 until numbers.size) {
            if (numbers[j] < numbers[minIndex]) {
                minIndex = j
            }
        }
        val temp = numbers[i]
        numbers[i] = numbers[minIndex]
        numbers[minIndex] = temp
    }

    println("Отсортированный массив: ${numbers.joinToString(", ")}")
}