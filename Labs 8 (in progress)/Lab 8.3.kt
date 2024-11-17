fun main() {
    print("Введите числа через пробел для первого списка: ")
    val input = readLine()?:""
    val numbers1 = input.split(" ").mapNotNull { it.toIntOrNull() }
    print("Введите числа через пробел для второго списка: ")
    val input2 = readLine()?:""
    val numbers2 = input2.split(" ").mapNotNull { it.toIntOrNull() }

    val mergedList = mergeLists(numbers1, numbers2)

    println("Объединенный список: ${mergedList.joinToString(separator = " ")}")
}

fun mergeLists(numbers1: List<Int>, numbers2: List<Int>): List<Int> {
    return numbers1 + numbers2
}