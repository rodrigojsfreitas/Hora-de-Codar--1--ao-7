// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Solicita ao usuário um número inteiro
    println("Escreva um número")
    var n = readln()!!.toInt()
    // Inicializa o número da tabuada e o contador
    var num = 1
    var con = 0
    // Laço para imprimir a tabuada do número informado
    while (num <= n){
        // Imprime a multiplicação do número atual pela contagem
        println("$num X $con = ${con*num}")
        // Incrementa o contador
        con+=1
        // Se o contador passar de 10, reinicia e passa para o próximo número
        if(con > 10) {
            con = 0
            num += 1
            println()
            println("-".repeat(100)) // Imprime uma linha separadora
            println()
        }
    }
}
