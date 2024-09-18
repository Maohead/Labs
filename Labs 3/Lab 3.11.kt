fun main() {
    print("Введите натуральное число: ")
    val num = readLine()!!.toInt()

    if (num % 2 == 0) {
        println("Число $num является четным")
    } else {
        println("Число $num является нечетным")
    }

    if (num % 10 == 7) {
        println("Число $num оканчивается цифрой 7")
    } else {
        println("Число $num не оканчивается цифрой 7")
    }
}
