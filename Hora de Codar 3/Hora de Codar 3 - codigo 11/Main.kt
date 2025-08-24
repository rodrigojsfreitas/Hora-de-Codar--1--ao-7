/*
Elementos usados neste arquivo Kotlin:

fun main():
    - fun: palavra-chave que define uma função.
    - main: nome da função principal, ponto de entrada do programa.
    - (): indica que a função não recebe parâmetros.

var n = 0, var con = 0:
    - var: declara uma variável mutável.
    - n, con: nomes das variáveis.
    - =: operador de atribuição, define o valor inicial da variável.
    - 0: valor inicial atribuído às variáveis.

for (x in 1..10):
    - for: estrutura de repetição que executa o bloco para cada valor do intervalo.
    - x: variável de controle do laço, recebe valores de 1 a 10.
    - in 1..10: intervalo de valores para x.

println(...):
    - println: função que exibe uma mensagem no console e pula para a próxima linha.
    - "texto": texto (String) exibido ao usuário.
    - "$x": interpolação de string, insere o valor da variável x no texto.

n = readln()!!.toInt():
    - n: nome da variável que recebe o valor digitado.
    - =: operador de atribuição, define o valor da variável.
    - readln(): lê uma linha digitada pelo usuário no console.
    - !!: operador que garante que o valor não é nulo.
    - toInt(): converte o texto lido para inteiro.

if (n <= 42 && n >= 24):
    - if: estrutura condicional, executa o bloco se a condição for verdadeira.
    - (n <= 42 && n >= 24): condição que verifica se n está entre 24 e 42 (inclusive).
    - &&: operador lógico 'E', usado para combinar condições.

con += 1:
    - +=: operador de adição e atribuição, incrementa o valor de con em 1.

println("Você escreveu $con números entre 24 e 42"):
    - println: exibe mensagem no console.
    - "$con": interpolação de string, insere o valor da variável con no texto.

${...}:
    - Interpolação de string: insere o valor de uma variável ou expressão dentro do texto.
*/

// Escreva um programa para imprimir todas as tabuadas de 1 a N. N será informado pelo usuário.

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