fun main() {
    val array1 = intArrayOf(1, 2, 3)
    val array2 = intArrayOf(4, 5, 6)
    val array3 = intArrayOf(7, 8, 9)

    val mergedArray = mergeArrays(array1, array2, array3)

    println("Объединенный массив:")
    for (element in mergedArray) {
        print("$element ")
    }
}

fun mergeArrays(vararg arrays: IntArray): IntArray {
    var totalSize = 0
    for (array in arrays) {
        totalSize += array.size
    }

    val mergedArray = IntArray(totalSize)
    var index = 0

    for (array in arrays) {
        for (element in array) {
            mergedArray[index] = element
            index++
        }
    }
    
    return mergedArray
}