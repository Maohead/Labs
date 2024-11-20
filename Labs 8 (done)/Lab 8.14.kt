fun main() {
    print("Введите первое число: ")
    val a = readln().toInt()
    print("Введите второе число: ")
    val b = readln().toInt()
    
    val result = sum(a, b)
    println("Сумма двух чисел: $result")
}

fun sum(a: Int, b: Int): Int {
    return a+ b
}