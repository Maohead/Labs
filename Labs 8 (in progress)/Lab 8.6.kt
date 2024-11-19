fun main() {
    print("Введите первое число: ")
    val a = readln().toInt()
    print("Введите второе число: ")
    val b = readln().toInt()

    if (sum100(a, b)) {
        println("Сумма чисел меньше 100: ${sum100(a, b)}")
    } else {
        println("Сумма чисел больше 100: ${sum100(a, b)}")
    }
}

fun sum100(a: Int, b: Int): Boolean {
    return a + b < 100
}