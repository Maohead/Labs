fun main() {
    val numbers = intArrayOf(12, 5, 28, 1, 45, 33, 8, 99, 21, 16)

    val result = sortArr(numbers)
    println("Массив: ${numbers.contentToString()}")
    println("Отсортированный массив: ${result.contentToString()}")
}

fun sortArr(numbers: IntArray): IntArray {
    val sortedArr = numbers.copyOf()
    sortedArr.sort()
    return sortedArr
}