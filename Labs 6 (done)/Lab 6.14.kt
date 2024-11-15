fun main() {
    val numbers = intArrayOf(12, 5, 28, 3, 45, 33, 8, 99, 21, 16)
    
    println("Числа, делящиеся на 3:")
    for (number in numbers) {
        if (number % 3 == 0) {
            print("$number ")
        }
    }
}