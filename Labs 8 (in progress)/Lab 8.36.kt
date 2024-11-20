fun main() {
    val mainString = "Пример строки для поиска"
    val substring = "поиска"

    val result = containsSubstring(mainString, substring)

    println("Подстрока \"$substring\" содержится в строке \"$mainString\": $result")
}

fun containsSubstring(mainString: String, substring: String): Boolean {
    return mainString.contains(substring)
}