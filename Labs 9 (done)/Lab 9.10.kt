fun main() {
    print("Введите текст: ")
    val input = readln().toString()

    val result = findLongestWord(input)
    println("Самое длинное слово из строчки: $result")
}

fun findLongestWord(input: String): String {
    val cleanedString = input.replace("[^a-zA-Z0-9 ]".toRegex(), "")

    val words = cleanedString.split(" ")

    var longestWord = ""
    for (word in words) {
        if (word.length > longestWord.length) {
            longestWord = word
        }
    }

    return longestWord
}