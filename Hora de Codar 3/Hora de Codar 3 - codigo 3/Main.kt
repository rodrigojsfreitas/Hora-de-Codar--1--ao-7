// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Inicializa a variável num com 10
    var num = 10
    // Enquanto num for maior que 0, executa o bloco
    while (num > 0) {
        // Se num for igual a 1, imprime sem vírgula e encerra o laço
        if (num == 1) {
            print("$num")
            break
        }
        // Imprime o número seguido de vírgula
        print("$num, ")
        // Decrementa num
        num -= 1
    }
}