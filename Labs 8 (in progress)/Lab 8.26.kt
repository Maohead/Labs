fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5, 6)
    println(getLastElement(numbers))
}

fun <T> getLastElement(array: Array<T>): T? {
    return if (array.isNotEmpty()) array.last() else null
}