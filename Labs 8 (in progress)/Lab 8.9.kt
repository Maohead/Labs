import java.lang.Math.pow

fun main() {
    print("Введите число k: ")
    val k = readln().toDouble()
    print("Введите число n: ")
    val n = readln().toDouble()

    val grade = stepen(k, n)
    if (grade) {
        print("Число k^k равно n: $grade")
    } else {
        print("Число k^k НЕ равно n: $grade")
    }
}

fun stepen(k: Double, n: Double): Boolean {
    return Math.pow(k, k) == n
}