fun main() {
    print("Введите температуру в градусах Цельсия: ")
    val cel = readln().toDouble()

    val result = celtofah(cel)
    println("$cel°C эквивалентно $result°F")
}

fun celtofah (cel: Double): Double {
    return cel * 9 / 5 + 32
}