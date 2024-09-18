fun main() {
    print("Число a: ")
    val a = readLine()!!.toInt()
    print("Число b: ")
    val b = readLine()!!.toInt()

    if (b % a == 0) {
        println("$a является делителем $b")
    } else {
        println("$a не является делителем $b")
    }
}
