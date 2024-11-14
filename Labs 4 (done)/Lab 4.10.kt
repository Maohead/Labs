fun main() {
    print("Введите способ оплаты: ")
    val oplata = readLine()!!.toString()
    val methodOplata = when (oplata) {
        "наличные" -> "Вы выбрали оплату наличными."
        "кредитная карта" -> "Вы выбрали оплату кредитной картой"
        "paypal" -> "Вы выбрали оплату через PayPal"
        else -> "Неизвестный способ оплаты."
    }
    println("$methodOplata")
}