fun main() {
    val originalNumbers = intArrayOf(12, 5, 28, 1, 45, 33, 8, 99, 21, 16)

    val copiedNumbers = originalNumbers.copyOf()

    println("Элементы нового массива:")
    for (number in copiedNumbers) {
        print("$number ")
    }
}