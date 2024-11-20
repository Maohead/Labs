fun main() {
    val originalArray = intArrayOf(1, 2, 3, 4, 5, 6)

    val reversedArray = reverseArray(originalArray)

    println("Оригинальный массив: ${originalArray.contentToString()}")
    println("Перевёрнутый массив: ${reversedArray.contentToString()}")
}

fun reverseArray(arr: IntArray): IntArray {
    return arr.reversedArray()
}