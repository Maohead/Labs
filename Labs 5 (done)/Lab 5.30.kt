fun main() {
    print("Введите целое число: ")
    val decimalNumber = readLine()!!.toInt()

    val binaryNumber = decimalToBinary(decimalNumber)
    println("$decimalNumber в двоичной системе: $binaryNumber")
}

fun decimalToBinary(decimal: Int): String {
    if (decimal == 0) {
        return "0"
    }
    val binary = StringBuilder()
    var number = decimal
    while (number > 0) {
        val remainder = number % 2
        binary.insert(0, remainder)
        number /= 2
    }
    return binary.toString()
}