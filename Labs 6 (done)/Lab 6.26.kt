fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val average = calculateAverage(numbers)

    println("Среднее арифметическое: $average")
}

fun calculateAverage(numbers: IntArray): Double {
    if (numbers.isEmpty()) {
        return 0.0 
    }

    var sum = 0
    for (number in numbers) {
        sum += number
    }

    return sum.toDouble() / numbers.size
}