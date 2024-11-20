fun main() {
    print("Введите первую строку: ")
    val str1 = readLine().orEmpty()

    print("Введите вторую строку: ")
    val str2 = readLine().orEmpty()

    if (anagrams(str1, str2)) {
        println("Строки являются анаграммами.")
    } else {
        println("Строки не являются анаграммами.")
    }
}

fun anagrams(str1: String, str2: String): Boolean {
    
    val cleanedStr1 = str1.replace(" ", "").lowercase()
    val cleanedStr2 = str2.replace(" ", "").lowercase()

    return cleanedStr1.toCharArray().sorted() == cleanedStr2.toCharArray().sorted()
}