fun main() {
    val A = true
    val B = false
    val C = false

    println("а) А или В: ${if (A || B) "Истина" else "Ложь"}")
    println("б) А и В: ${if (A && B) "Истина" else "Ложь"}")
    println("в) В или С: ${if (B || C) "Истина" else "Ложь"}")
}
