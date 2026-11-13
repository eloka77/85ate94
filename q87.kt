fun main() {
    print("\nDigite numero: ")
    val num = readln().toInt()
    if (num % 3 == 0) {
        println("\nE multiplo de 3")
    } else {
        println("\nNao e multiplo de 3")
    }
}