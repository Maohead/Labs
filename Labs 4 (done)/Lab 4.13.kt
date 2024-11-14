fun main() {
    print("Код ошибки: ")
    val code = readLine()!!.toString()
    when (code) {
        "100" -> println("Ошибка сети.")
        "200" -> println("Ошибка сервера.")
        "300" -> println("Ошибка доступа.")
        else -> println("Неизвестная ошибка.")
    }
}