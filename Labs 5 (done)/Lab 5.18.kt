fun main() {
    print("Введите высоту лестницы: ")
    val height = readLine()!!.toInt()

    for (i in 1..height) {
        for (j in 1..i) {
            print("#")
        }
        println()
    }
}