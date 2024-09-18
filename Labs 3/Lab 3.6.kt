fun main() {
    print("Введите год: ")
    val year = readLine()!!.toInt()
    var days = 365
    if (year % 4 == 0){
        days += 1
        println("$year - високосный год")
        println("Количество дней в году = $days")
    } else {
        println("$year - невисокосный год")
    }
}
