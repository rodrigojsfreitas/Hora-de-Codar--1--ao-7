/*
Elementos usados neste arquivo Kotlin:

fun main():
    - fun: palavra-chave que define uma função.
    - main: nome da função principal, ponto de entrada do programa.
    - (): indica que a função não recebe parâmetros.

println(...):
    - println: função que exibe uma mensagem no console e pula para a próxima linha.
    - "texto": texto (String) exibido ao usuário.

var ac = readln():
    - var: inicia uma variável mutável.
    - ac: nome da variável.
    - =: operador de atribuição, define o valor inicial da variável.
    - readln(): lê uma linha digitada pelo usuário no console.

if (ac == "acione"):
    - if: estrutura condicional, executa um bloco se a condição for verdadeira.
    - ac == "acione": condição booleana, verifica se o valor digitado é igual a "acione".
    - ==: operador de igualdade.
    - { }: bloco de código executado se a condição for verdadeira.

var bomba = 30:
    - var: inicia uma variável mutável.
    - bomba: nome da variável.
    - =: operador de atribuição, define o valor inicial da variável.
    - 30: valor inicial da variável.

while (bomba >= 0):
    - while: estrutura de repetição, executa o bloco enquanto a condição for verdadeira.
    - bomba >= 0: condição booleana.
    - >=: operador relacional "maior ou igual".
    - bomba -= 1: decrementa o valor da variável bomba em 1 a cada repetição.
    - -=: operador de atribuição composto (subtrai e atribui).

print(...):
    - print: exibe uma mensagem no console (sem pular linha).
    - "texto": texto exibido ao usuário.

${...}:
    - Interpolação de string: insere o valor de uma variável ou expressão dentro do texto (não usado diretamente neste exemplo, mas pode ser usado).
*/

// Escreva um algoritmo para ler 2 valores informados pelo usuário e enquanto o segundo
// valor informado for igual ou menor que ZERO, deve ser lido um novo valor,
// mas para a mesma variável. Ou seja, para o segundo valor não pode ser aceito
// o valor zero nem um valor negativo.
//
// O seu programa deve imprimir o resultado da divisão do primeiro valor lido pelo segundo
// valor e exibir o resultado ao usuário

// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Solicita ao usuário que digite 'acione' para armar a bomba
    println("Escreva acione para armar a bomba")
    var ac = readln()
    // Verifica se o usuário digitou 'acione'
    if (ac == "acione"){
        // Inicializa a variável bomba com 30
        var bomba = 30
        // Enquanto bomba for maior ou igual a 0, exibe o valor e decrementa
        while (bomba >= 0){
            println(bomba)
            bomba -= 1
        }
        // Exibe mensagem de explosão
        println("Booooooom!!!!!")
    }else {
        // Se não digitou 'acione', nada acontece
        print("Nada aconteceu!!!")
    }
}