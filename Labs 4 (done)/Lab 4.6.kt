import kotlin.random.Random

fun main() {
    val secretNum = Random.nextInt(1, 10)
    println("Угадай число от 1 до 10.")

    var attempts = 0
    while (true) {
        println("Попытка: $attempts")
        print("Введите число: ")
        val num = readLine()?.toIntOrNull()

        if (num == null) {
            println("Некорректный ввод. Введите число.")
            continue
        }

        attempts++

        when {
            num > secretNum -> println("Слишком большое число.")
            num < secretNum -> println("Слишком маленькое число.")
            else -> {
                println("Ты угадал число $secretNum.")
                println("Количество попыток: $attempts.")
                break
            }
        }
    }
}