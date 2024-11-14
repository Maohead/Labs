fun main() {
    print("Введите строку:")
    val inputString = readLine()!!.lowercase()

    if (isPalindrome(inputString)) {
        println("$inputString - палиндром")
    } else {
        println("$inputString - не палиндром")
    }
}

fun isPalindrome(text: String): Boolean {
    val cleanText = text.replace("[^a-zA-Z0-9]".toRegex(), "")
    return cleanText == cleanText.reversed()
}