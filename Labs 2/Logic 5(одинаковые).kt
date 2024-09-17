fun main() {
    val x = true
    val y = true
    val z = false

    println("а) не X и Y: ${(!x && y)}")
    println("б) X или не Y: ${(x || !y)}")
    println("в) X или Y и Z: ${(x || (y && z))}")
}
