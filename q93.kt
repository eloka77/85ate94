fun main() {
    print("\nDigite ano de nascimento: ")
    val anoNascimento = readln().toInt()
    print("\nDigite ano atual: ")
    val anoAtual = readln().toInt()
    val idade = anoAtual - anoNascimento
    println("\nIdade: $idade")
    if (idade >= 18) {
        println("Pode votar e conduzir")
    } else if (idade >= 16) {
        println("Pode votar, mas nao conduzir")
    } else {
        println("Nao pode votar nem conduzir")
    }
}
