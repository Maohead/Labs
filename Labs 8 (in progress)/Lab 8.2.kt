fun main() {
    print("Введите числа через пробел: ")
    val input = readLine()?:""
    val numbers = input.split(" ").mapNotNull { it.toIntOrNull() }

    val result = difNum(numbers)
    println("Разность между самым большим и самым маленьким элементомв: $result")
}

fun difNum(list: List<Int>): Int {
    if (list.isEmpty()) {
        throw IllegalArgumentException("Список пуст.")
    }
    val min = list.min()
    val max = list.max()
    return max - min
}