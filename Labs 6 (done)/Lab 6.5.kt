fun main() {
    val nums = intArrayOf(12, 5, 28, 1, 45, 33, 8, 99, 21, 16, 12, 5, 28, 33)

    val uniqueNums = mutableSetOf<Int>()

    for (num in nums) {
        uniqueNums.add(num)
    }

    println("Уникальные элементы:")
    for (num in uniqueNums) {
        print("$num ")
    }
}