fun main() {
    val numbers = intArrayOf(12, 5, 28, 1, 45, 33, 8, 99, 21, 16)

    var sumOfEvenNumbers = 0

    for (number in numbers) {
        if (number % 2 == 0) {
            sumOfEvenNumbers += number
        }
    }
    
    println("Сумма четных чисел: $sumOfEvenNumbers")
}