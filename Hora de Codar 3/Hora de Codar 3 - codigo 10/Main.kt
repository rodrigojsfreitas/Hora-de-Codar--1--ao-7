/*
Elementos usados neste arquivo Kotlin:

fun main():
    - fun: palavra-chave que define uma função.
    - main: nome da função principal, ponto de entrada do programa.
    - (): indica que a função não recebe parâmetros.

println(...):
    - println: função que exibe uma mensagem no console e pula para a próxima linha.
    - "texto": texto (String) exibido ao usuário.

var n = readln()!!.toInt():
    - var: declara uma variável mutável.
    - n: nome da variável.
    - =: operador de atribuição, define o valor inicial da variável.
    - readln(): lê uma linha digitada pelo usuário no console.
    - !!: operador que garante que o valor não é nulo.
    - toInt(): converte o texto lido para inteiro.

var num = 1, var con = 0:
    - var: declara uma variável mutável.
    - num, con: nomes das variáveis.
    - =: operador de atribuição, define o valor inicial da variável.
    - 1, 0: valores iniciais atribuídos às variáveis.

while (num <= n):
    - while: estrutura de repetição que executa o bloco enquanto a condição for verdadeira.
    - (num <= n): condição que mantém o laço ativo enquanto num for menor ou igual a n.

println("$num X $con = ${con*num}"):
    - println: imprime o texto no console, mostrando a multiplicação do número pela contagem.
    - "$num X $con = ${con*num}": texto exibido ao usuário, com interpolação de string.
    - ${con*num}: expressão que calcula o resultado da multiplicação.

con += 1:
    - +=: operador de adição e atribuição, incrementa o valor de con em 1.

if(con > 10):
    - if: estrutura condicional, executa o bloco se a condição for verdadeira.
    - (con > 10): condição que verifica se con passou de 10.

con = 0:
    - =: operador de atribuição, reinicia o valor da variável con.

num += 1:
    - +=: operador de adição e atribuição, incrementa o valor de num em 1.

println("-".repeat(100)):
    - println: imprime uma linha separadora no console.
    - "-".repeat(100): repete o caractere '-' 100 vezes.

${...}:
    - Interpolação de string: insere o valor de uma variável ou expressão dentro do texto.
*/

// Escreva um programa em que o usuário informe 10 valores e escreva quantos desses
// valores lidos estão entre os números 24 e 42 (incluindo os valores 24 e 42) e quantos deles estão fora deste intervalo.

// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Solicita ao usuário um número inteiro
    println("Escreva um número")
    var n = readln()!!.toInt()
    // Inicializa o número da tabuada e o contador
    var num = 1
    var con = 0
    // Laço para imprimir a tabuada do número informado
    while (num <= n){
        // Imprime a multiplicação do número atual pela contagem
        println("$num X $con = ${con*num}")
        // Incrementa o contador
        con+=1
        // Se o contador passar de 10, reinicia e passa para o próximo número
        if(con > 10) {
            con = 0
            num += 1
            println()
            println("-".repeat(100)) // Imprime uma linha separadora
            println()
        }
    }
}
