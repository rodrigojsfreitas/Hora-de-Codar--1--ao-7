/*
Elementos usados neste arquivo Kotlin:

- fun: inicia a declaração de uma função.
- main: nome da função principal, ponto de entrada do programa.
- (): parênteses que delimitam os parâmetros da função (vazio neste caso).
- { }: delimitam o bloco de código da função.
- println: função que imprime texto no console.
- "texto": string literal, texto exibido ao usuário.
- var: declara uma variável mutável.
- numero1: nome da variável.
- =: operador de atribuição, define o valor da variável.
- readLine(): lê uma linha digitada pelo usuário (retorna String?).
- !!: operador que garante que o valor não é nulo.
- toInt(): converte a String para inteiro.
- if: estrutura condicional, executa um bloco se a condição for verdadeira.
- else if: verifica nova condição se a anterior for falsa.
- else: executa um bloco se nenhuma condição anterior for verdadeira.
- >: operador relacional "maior que".
- <: operador relacional "menor que".
- 0: valor inteiro usado na comparação.
*/

// Faça um programa para ler 3 valores
// (considere que não serão informados valores iguais)
// e escrever o maior deles

// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Solicita ao usuário que digite um número
    println("Escreva um número")
    // Lê a entrada do usuário, converte para inteiro e armazena em numero1
    var numero1 = readLine()!!.toInt()
    // Estrutura condicional para verificar se o número é positivo, negativo ou zero
    if (numero1 > 0){
        println("O seu número é positivo")
    }else if (numero1 < 0){
        println("O seu número é negativo")
    }else{
        println("O seu número é zero")
    }
}