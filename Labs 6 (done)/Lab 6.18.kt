fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)

    for (i in 0 until numbers.size step 5) {
        print("Группа ${i/5 + 1}: ")
        for (j in i until Math.min(i + 5, numbers.size)) {
            print("${numbers[j]} ")
        }
        println()
    }
}