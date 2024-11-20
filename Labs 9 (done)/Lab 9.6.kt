fun main() {
    val strings = arrayOf("banana", "apple", "kiwi", "cherry", "grape")

    val sortedStrings = sort(strings)

    println("Отсортированные строки:")
    sortedStrings.forEach { println(it) }
}

fun sort(arr: Array<String>): Array<String> {
    return arr.sortedArray()
}