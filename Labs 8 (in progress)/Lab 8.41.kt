fun main() {
    print("Введите строку: ")
    val input = readLine().toString()
    val count = countVowels(input)
    println("Количество гласных в строке: $count")
}

fun countVowels(input: String): Int {
    val glas = "AEIOUaeiou"
    return input.count { it in glas }
}