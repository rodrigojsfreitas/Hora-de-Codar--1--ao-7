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

var soma = numero1 + numero2 + numero3 + numero4 + numero5 + numero6:
    - var: inicia uma variável mutável.
    - soma: nome da variável.
    - =: atribui o valor.
    - numero1 + numero2 + ...: soma os valores das variáveis.
    - +: operador de soma.

var media = soma/6:
    - var: inicia uma variável mutável.
    - media: nome da variável.
    - =: atribui o valor.
    - soma/6: divide o valor da soma por 6.
    - /: operador de divisão.

println("A média é $media"):
    - $media: interpolação de string, insere o valor da variável no texto.
*/

//  Faça um programa que leia 6 valores informados
//  pelo usuário, calcule, exiba os números informados
//  e escreva a média aritmética desses valores lidos.

// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Solicita ao usuário o primeiro número e converte a entrada para inteiro
    println("Escreva o primeiro número: ")
    var numero1 = readLine()!!.toInt()
    // Solicita ao usuário o segundo número e converte a entrada para inteiro
    println("Escreva o segundo número: ")
    var numero2 = readLine()!!.toInt()
    // Solicita ao usuário o terceiro número e converte a entrada para inteiro
    println("Escreva o terceiro número: ")
    var numero3 = readLine()!!.toInt()
    // Solicita ao usuário o quarto número e converte a entrada para inteiro
    println("Escreva o quarto número: ")
    var numero4 = readLine()!!.toInt()
    // Solicita ao usuário o quinto número e converte a entrada para inteiro
    println("Escreva o quinto número: ")
    var numero5 = readLine()!!.toInt()
    // Solicita ao usuário o sexto número e converte a entrada para inteiro
    println("Escreva o sexto número: ")
    var numero6 = readLine()!!.toInt()
    // Calcula a soma dos seis números
    var soma = numero1 + numero2 + numero3 + numero4 + numero5 + numero6
    // Calcula a média dos seis números
    var media = soma/6
    // Exibe o resultado da média
    println("A média é $media")
}