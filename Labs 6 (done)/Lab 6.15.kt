fun main() {
    val numbers = intArrayOf(1, 2, 3, 2, 1)

    if (isPalindrome(numbers)) {
        println("Массив является палиндромом.")
    } else {
        println("Массив не является палиндромом.")
    }
}

fun isPalindrome(array: IntArray): Boolean {
    if (array.isEmpty()) {
        return true
    }

    for (i in 0 until array.size / 2) {
        if (array[i] != array[array.size - i - 1]) {
            return false
        }
    }
    return true
}