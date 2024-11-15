fun main() {
    val numbers = intArrayOf(12, 5, 28, 1, 45, 33, 8, 99, 21, 16)

    val evenNumbers = mutableListOf<Int>()
    val oddNumbers = mutableListOf<Int>()

    for (number in numbers) {
        if (number % 2 == 0) {
            evenNumbers.add(number)
        } else {
            oddNumbers.add(number)
        }
    }
    
    println("Четные числа:")
    for (number in evenNumbers) {
        print("$number ")
    }
    println()

    println("Нечетные числа:")
    for (number in oddNumbers) {
        print("$number ")
    }
}