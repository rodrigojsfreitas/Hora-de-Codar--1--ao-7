/*
Elementos usados neste arquivo Kotlin:

fun main():
    - fun: palavra-chave que define uma função.
    - main: nome da função principal, ponto de entrada do programa.
    - (): indica que a função não recebe parâmetros.

var num = 10:
    - var: declara uma variável mutável.
    - num: nome da variável.
    - =: operador de atribuição, define o valor inicial da variável.
    - 10: valor inicial atribuído à variável.

while (num > 0):
    - while: estrutura de repetição que executa o bloco enquanto a condição for verdadeira.
    - (num > 0): condição que mantém o laço ativo enquanto num for maior que 0.

if (num == 1):
    - if: estrutura condicional, executa o bloco se a condição for verdadeira.
    - (num == 1): condição que verifica se num é igual a 1.

print(...):
    - print: função que exibe uma mensagem no console (sem pular linha).
    - "$num": interpolação de string, insere o valor da variável num no texto.
    - "$num, ": imprime o valor de num seguido de vírgula.

break:
    - break: comando que encerra o laço imediatamente.

num -= 1:
    - -=: operador de subtração e atribuição, diminui 1 do valor atual de num.
*/

// Escreva um algoritmo para imprimir os números de 1 (inclusive)
// a 10 (inclusive) em ordem decrescente.
// Exemplo: 10, 9, 8, 7, 6, 5, 4, 3, 2, 1

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