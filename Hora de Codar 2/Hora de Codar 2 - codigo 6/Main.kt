/*
Elementos usados neste arquivo Kotlin:

fun main():
    - fun: palavra-chave que define uma função.
    - main: nome da função principal, ponto de entrada do programa.
    - (): indica que a função não recebe parâmetros.

println(...):
    - println: função que exibe uma mensagem no console e pula para a próxima linha.
    - "texto": texto (String) exibido ao usuário.

var numero1 = readLine()!!.toInt():
    - var: inicia uma variável mutável.
    - numero1: nome da variável.
    - =: operador de atribuição, define o valor inicial da variável.
    - readLine(): lê uma linha digitada pelo usuário no console.
    - !!: operador que garante que o valor não é nulo.
    - toInt(): converte o texto lido para inteiro.

var maior = numero1:
    - var: inicia uma variável mutável.
    - maior: nome da variável que guarda o maior valor informado.
    - =: atribui o valor inicial da variável.
    - numero1: valor inicial, vindo da primeira entrada do usuário.

if (maior < numero2):
    - if: estrutura condicional, executa um bloco se a condição for verdadeira.
    - (maior < numero2): condição booleana.
    - <: operador relacional "menor que".
    - { }: bloco de código executado se a condição for verdadeira.
    - maior = numero2: atualiza o valor da variável maior.

Interpolação de string ($numero1, $numero4, $maior):
    - $variavel: insere o valor da variável dentro do texto exibido.
*/

// Faça um programa que receba quatro valores informados pelo usuário,
// mas informe somente o primeiro, o último e o maior de todos eles
// (considere que todos os números informados serão diferentes)

// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Solicita ao usuário o primeiro número e converte a entrada para inteiro
    println("Escreva o primeiro número")
    var numero1 = readLine()!!.toInt()
    // Inicializa a variável 'maior' com o valor do primeiro número
    var maior = numero1

    // Solicita ao usuário o segundo número e converte a entrada para inteiro
    println("Escreva o segundo número")
    var numero2 = readLine()!!.toInt()
    // Atualiza 'maior' se o segundo número for maior
    if (maior < numero2){
        maior = numero2
    }

    // Solicita ao usuário o terceiro número e converte a entrada para inteiro
    println("Escreva o terceiro número")
    var numero3 = readLine()!!.toInt()
    // Atualiza 'maior' se o terceiro número for maior
    if (maior < numero3){
        maior = numero3
    }

    // Solicita ao usuário o quarto número e converte a entrada para inteiro
    println("Escreva o quarto número")
    var numero4 = readLine()!!.toInt()
    // Atualiza 'maior' se o quarto número for maior
    if (maior < numero4){
        maior = numero4
    }
    // Exibe o primeiro, o último e o maior número informado
    println("O primeiro número é $numero1, o último é $numero4 e o maior é $maior")
}