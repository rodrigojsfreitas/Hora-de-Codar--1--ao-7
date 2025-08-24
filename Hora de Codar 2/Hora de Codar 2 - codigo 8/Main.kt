/*
Elementos usados neste arquivo Kotlin:

fun main():
    - fun: palavra-chave que define uma função.
    - main: nome da função principal, ponto de entrada do programa.
    - (): indica que a função não recebe parâmetros.

println(...):
    - println: função que exibe uma mensagem no console e pula para a próxima linha.
    - "texto": texto (String) exibido ao usuário.

var numeroX = readLine()!!.toInt():
    - var: inicia uma variável mutável.
    - numeroX: nome da variável (numero1, numero2, ...).
    - =: operador de atribuição, define o valor inicial da variável.
    - readLine(): lê uma linha digitada pelo usuário no console.
    - !!: operador que garante que o valor não é nulo.
    - toInt(): converte o texto lido para inteiro.

var notaX = numeroX > 0 && numeroX < 10:
    - var: inicia uma variável mutável.
    - notaX: nome da variável booleana.
    - numeroX > 0: verifica se o número é maior que zero.
    - &&: operador lógico 'E', usado para combinar condições.
    - numeroX < 10: verifica se o número é menor que dez.

var media = (numero1 + numero2 + numero3 + numero4)/4:
    - var: inicia uma variável mutável.
    - media: nome da variável.
    - =: atribui o valor.
    - (numero1 + numero2 + numero3 + numero4): soma os valores das variáveis.
    - /4: divide a soma por quatro.
    - /: operador de divisão.

if (...):
    - if: estrutura condicional, executa um bloco se a condição for verdadeira.
    - (...): condição booleana.
    - { }: bloco de código executado se a condição for verdadeira.

else:
    - else: executa um bloco se todas as condições anteriores forem falsas.

println("Parabéns!!!! Você passou"):
    - $variavel: interpolação de string, insere o valor da variável no texto (não usado neste exemplo, mas pode ser usado em outros casos).
*/

// Escreva um programa que calcule a média de quatro números informados pelo usuário,
// mas somente se esses números forem maiores que 0 e menores que 10. No final, se a média for
// maior que cinco o usuário receberá uma mensagem "Você passou no teste".
// Em qualquer outra situação, ele receberá uma mensagem de "tente novamente"

// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Solicita ao usuário o primeiro número e converte a entrada para inteiro
    println("Escreva o primeiro número")
    var numero1 = readLine()!!.toInt()

    // Solicita ao usuário o segundo número e converte a entrada para inteiro
    println("Escreva o segundo número")
    var numero2 = readLine()!!.toInt()

    // Solicita ao usuário o terceiro número e converte a entrada para inteiro
    println("Escreva o terceiro número")
    var numero3 = readLine()!!.toInt()

    // Solicita ao usuário o quarto número e converte a entrada para inteiro
    println("Escreva o quarto número")
    var numero4 = readLine()!!.toInt()

    // Verifica se cada nota está entre 0 e 10
    var nota1 = numero1 > 0 && numero1 < 10
    var nota2 = numero2 > 0 && numero2 < 10
    var nota3 = numero3 > 0 && numero3 < 10
    var nota4 = numero4 > 0 && numero4 < 10
    // Calcula a média dos quatro números
    var media = (numero1 + numero2 + numero3 + numero4)/4

    // Se todas as notas forem válidas, verifica se a média é maior que 5
    if (nota1 && nota2 && nota3 && nota4) {
        if (media > 5){
            println("Parabéns!!!! Você passou")
        }else{
            println("Tente Novamente")
        }
    }else{
        println("Números inválidos")
    }

}