import kotlin.random.Random

fun main() {
    val deck = createDeck().toMutableList()
    shuffle(deck)

    var playerScore = 0
    var dealerScore = 0

    println("Добро пожаловать в игру '21'!")

    while (true) {
        print("Ваша текущая сумма: $playerScore. Хотите взять карту? (y/n): ")
        val input = readLine()!!.lowercase()

        if (input == "n") break

        val card = drawCard(deck)
        playerScore += getValue(card)

        if (playerScore > 21) {
            println("Вы проиграли! Ваша сумма: $playerScore")
            return
        }

        println("Вы взяли карту: $card. Ваша новая сумма: $playerScore.")
    }

    while (dealerScore <= 17) {
        val card = drawCard(deck)
        dealerScore += getValue(card)
        println("Дилер взял карту: $card. Его новая сумма: $dealerScore.")
    }

    if (dealerScore > 21 || playerScore > dealerScore) {
        println("Поздравляем! Вы выиграли! Ваша сумма: $playerScore, сумма дилера: $dealerScore.")
    } else {
        println("К сожалению, вы проиграли. Ваша сумма: $playerScore, сумма дилера: $dealerScore.")
    }
}

fun createDeck(): List<String> {
    val suits = listOf("Червей", "Бубен", "Треф", "Пик")
    val ranks = listOf("2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз")

    return suits.flatMap { suit ->
        ranks.map { rank -> "$rank $suit" }
    }
}

fun shuffle(deck: MutableList<String>) {
    for (i in deck.indices) {
        val j = Random.nextInt(i, deck.size)
        val temp = deck[i]
        deck[i] = deck[j]
        deck[j] = temp
    }
}

fun drawCard(deck: MutableList<String>): String {
    return deck.removeAt(0)
}

fun getValue(card: String): Int {
    val value = when (card.substringBefore(' ')) {
        "Валет", "Дама", "Король" -> 10
        "Туз" -> 11
        else -> card.substringBefore(' ').toInt()
    }

    return value
}