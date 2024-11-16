fun main() {
    print("Первое число: ")
    val num1 = readLine()!!.toInt()
    print("Второе число: ")
    val num2 = readLine()!!.toInt()

    val result = numsEqual(num1, num2)
    println("Результат: $result")
}

fun numsEqual(num1: Int, num2: Int): Boolean {
    return num1==num2
}