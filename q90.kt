fun main() {
    print("\nDigite numero: ")
    val num = readln().toInt()
    if (num % 10 == 0) {
        println("\nDivisivel por 10, 5 e 2")
    } else if (num % 5 == 0) {
        println("\nDivisivel por 5")
    } else if (num % 2 == 0) {
        println("\nDivisivel por 2")
    } else {
        println("\nNao e divisivel por 10, 5 ou 2")
    }
}