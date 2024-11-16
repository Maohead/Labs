fun main() {
    print("Введите числа через пробел: ")
    val input = readLine()?:""
    val numbers = input.split(" ").mapNotNull { it.toIntOrNull() }
    if (numbers.isEmpty()) {
        println("Список пуст ИЛИ в нём присутствуют недопустимые значения.")
    } else {
        val minNumber = numbers.minOrNull()

        if (minNumber != null) {
            println("Минимальное число: $minNumber")
        } else {
            println("> Неизвестная ошибка")
        }
    }
}