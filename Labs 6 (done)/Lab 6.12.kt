fun main() {
    val numbers = intArrayOf(12, 5, 28, 1, 45, 33, 8, 99, 21, 16)
    val copyNumbers = numbers.copyOf()
    println("Массив до перестановки: ")
    println(copyNumbers.joinToString(separator = " "))

    swapElements(numbers, 2, 5)

    println("Массив после перестановки:")
    for (number in numbers) {
        print("$number ")
    }
}

// Функция для перестановки элементов массива
fun swapElements(array: IntArray, index1: Int, index2: Int) {
    if (index1 in array.indices && index2 in array.indices) {
        val temp = array[index1]
        array[index1] = array[index2]
        array[index2] = temp
    } else {
        println("> Ошибка! Один или оба индекса находятся за пределами массива.")
        println("> Массив не изменился.")
    }
}