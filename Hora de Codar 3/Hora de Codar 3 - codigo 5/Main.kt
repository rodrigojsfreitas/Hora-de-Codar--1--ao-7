/*
Elementos usados neste arquivo Kotlin:

fun main():
    - fun: palavra-chave que define uma função.
    - main: nome da função principal, ponto de entrada do programa.
    - (): indica que a função não recebe parâmetros.

println(...):
    - println: função que exibe uma mensagem no console e pula para a próxima linha.
    - "texto": texto (String) exibido ao usuário.

var soma = 0, var con = 0, var numero1 = readln()!!.toInt(), var numero2 = readln().toInt():
    - var: declara uma variável mutável.
    - soma, con, numero1, numero2: nomes das variáveis.
    - =: operador de atribuição, define o valor inicial da variável.
    - readln(): lê uma linha digitada pelo usuário no console.
    - !!: operador que garante que o valor não é nulo.
    - toInt(): converte o texto lido para inteiro.

while (numero1 < numero2), while (numero1 >= numero2):
    - while: estrutura de repetição que executa o bloco enquanto a condição for verdadeira.
    - (numero1 < numero2), (numero1 >= numero2): condições que mantêm o laço ativo conforme o valor das variáveis.

soma += numero1:
    - +=: operador de adição e atribuição, soma o valor de numero1 à variável soma.

con += 1:
    - +=: operador de adição e atribuição, incrementa o valor de con em 1.

numero1 -= 1:
    - -=: operador de subtração e atribuição, diminui 1 do valor atual de numero1.

println("A média dos números é ${soma/con}"):
    - println: exibe mensagem no console.
    - "A média dos números é ${soma/con}": texto exibido ao usuário, com interpolação de string.

${...}:
    - Interpolação de string: insere o valor de uma variável ou expressão dentro do texto.
*/

//  Faça um algoritmo que calcule e escreva a média aritmética dos dois números
//  inteiros informados pelo usuário e todos os números inteiros entre eles.
//  Considere que o primeiro sempre será menor que o segundo.

// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Solicita ao usuário o primeiro número e inicializa soma e contador
    println("Escreva o primeiro número")
    var soma = 0
    var con = 0
    var numero1 = readln()!!.toInt()
    // Solicita ao usuário o segundo número
    println("Escreva o segundo número")
    var numero2 = readln().toInt()
    // Enquanto o segundo número for menor ou igual ao primeiro, solicita novamente
    while (numero1 < numero2){
        println("Escreva o segundo número maior do que o primeiro")
        numero2 = readln()!!.toInt()
    }
    // Enquanto o primeiro número for maior ou igual ao segundo, soma e conta
    while (numero1 >= numero2){
        soma += numero1
        con += 1
        numero1 -= 1
    }
    // Exibe a média dos números somados
    println("A média dos números é ${soma/con}")
}