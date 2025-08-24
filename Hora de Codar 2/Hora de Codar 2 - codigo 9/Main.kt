/*
Elementos usados neste arquivo Kotlin:

fun main():
    - fun: palavra-chave que define uma função.
    - main: nome da função principal, ponto de entrada do programa.
    - (): indica que a função não recebe parâmetros.

println(...):
    - println: função que exibe uma mensagem no console e pula para a próxima linha.
    - "texto": texto (String) exibido ao usuário.

var birthdat = readln()!!.toInt():
    - var: inicia uma variável mutável.
    - birthdat: nome da variável.
    - =: operador de atribuição, define o valor inicial da variável.
    - readln(): lê uma linha digitada pelo usuário no console.
    - !!: operador que garante que o valor não é nulo.
    - toInt(): converte o valor lido para inteiro.

if (18 <= (2025 - birthdat)):
    - if: estrutura condicional, executa um bloco se a condição for verdadeira.
    - 18 <= (2025 - birthdat): condição booleana.
    - <=: operador relacional "menor ou igual".
    - (2025 - birthdat): expressão aritmética que calcula a idade.
    - { }: bloco de código executado se a condição for verdadeira.

else:
    - else: executa um bloco se todas as condições anteriores forem falsas.

println("Você é maior de idade") / println("Você é menor de idade"):
    - "texto": mensagem exibida ao usuário.

Interpolação de string (${...}):
    - ${...}: insere o valor de uma variável ou expressão dentro do texto (não usado neste exemplo, mas pode ser usado em outros casos).
*/

// Escreva um programa para ler o ano de nascimento de uma pessoa
// e escrever uma mensagem que diga se ela poderá ou não votar este ano
// (não é necessário considerar o mês em que ela nasceu).

// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Solicita ao usuário o ano de nascimento
    println("Qual é seu ano de nascimento?")
    var birthdat = readln()!!.toInt() // Lê e converte a entrada para inteiro
    // Calcula a idade e verifica se é maior ou menor de idade
    if (18 <= (2025 - birthdat)){
        println("Você é maior de idade")
    }else {
        println("Você é menor de idade")
    }
}