fun main() {
    print("Введите вероятность выигрыша: ")
    val prob = readln().toDouble()
    print("Введите размер приза: ")
    val prize = readln().toInt()
    print("Введите стоимость участия: ")
    val pay = readln().toInt()

    println("${isProfitable2(prob, prize, pay)}")
}

fun isProfitable2(prob: Double, prize: Int, pay: Int): Boolean {
    return prob * prize > pay
}