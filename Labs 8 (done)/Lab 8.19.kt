fun main() {
    print("Введите числа через пробел в массив: ")
    val input = readLine()?:""
    val numbers = input.split(" ").mapNotNull { it.toIntOrNull() }

    val result = sumarray(numbers)
    println("Сумма массива: $result")
}

fun sumarray(numbers: List<Int>): Int {
    var sum = 0

    for (element in numbers) {
        sum += element
    }

    return sum
}