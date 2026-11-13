fun main() {
    print("\nDigite numero: ")
    val num = readln().toInt()
    if (num % 5 == 0) {
        println("\nE multiplo de 5")
    } else {
        println("\nNao e multiplo de 5")
    }
}