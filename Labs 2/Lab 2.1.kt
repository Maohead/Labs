fun main() {
    print("Введите двузначное число: ")
    val num = readLine()!!.toInt()
    val a_num = num / 10
    val b_num = num % 10
    val sum_num = a_num + b_num
    val pro_num = a_num * b_num
    println("Число десятков: $a_num")
    println("Число единиц: $b_num")
    println("Сумма цифр: $sum_num")
    println("Произведение цифр: $pro_num")
}
