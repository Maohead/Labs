fun main() {
    print("Введите число: ")
    val num = readLine()!!.toInt()
    var isPrime = true
    if (num <= 1) {
        isPrime = false
    } else {
        for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
            if (num % i == 0) {
                isPrime = false
                break
            }
        }
    }
    if (isPrime) {
        println("$num - простое число")
    } else {
        println("$num - непростое число")
    }
}