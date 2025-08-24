/*
Elementos usados neste arquivo Kotlin:

fun main():
    - fun: palavra-chave que define uma função.
    - main: nome da função principal, ponto de entrada do programa.
    - (): indica que a função não recebe parâmetros.

println(...):
    - println: função que exibe uma mensagem no console e pula para a próxima linha.
    - "texto": texto (String) exibido ao usuário.

var numero1 = readln()!!.toInt():
    - var: declara uma variável mutável.
    - numero1: nome da variável.
    - =: operador de atribuição, define o valor inicial da variável.
    - readln(): lê uma linha digitada pelo usuário no console.
    - !!: operador que garante que o valor não é nulo.
    - toInt(): converte o texto lido para inteiro.

var n = 1:
    - var: declara uma variável mutável.
    - n: nome da variável.
    - =: operador de atribuição, define o valor inicial da variável.
    - 1: valor inicial atribuído à variável.

while(numero1 < 1):
    - while: estrutura de repetição que executa o bloco enquanto a condição for verdadeira.
    - (numero1 < 1): condição que mantém o laço ativo enquanto numero1 for menor que 1.

while(n <= numero1):
    - while: estrutura de repetição que executa o bloco enquanto a condição for verdadeira.
    - (n <= numero1): condição que mantém o laço ativo enquanto n for menor ou igual a numero1.

if (n == numero1):
    - if: estrutura condicional, executa o bloco se a condição for verdadeira.
    - (n == numero1): condição que verifica se n é igual a numero1.

print(...):
    - print: exibe uma mensagem no console (sem pular linha).
    - "$n": interpolação de string, insere o valor da variável n no texto.
    - "$n, ": imprime o valor de n seguido de vírgula.

break:
    - break: comando que encerra o laço imediatamente.

n += 1:
    - +=: operador de adição e atribuição, incrementa o valor de n em 1.

${...}:
    - Interpolação de string: insere o valor de uma variável ou expressão dentro do texto.
*/

// Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive).
// Considere que o N será sempre maior que ZERO. N é um valor informado pelo usuário

// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Solicita ao usuário um número inteiro
    println("Escreva um número:")
    var numero1 = readln()!!.toInt()
    // Inicializa o contador n
    var n = 1
    // Valida se o número é maior que 0
    while(numero1 < 1){
        println("Escreva um número maior do que um")
        numero1 = readln()!!.toInt()
    }
    // Imprime os números de 1 até o número informado
    while(n <= numero1){
        // Se for o último número, imprime sem vírgula e encerra o laço
        if (n == numero1){
            print("$n")
            break
        }
        // Imprime o número seguido de vírgula
        print("$n, ")
        // Incrementa o contador
        n+=1
    }
}