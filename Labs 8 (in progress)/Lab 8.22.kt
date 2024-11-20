fun main() {
    print("Введите текст: ")
    val input = readln().toString()

    val result = palindrome(input)
    if (result) {
        println("Текст является палиндромом.")
    } else {
        println("Текст не является палиндромом.")
    }
}

fun palindrome(input: String): Boolean {
    val processedInput = input.replace("\\s".toRegex(), "").lowercase()

    return processedInput == processedInput.reversed()
}