fun main() {
    val originalArray = arrayOf(1, 2, 3, 4, 5)
    val copiedArray = copyArray(originalArray)

    println("Исходный массив: ${originalArray.joinToString(", ")}")
    println("Скопированный массив: ${copiedArray.joinToString(", ")}")
}

fun  copyArray(array: Array<Int>): Array<Int> {
    return array.copyOf()
}