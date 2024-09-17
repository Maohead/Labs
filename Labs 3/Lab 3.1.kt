fun main() {
    print("Первое: ")
    val a = readLine()!!.toInt()
    print("Второе: ")
    val b = readLine()!!.toInt()
    print("Третье: ")
    val c = readLine()!!.toInt()
    var maxnum = a
    if (b>maxnum) {
        maxnum = b
    }
    if (c>maxnum) {
        maxnum = c
    }
    println("Максимальное число: $maxnum")
}
