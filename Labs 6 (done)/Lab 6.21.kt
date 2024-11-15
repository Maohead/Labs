fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val copyNumbers = numbers.copyOf()
    println("Массив до удаления элемента: ")
    println(copyNumbers.joinToString(separator = " "))

    val updatedNumbers = removeElement(numbers, 5)

    println("Обновленный массив:")
    for (number in updatedNumbers) {
        print("$number ")
    }
}

fun removeElement(array: IntArray, elementToRemove: Int): IntArray {
    val newArray = IntArray(array.size - 1)

    var j = 0
    for (i in array.indices) {
        if (array[i] != elementToRemove) {
            newArray[j] = array[i]
            j++
        }
    }

    return newArray
}