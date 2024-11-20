fun main() {
    print("Введите уровень пирамиды: ")
    val n = readln().toInt()
    generatePyramid(n)
}

fun generatePyramid(n: Int) {
    val maxWidth = 2 * n - 1

    for (i in 1..n) {
        val numOfHashes = 2 * i - 1

        val row = "#".repeat(numOfHashes).padStart((maxWidth + numOfHashes) / 2)

        println(row)
    }
}