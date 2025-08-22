// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Inicializa o contador con e o número inicial num
    var con = 0
    var num = 100
    // Laço para imprimir 11 números a partir de 101
    while(con <=10){
        // Incrementa o contador e o número
        con+=1
        num+=1
        // Se for o último número, imprime sem vírgula e encerra o laço
        if (con == 10){
            print("$num")
            break
        }
        // Imprime o número seguido de vírgula
        print("$num, ")
    }
}