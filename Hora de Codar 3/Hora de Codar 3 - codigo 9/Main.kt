/*
Elementos usados neste arquivo Kotlin:

fun main():
    - fun: palavra-chave que define uma função.
    - main: nome da função principal, ponto de entrada do programa.
    - (): indica que a função não recebe parâmetros.

var con = 0, var num = 100:
    - var: declara uma variável mutável.
    - con, num: nomes das variáveis.
    - =: operador de atribuição, define o valor inicial da variável.
    - 0, 100: valores iniciais atribuídos às variáveis.

while(con <= 10):
    - while: estrutura de repetição que executa o bloco enquanto a condição for verdadeira.
    - (con <= 10): condição que mantém o laço ativo enquanto con for menor ou igual a 10.

con += 1, num += 1:
    - +=: operador de adição e atribuição, incrementa o valor da variável em 1.

if (con == 10):
    - if: estrutura condicional, executa o bloco se a condição for verdadeira.
    - (con == 10): condição que verifica se con é igual a 10.

print(...):
    - print: exibe uma mensagem no console (sem pular linha).
    - "$num": interpolação de string, insere o valor da variável num no texto.
    - "$num, ": imprime o valor de num seguido de vírgula.

break:
    - break: comando que encerra o laço imediatamente.

${...}:
    - Interpolação de string: insere o valor de uma variável ou expressão dentro do texto.
*/

// Escreva um algoritmo para imprimir os 10 primeiros números inteiros maiores que 100.

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