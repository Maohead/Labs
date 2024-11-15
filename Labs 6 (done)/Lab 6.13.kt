import kotlin.random.Random

fun main() {
    val numbers = IntArray(20)

    for (i in numbers.indices) {
        numbers[i] = Random.nextInt(1, 101)
    }

    println("Массив случайных чисел:")
    for (number in numbers) {
        print("$number ")
    }
}