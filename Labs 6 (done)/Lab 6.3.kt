fun main() {
    val nums = intArrayOf(12, 5, 28, 1, 45, 33, 8, 99, 21, 16)

    var max = nums[0]
    for(num in nums) {
        if (num > max) {
            max = num
        }
    }

    var min = nums[0]
    for(num in nums) {
        if (num < min) {
            min = num
        }
    }
    println("Макс. значение: $max")
    println("Мин. значение: $min")
}