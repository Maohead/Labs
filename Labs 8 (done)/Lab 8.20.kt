fun main() {
    print("Введите числа через пробел в массив: ")
    val input = readLine()?:""
    val numbers = input.split(" ").mapNotNull { it.toIntOrNull() }

    val result = maxArr(numbers)
    println("Наибольшее число в массиве: $result")
}

fun maxArr(numbers: List<Int>): Int {
    if (numbers.isEmpty()) {
        throw IllegalArgumentException("Массив пуст.")
    }

    var max = numbers[0]

    for (i in 1 until numbers.size) {
        if (numbers[i] > max) {
            max = numbers[i]
        }
    }

    return max
}