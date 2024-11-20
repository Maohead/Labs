fun main() {
    print("Введите число: ")
    val number = readln().toInt()

    multiplicationTable(number)
}

fun multiplicationTable(number: Int) {
    for (i in 1..10) {
        println("$number x $i = ${number * i}")
    }
}