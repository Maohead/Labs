fun main() {
    val numbers = intArrayOf(12, 5, 28, 1, 45, 33, 8, 99, 21, 16)

    numbers.reverse()
    
    println("Реверсированный массив:")
    for (number in numbers) {
        print("$number ")
    }
}