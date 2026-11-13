fun main() {
    print("\nDigite o salario: ")
    val salario = readln().toDouble()
    print("\nDigite o valor da prestacao: ")
    val prestacao = readln().toDouble()
    if (prestacao <= salario * 0.3) {
        println("\nEmprestimo concedido")
    } else {
        println("\nEmprestimo negado")
    }
}