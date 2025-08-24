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

var soma1 = numero1 + numero2:
    - var: inicia uma variável mutável.
    - soma1: nome da variável.
    - =: atribui o valor.
    - numero1 + numero2: soma os valores das variáveis.
    - +: operador de soma.

if (soma1 > soma2 && soma1 > soma3):
    - if: estrutura condicional, executa um bloco se a condição for verdadeira.
    - (soma1 > soma2 && soma1 > soma3): condição booleana.
    - >: operador relacional "maior que".
    - &&: operador lógico 'E', usado para combinar condições.
    - { }: bloco de código executado se a condição for verdadeira.

else if (...):
    - else if: executa um bloco se a condição do if for falsa e testa nova condição.

else:
    - else: executa um bloco se todas as condições anteriores forem falsas.

println("A soma dos dois maiores números é $soma1"):
    - $soma1: interpolação de string, insere o valor da variável no texto.
*/

// Faça um programa que leia 3 valores informados pelo
// usuário (considere que não serão informados valores iguais)
// e escrever a soma dos 2 maiores.

// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Solicita ao usuário o primeiro número e converte a entrada para inteiro
    println("Escreva o primeiro número:")
    var numero1 = readLine()!!.toInt()
    // Solicita ao usuário o segundo número e converte a entrada para inteiro
    println("Escreva o segundo número:")
    var numero2 = readLine()!!.toInt()
    // Solicita ao usuário o terceiro número e converte a entrada para inteiro
    println("Escreva o terceiro número:")
    var numero3 = readLine()!!.toInt()
    // Calcula as somas possíveis entre os números
    var soma1 = numero1 + numero2 // Soma do primeiro e segundo número
    var soma2 = numero2 + numero3 // Soma do segundo e terceiro número
    var soma3 = numero1 + numero3 // Soma do primeiro e terceiro número
    // Estrutura condicional para identificar qual soma é a maior
    if (soma1 > soma2 && soma1 > soma3) {
        println("A soma dos dois maiores números é $soma1")
    }
    else if (soma2 > soma1 && soma2 > soma3){
        println("A soma dos dois maiores números é $soma2")
    }
    else{
        println("A soma dos dois maiores números é $soma3")
    }
}