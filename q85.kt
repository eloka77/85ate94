fun main() {
    print("\nDigite numero: ")
    val a = readln().toDouble()
    if (a > 20.0) {
        println("\nMaior que 20")
    } else if (a == 20.0) {
        println("\nIgual a 20")
    } else {
        println("\nMenor que 20")
    }
}