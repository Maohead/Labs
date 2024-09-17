fun main() {
    val a = true
    val b = false
    val c = false

    println("а) А или не (А и В): ${(a || !(a && b))}")
    println("б) не А или А и (В или С): ${(!a || a && (b || c))}")
    println("в) (А или В и не С) и С: ${((a || b && !c) || c)}")
}
