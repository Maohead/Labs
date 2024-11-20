import kotlin.random.Random

fun main() {
    println("10 случайных чисел от 1 до 100: ")

    repeat(10) {
        val randomNumber = Random.nextInt(1, 101)
        println(randomNumber)
    }
}