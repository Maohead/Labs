fun main() {
    print("Введите текст: ")
    val plainText = readln().toString()
    print("Введите значение сдвига: ")
    val key = readln().toInt()

    val encryptedText = caesarCipher(plainText, key)
    println("Зашифрованный текст: $encryptedText")

    val decryptedText = caesarCipher(encryptedText, key, false)
    println("Расшифрованный текст: $decryptedText")
}

fun caesarCipher(text: String, shift: Int, encrypt: Boolean = true): String {
    val alphabet = ('a'..'z') + ('A'..'Z')
    val shiftedAlphabet = if (encrypt) {
        alphabet.map { it + shift }.map { if (it !in alphabet) it - 26 else it }
    } else {
        alphabet.map { it - shift }.map { if (it !in alphabet) it + 26 else it }
    }

    return text.map { char ->
        if (char in alphabet) {
            shiftedAlphabet[alphabet.indexOf(char)]
        } else {
            char
        }
    }.joinToString("")
}