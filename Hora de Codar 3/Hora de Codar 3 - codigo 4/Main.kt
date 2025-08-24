/*
Elementos usados neste arquivo Kotlin:

fun main():
    - fun: palavra-chave que define uma função.
    - main: nome da função principal, ponto de entrada do programa.
    - (): indica que a função não recebe parâmetros.

var soma = 0, var con = 0, var numero = 100:
    - var: declara uma variável mutável.
    - soma, con, numero: nomes das variáveis.
    - =: operador de atribuição, define o valor inicial da variável.
    - 0, 100: valores iniciais atribuídos às variáveis.

while (numero >= 15):
    - while: estrutura de repetição que executa o bloco enquanto a condição for verdadeira.
    - (numero >= 15): condição que mantém o laço ativo enquanto numero for maior ou igual a 15.

soma += numero:
    - +=: operador de adição e atribuição, soma o valor de numero à variável soma.

con += 1:
    - +=: operador de adição e atribuição, incrementa o valor de con em 1.

numero -= 1:
    - -=: operador de subtração e atribuição, diminui 1 do valor atual de numero.

println(...):
    - println: função que exibe uma mensagem no console e pula para a próxima linha.
    - numero: variável cujo valor é exibido.
    - "A média é igual a ${soma/con}": texto exibido ao usuário, com interpolação de string.

${...}:
    - Interpolação de string: insere o valor de uma variável ou expressão dentro do texto.
*/

// Faça um algoritmo que calcule e escreva a média aritmética dos números inteiros
// entre 15 (inclusive) e 100 (inclusive).

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