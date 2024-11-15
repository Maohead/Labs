fun main() {
    print("Введите элементы массива, разделяя их пробелами: ")
    val array = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()

    print("Ваш массив: ")
    for (element in array) {
        print("$element ")
    }
}