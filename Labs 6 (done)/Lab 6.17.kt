fun main() {
    val numbers = intArrayOf(2, 4, 6, 8, 10)

    var sum = 0
    var product = 1

    for (number in numbers) {
        sum += number
        product *= number
    }
    
    println("Сумма элементов: $sum")
    println("Произведение элементов: $product")
}