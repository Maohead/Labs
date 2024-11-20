fun main() {
    print("Введите число n:")
    val n = readLine()?.toIntOrNull() ?: return println("Некорректный ввод")

    val fizzBuzzList = fizzBuzz(n)
    println(fizzBuzzList.joinToString(", "))
}

fun fizzBuzz(n: Int): List<String> {
    val result = mutableListOf<String>()

    for (i in 1..n) {
        when {
            i % 3 == 0 && i % 5 == 0 -> result.add("ВизллБизлл")
            i % 3 == 0 -> result.add("Физллл")
            i % 5 == 0 -> result.add("Бизлллл")
            else -> result.add(i.toString())
        }
    }
    return result
}