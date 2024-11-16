fun main() {
    while (true) {
        print("Первое число: ")
        val num1 = readLine()!!.toDoubleOrNull()
        if (num1 == null) {
            println("> Ошибка! Некорректное значение.")
            return
        }

        print("Оператор (+, -, *, /): ")
        val operator = readLine()

        print("Второе число: ")
        val num2 = readLine()!!.toDoubleOrNull()
        if (num2 == null) {
            println("> Ошибка! Некорректное значение.")
            return
        }

        when (operator) {
            "+" -> println("${num1} + ${num2} = ${num1 + num2}")
            "-" -> println("${num1} - ${num2} = ${num1 - num2}")
            "*" -> println("${num1} * ${num2} = ${num1 * num2}")
            "/" -> {
                if (num2 == 0.0) {
                    println("> Ошибка! Деленить на ноль нельзя.")
                    return
                } else {
                    println("${num1} / ${num2} = ${num1 / num2}")
                }
            }
            else -> println("> Ошибка! Неизвестный оператор.")
        }

        print("Ввести ещё раз? (y/n): ")
        val answer = readLine()
            if (answer == "y") {
                continue
            }
            if (answer == "n") {
                println("> Выход...")
                break
            } else {
                println("> Ошибка! Введено некорректный ответ. Программа будет завершена.")
                return
            }
    }
}