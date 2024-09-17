fun main() {
    print("Первое: ")
    val a = readLine()!!.toInt()
    print("Второе: ")
    val b = readLine()!!.toInt()
    print("Третье: ")
    val c = readLine()!!.toInt()
    val sred = (a + b + c) / 3
    if (a == b || a == c || b == c) {
        println("Ошибка")
    }
    else {
        println("Среднее число: $sred")
    }
}
