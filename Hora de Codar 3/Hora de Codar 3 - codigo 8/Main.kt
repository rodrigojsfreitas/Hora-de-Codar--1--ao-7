// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Solicita ao usuário um número inteiro
    println("Escreva um número:")
    var numero1 = readln()!!.toInt()
    // Inicializa o contador n
    var n = 1
    // Valida se o número é maior que 0
    while(numero1 < 1){
        println("Escreva um número maior do que um")
        numero1 = readln()!!.toInt()
    }
    // Imprime os números de 1 até o número informado
    while(n <= numero1){
        // Se for o último número, imprime sem vírgula e encerra o laço
        if (n == numero1){
            print("$n")
            break
        }
        // Imprime o número seguido de vírgula
        print("$n, ")
        // Incrementa o contador
        n+=1
    }
}