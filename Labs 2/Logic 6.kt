fun main() {
    val x = false
    val y = false
    val z = true

    println("а) X или Y и не Z: ${(x || (y && !z))}")
    println("б) не X и не Y: ${(!x && !y)}")
    println("в) не (X и Z) или Y: ${(!(x && z) || y)}")
    println("г) X и не Y или Z: ${(x && !y || z)}")
    println("д) X и (не Y или Z): ${(x && (!y || z))}")
    println("е) X или (не (Y или Z)): ${(x || (!(y || z)))}")
}
