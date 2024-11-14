fun main() {
    print("Введите количество чисел N: ")
    val n = readLine()!!.toInt()

    print("Введите $n чисел, разделяя их пробелами: ")
    val numbers = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()

    for (i in 0 until numbers.size - 1) {
        var minIndex = i
        for (j in i + 1 until numbers.size) {
            if (numbers[j] < numbers[minIndex]) {
                minIndex = j
            }
        }
        val temp = numbers[i]
        numbers[i] = numbers[minIndex]
        numbers[minIndex] = temp
    }

    println("Числа в порядке возрастания:")
    println(numbers.joinToString(", "))
}