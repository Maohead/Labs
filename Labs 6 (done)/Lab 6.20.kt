fun main() {
    val startValue = 1
    val step = 3
    val count = 10

    val arithmeticProgression = IntArray(count) { startValue + it * step }
    
    println("Арифметическая прогрессия:")
    for (number in arithmeticProgression) {
        print("$number ")
    }
}