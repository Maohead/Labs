fun main() {
    val array1 = intArrayOf(1, 2, 3)
    val array2 = intArrayOf(4, 5, 6)

    val combinedArray = array1 + array2

    println("Объединенный массив:")
    for (element in combinedArray) {
        print("$element ")
    }
}