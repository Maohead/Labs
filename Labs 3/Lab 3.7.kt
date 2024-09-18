fun main() {
    print("Первое число: ")
    val a = readLine()!!.toInt()
    print("Второе число: ")
    val b = readLine()!!.toInt()
    if (a > b) {
        println("$a больше")
        println("$b меньше")
    } else {
        println("$b больше")
        println("$a меньше")
    }
}
