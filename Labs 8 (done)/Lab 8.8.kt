fun main() {
    print("Введите время в минутах: ")
    val min = readln().toInt()
    print("Введите количество кадров: ")
    val fps = readln().toInt()

    val frames = calFrames(min, fps)
    println("За $min минут при $fps FPS компьютер покажет $frames")
}

fun calFrames (min: Int, fps: Int): Long {
    val oneMinute = 60L
    val totalSeconds = min.toLong() * oneMinute
    return totalSeconds * fps
}