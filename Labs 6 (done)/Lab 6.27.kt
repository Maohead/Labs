fun main() {
    val numbers = intArrayOf(1, 1, 1, 2, 2, 2, 2, 3, 3, 4, 4, 4, 4, 4)

    val maxSequence = findMaxSequence(numbers)

    println("Максимальная последовательность: ${maxSequence.joinToString(", ")}")
}

fun findMaxSequence(array: IntArray): List<Int> {
    if (array.isEmpty()) {
        return emptyList()
    }

    var maxSequence = listOf(array[0])
    var currentSequence = listOf(array[0])

    for (i in 1 until array.size) {
        if (array[i] == array[i - 1]) {
            currentSequence += array[i]
        } else {
            if (currentSequence.size > maxSequence.size) {
                maxSequence = currentSequence
            }
            currentSequence = listOf(array[i])
        }
    }
    
    if (currentSequence.size > maxSequence.size) {
        maxSequence = currentSequence
    }

    return maxSequence
}