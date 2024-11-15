fun main() {
    val numbers = intArrayOf(12, 5, 28, 1, 45, 33, 8, 99, 21, 16)

    print("Введите число для поиска: ")
    val searchNumber = readLine()?.toIntOrNull() ?: 0

    var foundIndex = -1
    for (i in numbers.indices) {
        if (numbers[i] == searchNumber) {
            foundIndex = i
            break
        }
    }

    if (foundIndex != -1) {
        println("Число $searchNumber найдено на индексе $foundIndex")
    } else {
        println("Число $searchNumber не найдено в массиве")
    }
}