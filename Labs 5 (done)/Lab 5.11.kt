fun main() {
    print("Введите первую строку: ")
    val str1 = readLine()!!.lowercase()
    print("Введите вторую строку: ")
    val str2 = readLine()!!.lowercase()

    if (areAnagrams(str1, str2)) {
        println("$str1 и $str2 - анаграммы")
    } else {
        println("$str1 и $str2 - не анаграммы")
    }
}

fun areAnagrams(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) {
        return false
    }

    val charCounts = mutableMapOf<Char, Int>()
    for (char in str1) {
        charCounts[char] = (charCounts[char] ?: 0) + 1
    }

    for (char in str2) {
        if (charCounts[char] == null || charCounts[char] == 0) {
            return false
        } else {
            charCounts[char] = charCounts[char]!! - 1
        }
    }

    return true
}