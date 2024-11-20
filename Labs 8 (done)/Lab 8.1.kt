fun main() {
    print("Введите числа через пробел: ")
    val input = readLine()?:""
    val numbers = input.split(" ").mapNotNull { it.toIntOrNull() }

    val result = sumOfList(numbers)

    println("Сумма элементов списка: $result")
}

fun sumOfList(list: List<Int>): Int {
    var sum = 0

    for (element in list) {
        sum += element
    }

    return sum
}