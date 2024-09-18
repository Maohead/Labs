fun main() {
    print("Число m: ")
    val m = readLine()!!.toInt()
    print("Число n: ")
    val n = readLine()!!.toInt()
    if (m % n == 0) {
        val chas = m / n
        println("Частное = $chas")
    } else {
        println("$m на $n нацело не делится")
    }
}
