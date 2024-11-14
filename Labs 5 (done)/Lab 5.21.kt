import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main() {
    print("Введите год: ")
    val year = readLine()!!.toInt()
    print("Введите месяц (число от 1 до 12): ")
    val month = readLine()!!.toInt()

    if (month in 1..12) {
        val firstDayOfMonth = LocalDate.of(year, month, 1)
        val lastDayOfMonth = firstDayOfMonth.plusMonths(1).minusDays(1)

        println("Даты в $month месяце $year года:")
        for (day in 1..lastDayOfMonth.dayOfMonth) {
            val date = LocalDate.of(year, month, day)
            val formattedDate = date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
            println(formattedDate)
        }
    } else {
        println("Некорректный номер месяца!")
    }
}