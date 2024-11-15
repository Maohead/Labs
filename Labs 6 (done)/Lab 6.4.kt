fun main() {
    val nums = intArrayOf(12, 5, 28, 1, 45, 33, 8, 99, 21, 16)

    for (i in 0 until nums.size - 1) {
        for (j in 0 until nums.size - i - 1) {
            if (nums[j] > nums[j + 1]) {
                val temp = nums[j]
                nums[j] = nums[j + 1]
                nums[j + 1] = temp
            }
        }
    }

    println("Отсортированный массив: ")
    for (num in nums) {
        print("$num ")
    }
}