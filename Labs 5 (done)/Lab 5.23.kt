fun main() {
    while (true) {
        print("Введите две цифры (разделенные пробелом): ")
        val input = readLine()!!.split(" ")
        val num1 = input[0].toInt()
        val num2 = input[1].toInt()

        print("Выберите операцию (+ или *) или завершите программу написав 'стоп': ")
        val operation = readLine()!!

        if (operation == "+") {
            println("$num1 + $num2 = ${num1 + num2}")
        } else if (operation == "*") {
            println("$num1 * $num2 = ${num1 * num2}")
        } else if (operation.lowercase() == "стоп") {
            println("Программа завершена.")
            break
        } else {
            println("Некорректная операция!")
        }
    }
}