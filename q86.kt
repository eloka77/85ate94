fun main() {
    print("\nDigite numero: ")
    val num = readln().toDouble()
    if (num > 0.0) {
        println("\nPOSITIVO")
    } else if (num < 0.0) {
        println("\nNEGATIVO")
    } else {
        println("\nNULO")
    }
}