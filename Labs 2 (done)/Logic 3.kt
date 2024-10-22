fun main() {
    val A = true
    val B = false
    val C = false

    println("а) не A и B: ${(!A && B)}")
    println("б) A или не B: ${(A || !B)}")
    println("в) A и B или C: ${(A && B || C)}")
}
