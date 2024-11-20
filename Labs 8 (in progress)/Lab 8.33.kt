fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5)
    print("Введите индекс массива: ")
    val index = readln().toInt()

    val element = getIndex(array, index)

    if (element != null) {
        println("Элемент по индексу $index: $element")
    } else {
        println("Индекса $index нет в массиве")
    }
}

fun getIndex(arr: IntArray, index: Int): Int? {
    if (index !in 0 until arr.size) {
        return null
    }

    return arr[index]
}