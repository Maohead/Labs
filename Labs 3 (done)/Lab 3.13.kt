fun main() {
    print("Введите чертырехзначное число: ")
    val num = readLine()!!.toInt()

    if (num !in 1000..9999 && num !in -9999..-1000) {
        println("Число должно быть четырехзначным!")
    }

    //извекаем цифры
    val n1 = num / 1000
    val n2 = (num % 1000) / 100
    val n3 = (num % 100) / 10
    val n4 = num % 10
    println("Цифры: ${n1}, ${n2}, ${n3}, ${n4}")

    //сумма первых и последний числ равна/не равна
    println("a)")
    val sumn12 = n1 + n2
    val sumn34 = n3 + n4
    println("Первая сумма = ${sumn12}")
    println("Вторая сумма = ${sumn34}")
    if (sumn12 == sumn34) {
        println("Сумма первых двух цифр равна сумме последних двух цифр.")
    } else {
        println("Сумма первых двух цифр НЕ равна сумме последних двух цифр.")
    }

    //сумма цифр кратно 3
    println("б)")
    val sumdigits = n1 + n2 + n3 + n4
    println("Сумма цифр = ${sumdigits}")
    if (sumdigits % 3 == 0) {
        println("Сумма цифр кратно трём.")
    } else {
        println("Сумма цифр НЕ кратно трём.")
    }

    //произведение цифр кратно 4
    println("в)")
    val productdigits = n1 * n2 * n3 * n4
    println("Произведение цифр = ${productdigits}")
    if (productdigits % 4 == 0) {
        println("Произведение цифр кратно четырём.")
    } else {
        println("Произведение цифр НЕ кратно четырём.")
    }

    //произведение цифр кратно числу a
    println("г)")
    print("Введите число a: ")
    val a = readLine()!!.toInt()
    if (productdigits % a == 0) {
        println("Произведение цифр кратно числу a.")
    } else {
        println("Произведение цифр НЕ кратно числу a.")
    }
}
