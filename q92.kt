fun main() {
    print("\nDigite numero: ")
    val num = readln().toDouble()
    if (num > 20.0) {
        println("\nMaior que 20")
    } else if (num < 20.0) {
        println("\nMenor que 20")
    } else {
        println("\nIgual a 20")
    }
}