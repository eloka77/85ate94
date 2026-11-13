fun main() {
    print("\nDigite numero: ")
    val num = readln().toInt()
    if (num % 3 == 0 && num % 5 == 0) {
        println("\nE multiplo de 3 e 5")
    } else {
        println("\nNao e multiplo de 3 e 5")
    }
}