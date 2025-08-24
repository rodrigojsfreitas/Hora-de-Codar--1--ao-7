/*
Elementos usados neste arquivo Kotlin:

fun main():
    - fun: palavra-chave que define uma função.
    - main: nome da função principal, ponto de entrada do programa.
    - (): indica que a função não recebe parâmetros.

println(...):
    - println: função que exibe uma mensagem no console e pula para a próxima linha.
    - "texto": texto (String) exibido ao usuário.

var valor1 = readln()!!.toInt():
    - var: inicia uma variável mutável.
    - valor1: nome da variável.
    - =: operador de atribuição, define o valor inicial da variável.
    - readln(): lê uma linha digitada pelo usuário no console.
    - !!: operador que garante que o valor não é nulo.
    - toInt(): converte o valor lido para inteiro.

var operador = readln():
    - var: inicia uma variável mutável.
    - operador: nome da variável.
    - =: operador de atribuição.
    - readln(): lê uma linha digitada pelo usuário no console.

if (...), else if (...), else:
    - if: estrutura condicional, executa um bloco se a condição for verdadeira.
    - else if: executa um bloco se a condição do if for falsa e testa nova condição.
    - else: executa um bloco se todas as condições anteriores forem falsas.
    - operador == "+", operador == "1", etc.: compara o valor da variável operador.
    - ||: operador lógico OU, permite múltiplas condições.
    - { }: bloco de código executado se a condição for verdadeira.

println("A soma dos valores é ${valor1 + valor2}"):
    - ${...}: interpolação de string, insere o valor de uma expressão ou variável dentro do texto.
    - valor1 + valor2: soma os valores das variáveis.
    - -: operador de subtração.
    - /: operador de divisão.
    - *: operador de multiplicação.
*/

// Uma micro calculadora Escreva um programa para ler 2 valores inteiros informados pelo usuário
// e uma das seguintes operações a serem executadas (codificada da seguinte forma: 1.
// Adição, 2. Subtração, 3. Divisão, 4. Multiplicação).
// O programa deve calcular e escrever o resultado dessa operação sobre os dois valores lidos.

// Observação: Considere que só serão lidos os valores 1, 2, 3 ou 4 para as operações

// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Solicita ao usuário o primeiro valor e converte a entrada para inteiro
    println("Digite o primeiro valor")
    var valor1 = readln()!!.toInt()
    // Solicita ao usuário o segundo valor e converte a entrada para inteiro
    println("Digite o segundo valor")
    var valor2 = readln()!!.toInt()
    // Solicita ao usuário que escolha o operador
    println("Escolha o operador: +: 1  -: 2 /: 3 *: 4")
    var operador = readln()

    // Estrutura condicional para realizar a operação escolhida
    if (operador == "+" || operador  == "1"){
        // Soma os valores
        println("A soma dos valores é ${valor1 + valor2}")
    }else if (operador == "-" || operador  == "2"){
        // Subtrai os valores
        println("A subtração dos valores é ${valor1 - valor2}")
    }else if (operador == "/" || operador  == "3"){
        // Divide os valores
        println("A divisão dos valores é ${valor1 / valor2}")
    }else if (operador == "*" || operador  == "4"){
        // Multiplica os valores
        println("A multiplicação dos valores é ${valor1 * valor2}")
    }else{
        // Caso o operador seja inválido
        println("Operador Inválido")
    }
}