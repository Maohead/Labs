import kotlin.random.Random

fun main() {
    println("10 случайных чисел от 1 до 100:")
    for (i in 1..10) {
        val randomNumber = Random.nextInt(1, 101) // Генерирует случайное число от 1 до 100
        println(randomNumber)
    }
}