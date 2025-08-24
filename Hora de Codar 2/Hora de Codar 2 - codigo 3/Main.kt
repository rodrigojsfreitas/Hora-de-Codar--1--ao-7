/*
Elementos usados neste arquivo Kotlin:

- fun: define uma função. Exemplo: fun main() {...}
- main: nome da função principal, ponto de entrada do programa.
- println: imprime texto no console para o usuário.
- var: declara uma variável mutável. Exemplo: var numero3 = ...
- numero3, numero4, numero5: nomes das variáveis usadas para armazenar números informados pelo usuário.
- =: operador de atribuição, define o valor da variável.
- readLine(): lê uma linha do console (entrada do usuário).
- !!: operador que garante que o valor não é nulo.
- toInt(): converte o texto lido para inteiro.
- if: estrutura condicional, executa um bloco se a condição for verdadeira.
- else if: executa um bloco se a condição do if for falsa e testa nova condição.
- else: executa um bloco se todas as condições anteriores forem falsas.
- >: operador relacional "maior que".
- &&: operador lógico 'E', usado para combinar condições.
- $variavel: interpolação de string, insere o valor da variável no texto.
*/

// Faça um programa para ler 3 valores (considere que não serão
// informados valores iguais) e escrever o maior deles

// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Solicita ao usuário o primeiro número e converte a entrada para inteiro
    println("escolha o primeiro número: ")
    var numero3 = readLine()!!.toInt()
    // Solicita ao usuário o segundo número e converte a entrada para inteiro
    println("escolha o segundo número: ")
    var numero4 = readLine()!!.toInt()
    // Solicita ao usuário o terceiro número e converte a entrada para inteiro
    println("Escolha o terceiro número: ")
    var numero5 = readLine()!!.toInt()
    // Estrutura condicional para verificar qual dos três números é o maior
    if (numero3 > numero4 && numero3 > numero5) {
        println("O número $numero3 é maior do que os outros")
    } else if (numero4 > numero3 && numero4 > numero5) {
        println("O número $numero4 é maior do que os outros")
    } else if (numero5 > numero4 && numero5 > numero3) {
        println("O número $numero5 é maior do que os outros")
    }
}