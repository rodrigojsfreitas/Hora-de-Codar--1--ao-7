// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Inicializa a variável soma com zero
    var soma = 0
    // Solicita ao usuário o primeiro número e converte a entrada para inteiro
    println("Digite o primeiro número:")
    var numero1 = readLine()!!.toInt()
    // Se o número for menor que 72, soma ao total
    if (numero1 < 72) {
        soma += numero1
    }

    // Solicita o segundo número
    println("Digite o segundo número:")
    var numero2 = readLine()!!.toInt()
    if (numero2 < 72) {
        soma += numero2
    }

    // Solicita o terceiro número
    println("Digite o terceiro número:")
    var numero3 = readLine()!!.toInt()
    // Corrigido: soma o terceiro número se for menor que 72
    if (numero3 < 72) {
        soma += numero3
    }

    // Solicita o quarto número
    println("Digite o quarto número:")
    var numero4 = readLine()!!.toInt()
    if (numero4 < 72) {
        soma += numero4
    }

    // Solicita o quinto número
    println("Digite o quinto número:")
    var numero5 = readLine()!!.toInt()
    // Se o quinto número for menor que 72, soma ao total
    if (numero5 < 72) {
        soma += numero5
    }

    // Solicita o sexto número
    println("Digite o sexto número:")
    var numero6 = readLine()!!.toInt()
    // Se o sexto número for menor que 72, soma ao total
    if (numero6 < 72) {
        soma += numero6
    }

    // Exibe todos os números digitados e a soma dos que são menores que 72
    println("Os números: $numero1, $numero2, $numero3, $numero4, $numero5, $numero6  \n A soma: $soma" )

}
