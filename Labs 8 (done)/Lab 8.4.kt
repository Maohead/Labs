fun main() {
    print("Введите вероятность выигрыша: ")
    val prob = readln().toDouble()
    print("Введите размер приза: ")
    val prize = readln().toInt()
    print("Введите стоимость участия: ")
    val pay = readln().toInt()

    println("${isProfitable(prob, prize, pay)}")
}

fun isProfitable(prob: Double, prize: Int, pay: Int): Boolean {
    return prob * prize > pay
}