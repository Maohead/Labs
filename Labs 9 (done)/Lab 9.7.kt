fun main() {
    print("Введите строку: ")
    val userInput = readLine().orEmpty()

    val result = toggleCase(userInput)

    println("Строка с измененным регистром: $result")
}

fun toggleCase(input: String): String {
    return input.map {
        if (it.isUpperCase()) it.lowercase() else it.uppercase()
    }.joinToString("")
}