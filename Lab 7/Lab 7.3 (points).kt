fun main() {
    print("Кол-во побед: ")
    val wins = readLine()!!.toInt()
    print("Кол-во ничей: ")
    val draws = readLine()!!.toInt()
    print("Кол-во поражений: ")
    val losses = readLine()!!.toInt()

    val totalPoints = calPoints(wins, draws, losses)
    println("Общее кол-во очков: $totalPoints")
}

fun calPoints(wins: Int, draws: Int, losses: Int): Int {
    return wins * 3 + draws * 1 + losses * 0
}