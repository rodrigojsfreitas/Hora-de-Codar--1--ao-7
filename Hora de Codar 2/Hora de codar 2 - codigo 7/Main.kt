/*
Elementos usados neste arquivo Kotlin:

fun main():
    - fun: palavra-chave que define uma função.
    - main: nome da função principal, ponto de entrada do programa.
    - (): indica que a função não recebe parâmetros.

println(...):
    - println: função que exibe uma mensagem no console e pula para a próxima linha.
    - "texto": texto (String) exibido ao usuário.

var soma = 0:
    - var: inicia uma variável mutável.
    - soma: nome da variável.
    - =: operador de atribuição, define o valor inicial da variável.
    - 0: valor inicial da variável.

var numeroX = readLine()!!.toInt():
    - var: inicia uma variável mutável.
    - numeroX: nome da variável (numero1, numero2, ...).
    - =: operador de atribuição.
    - readLine(): lê uma linha digitada pelo usuário no console.
    - !!: operador que garante que o valor não é nulo.
    - toInt(): converte o texto lido para inteiro.

if (numeroX < 72):
    - if: estrutura condicional, executa um bloco se a condição for verdadeira.
    - (numeroX < 72): condição booleana.
    - <: operador relacional "menor que".
    - soma += numeroX: soma o valor à variável soma.
    - +=: operador de atribuição composto (soma e atribui).

Interpolação de string ($numero1, $soma):
    - $variavel: insere o valor da variável dentro do texto exibido.
*/

// Faça um programa que leia 6 números que o usuário vai informar.
// Todos os números lidos com valor inferior a 72 devem ser somados.
// Escreva o valor final da soma efetuada e também todos valores que o usuário informou.

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
