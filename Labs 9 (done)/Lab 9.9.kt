import kotlin.random.Random

fun main() {
    print("Введите длину пароля: ")
    val length = readLine()?.toIntOrNull()

    if (length == null || length <= 0) {
        println("Введите корректную длину пароля.")
        return
    }

    val password = generateRandomPassword(length)
    println("Сгенерированный пароль: $password")
}

fun generateRandomPassword(length: Int): String {
    val lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz"
    val upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val digits = "0123456789"
    val specialChars = "!@#$%^&?"

    val allCharacters = lowerCaseLetters + upperCaseLetters + digits + specialChars

    return (1..length)
        .map { allCharacters.random() }
        .joinToString("")
}

