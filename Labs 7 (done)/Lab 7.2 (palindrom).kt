fun main() {
    print("Введите слово: ")
    val input = readLine()

    if (input != null && isPalindrome(input)) {
        println("$input - это палиндром.")
    } else {
        println("$input - это не палиндром.")
    }
}

fun isPalindrome(word: String): Boolean {
    val lowerCaseWord = word.lowercase()
    return lowerCaseWord == lowerCaseWord.reversed()
}
