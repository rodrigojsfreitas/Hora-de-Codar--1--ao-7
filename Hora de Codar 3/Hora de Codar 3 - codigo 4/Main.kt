// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Inicializa as variáveis soma e con (contador)
    var soma = 0
    var con = 0
    // Inicializa a variável numero com 100
    var numero = 100
    // Enquanto numero for maior ou igual a 15, executa o bloco
    while (numero >= 15){
        // Adiciona o valor de numero à soma
        soma += numero
        // Incrementa o contador
        con += 1
        // Decrementa numero
        numero -= 1
        // Exibe o valor atual de numero
        println(numero)
    }
    // Exibe a média dos valores somados
    println("A média é igual a ${soma/con}")

}