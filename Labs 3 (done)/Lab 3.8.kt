fun main() {
    print("Километры: ")
    val km = readLine()!!.toInt()
    print("Футы: ")
    val foot = readLine()!!.toInt()

    val ftm = 0.305
    val ftk = ftm / 1000

    val fk = foot * ftk

    if (km < fk) {
        println("Расстояние в километрах ($km км) меньше, чем в футах ($fk км)")
    } else {
        println("Расстояние в футах ($fk км) меньше, чем в километрах ($km км)")
    }
}
