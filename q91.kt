fun main() {
    print("\nDigite numero: ")
    val num = readln().toDouble()
    if (num in 20.0..90.0) {
        println("\nO numero esta entre 20 e 90")
    } else {
        println("\nO numero nao esta entre 20 e 90")
    }
}


