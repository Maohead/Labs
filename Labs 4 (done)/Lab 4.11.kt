fun main() {
    print("Введите группу крови: ")
    val blood = readLine()!!.toString()
    val bloodTypes = when (blood) {
        "A" -> "Совместимые группы: A, O"
        "B" -> "Совместимые группы: B, O"
        "AB" -> "Совместимые группы: A, B, AB, O"
        "O" -> "Совместимые группы: O"
        else -> "Неизвестная группа крови."
    }
    println("$bloodTypes")
}