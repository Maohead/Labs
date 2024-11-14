import kotlin.random.Random

fun main() {
    val secretNumber = Random.nextInt(1, 101) // Случайное число от 1 до 100
    var attempts = 0

    println("Я загадал число от 1 до 100. Попробуйте угадать его.")

    while (true) {
        print("Введите ваше число: ")
        val guess = readLine()!!.toInt()
        attempts++

        if (guess < secretNumber) {
            println("Слишком мало! Попробуйте еще раз.")
        } else if (guess > secretNumber) {
            println("Слишком много! Попробуйте еще раз.")
        } else {
            println("Поздравляю! Вы угадали число $secretNumber за $attempts попыток!")
            break
        }
    }
}