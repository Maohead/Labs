fun main() {
    print("Введите сумму в долларах (USD): ")
    val usdAmount = readLine()?.toDoubleOrNull()

    if (usdAmount == null || usdAmount <= 0) {
        println("Введите корректную сумму.")
        return
    }

    val exchangeRate = 0.92

    val euroAmount = convertCurrency(usdAmount, exchangeRate)
    println("Сумма в евро (EUR): %.2f".format(euroAmount))
}

fun convertCurrency(amount: Double, rate: Double): Double {
    return amount * rate
}