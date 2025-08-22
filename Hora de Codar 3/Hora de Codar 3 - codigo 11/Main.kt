// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Inicializa as variáveis para armazenar o número digitado e o contador de números válidos
    var n  = 0
    var con = 0
    // Laço for para repetir 10 vezes
    for ( x in 1..10){
        // Solicita ao usuário o número da vez
        println("Escreva o número $x")
        n = readln()!!.toInt()
        // Verifica se o número está entre 24 e 42 (inclusive)
        if (n <= 42 && n >= 24){
            con+=1
        }
    }
    // Exibe quantos números válidos foram digitados
    println("Você escreveu $con números entre 24 e 42")
}