import kotlin.random.Random

fun main() {
    val secretNumber = Random.nextInt(1, 101)  
    var attempts = 0
    var guessed = false

    println("Я загадал число от 1 до 100. Попробуй угадать!")

    while (!guessed) {
        print("Введите ваше предположение: ")
        val userGuess = readLine()?.toIntOrNull()

        if (userGuess == null) {
            println("Пожалуйста, введите целое число.")
            continue
        }

        attempts++

        when {
            userGuess < secretNumber -> println("Загаданное число больше. Попробуй еще раз!")
            userGuess > secretNumber -> println("Загаданное число меньше. Попробуй еще раз!")
            else -> {
                println("Поздравляю! Вы угадали число $secretNumber за $attempts попыток.")
                guessed = true
            }
        }
    }
}
