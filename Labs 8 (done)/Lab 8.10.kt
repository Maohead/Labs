fun main() {
    print("Введите текст: ")
    val txt = readln().toString()
    print("Введите количество повторений: ")
    val n = readln().toInt()

    val repeatText = repetition(txt, n)
    println(repeatText)
}

fun repetition(txt: String, n: Int): String {
    return if (n == 0) {
        ""
    } else {
        "$txt${repetition(txt, n - 1)}"
    }
}