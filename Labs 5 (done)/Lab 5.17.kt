fun main() {
    print("Введите строку: ")
    val inputString = readLine()!!

    for (i in 0 until inputString.length) {
        println(inputString[i])
    }
}