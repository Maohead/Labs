fun main() {
    print("Введите число: ")
    val n = readln().toInt()

    val result = isPrime(n)
    if (result) {
        println("Число простое.")
    } else {
        println("Число непростое.")
    }
}

fun isPrime(n: Int): Boolean {
    if (n <= 1) return false
    if (n == 2 || n == 3) return true

    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) {
            return false
        }
    }

    return true
}