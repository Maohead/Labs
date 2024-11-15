fun main() {
    val array1 = intArrayOf(1, 2, 3, 4, 5)
    val array2 = intArrayOf(3, 5, 7, 9, 11)

    val intersection = array1.intersect(array2.toSet()).toSet()

    println("Пересечение массивов:")
    for (element in intersection) {
        print("$element ")
    }
}