fun main() {
    print("Большее число: ")
    val big = readLine()!!.toInt()
    print("Меньшее число: ")
    val small = readLine()!!.toInt()
    if (big % small == 0){
        println("Первое число $big кратно второму числу $small.")
    } else {
        println("Первое число $big не кратно второму числу $small. Остаток = ${big % small}")
    }
}
