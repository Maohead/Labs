fun main() {
    print("Первая сторона: ")
    val a = readLine()!!.toInt()
    print("Вторая сторона: ")
    val b = readLine()!!.toInt()
    print("Третья сторона: ")
    val c = readLine()!!.toInt()
    if (a + b > c && a + c > b && b + c > a) {
        println("Треугольник с такими сторонами может существовать.")
    } else {
        println("Треугольник не может существовать с такими сторонами.")
    }
}
