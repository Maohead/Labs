fun main() {
    val array1 = intArrayOf(1, 3, 5, 7, 9)
    val array2 = intArrayOf(2, 4, 6, 8, 10)

    val mergedArray = mergeSortedArrays(array1, array2)

    println("Объединенный отсортированный массив:")
    for (element in mergedArray) {
        print("$element ")
    }
}

fun mergeSortedArrays(array1: IntArray, array2: IntArray): IntArray {
    val mergedArray = IntArray(array1.size + array2.size)
    var i = 0
    var j = 0
    var k = 0

    while (i < array1.size && j < array2.size) {
        if (array1[i] < array2[j]) {
            mergedArray[k] = array1[i]
            i++
        } else {
            mergedArray[k] = array2[j]
            j++
        }
        k++
    }

    while (i < array1.size) {
        mergedArray[k] = array1[i]
        i++
        k++
    }

    while (j < array2.size) {
        mergedArray[k] = array2[j]
        j++
        k++
    }

    return mergedArray
}