fun main() {
    val A = true
    val B = false
    val C = false

    println("а) не A и B: ${if (!A && B) "Истина" else "Ложь"}")
    println("б) A или не B: ${if (A || !B) "Истина" else "Ложь"}")
    println("в) A и B или C: ${if (A && B || C) "Истина" else "Ложь"}")
}
