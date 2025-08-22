/*
Elementos usados neste arquivo Kotlin:

fun main():
    - fun: palavra-chave que define uma função.
    - main: nome da função principal, ponto de entrada do programa.
    - (): indica que a função não recebe parâmetros.

println(...):
    - println: função que exibe uma mensagem no console e pula para a próxima linha.
    - "texto": texto (String) exibido ao usuário.

var r = readln():
    - var: inicia uma variável mutável.
    - r: nome da variável.
    - =: operador de atribuição, define o valor inicial da variável.
    - readln(): lê uma linha digitada pelo usuário no console.

when(r):
    - when: estrutura condicional que executa diferentes blocos de código conforme o valor de r.
    - r: variável analisada.
    - ->: indica a ação a ser executada para cada valor.

fun re(), qu(), lo(), tr(), par(), tri(), cir():
    - fun: define uma função.
    - nome da função: identifica o cálculo de área de cada figura.
    - (): indica que a função não recebe parâmetros.

var b = readln().toInt():
    - var: inicia uma variável mutável.
    - b: nome da variável.
    - =: atribui o valor.
    - readln(): lê uma linha do usuário.
    - toInt(): converte o valor lido para inteiro.

print(...):
    - print: exibe uma mensagem no console (sem pular linha).
    - "texto": texto exibido ao usuário, pode conter interpolação de variáveis (${...}).

${...}:
    - Interpolação de string: insere o valor de uma variável ou expressão dentro do texto.
*/

// Considerando a figura abaixo, escreva um programa
// para cada forma que calcule e exiba em tela
// cada uma de suas respectivas áreas.
// O usuário irá informar os valores de cada variável.

// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Exibe o menu de opções para o usuário escolher qual área deseja calcular
    println("Escreva qual área quer calcular:")
    println("1. Retângulo")
    println("2. Quadrado")
    println("3. Losango")
    println("4. Trapézio")
    println("5. Paralelogramo")
    println("6. Triângulo"); println("7. Círculo")
    // Lê a opção escolhida pelo usuário
    var r = readln()
    // Estrutura condicional para chamar a função correspondente à opção escolhida
    when(r){
        "1" -> re()
        "2"-> qu()
        "3"-> lo()
        "4" -> tr()
        "5"-> par()
        "6"-> tri(); "7" -> cir()
    }
}

// Função para calcular a área do retângulo
fun re(){
    println("Qual é o tamanho da base")
    var b = readln().toInt() // Lê o valor da base
    println("Qual é o tamanho da altura")
    var a = readln().toInt() // Lê o valor da altura
    print("A área do retângulo é ${b*a}") // Exibe o resultado
}
// Função para calcular a área do quadrado
fun qu(){
    println("Qual é o tamanho do lado")
    var l = readln().toInt() // Lê o valor do lado
    print("A área do quadrado é ${l*l}") // Exibe o resultado
}
// Função para calcular a área do losango
fun lo(){
    println("Qual é o tamanho da diagonal maior")
    var dma = readln().toInt() // Lê a diagonal maior
    println("Qual é o tamanho da diagonal menor")
    var dme = readln().toInt() // Lê a diagonal menor
    print("A área do losango é ${(dma*dme)/2}") // Exibe o resultado
}
// Função para calcular a área do trapézio
fun tr(){
    println("Qual é o tamanho da base maior")
    var bma = readln().toInt() // Lê a base maior
    println("Qual é o tamanho da base menor")
    var bme = readln().toInt() // Lê a base menor
    println("Qual é o tamanho da altura")
    var a = readln().toInt() // Lê a altura
    print("A área do trapézio é ${((bma+bme)*a)/2}") // Exibe o resultado
}
// Função para calcular a área do paralelogramo
fun par(){
    println("Qual é o tamanho da base")
    var b = readln().toInt() // Lê o valor da base
    println("Qual é o tamanho da altura")
    var a = readln().toInt() // Lê o valor da altura
    print("A área do paralelograma é ${b*a}") // Exibe o resultado
}
// Função para calcular a área do triângulo
fun tri(){
    println("Qual é o tamanho da base")
    var b = readln().toInt() // Lê o valor da base
    println("Qual é o tamanho da altura")
    var a = readln().toInt() // Lê o valor da altura
    print("A área do triângulo é ${(b*a)/2}") // Exibe o resultado
}
// Função para calcular a área do círculo
fun cir(){
    println("Qual é o tamanho do raio")
    var r = readln().toInt() // Lê o valor do raio
    print("A área do círculo é ${3.14159*(r*r)}") // Exibe o resultado
}