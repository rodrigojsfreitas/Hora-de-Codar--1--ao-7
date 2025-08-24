/*
Elementos usados neste arquivo Kotlin:

fun main():
    - fun: palavra-chave que define uma função.
    - main: nome da função principal, ponto de entrada do programa.
    - (): indica que a função não recebe parâmetros.

println(...):
    - println: função que exibe uma mensagem no console e pula para a próxima linha.
    - "texto": texto (String) exibido ao usuário.

var nota1, nota2, nota3, nota4, nota5, nota6: Float:
    - var: declara uma variável mutável.
    - nota1, nota2, nota3, nota4, nota5, nota6: nomes das variáveis para armazenar as notas.
    - =: operador de atribuição, define o valor inicial da variável.
    - readln(): lê uma linha digitada pelo usuário no console.
    - toFloat(): converte o texto lido para float.

while(0 > notaX || notaX > 10):
    - while: estrutura de repetição que executa o bloco enquanto a condição for verdadeira.
    - (0 > notaX || notaX > 10): condição que valida se a nota está entre 0 e 10.
    - ||: operador lógico OU, retorna verdadeiro se pelo menos uma condição for verdadeira.

soma = nota1 + nota2 + nota3 + nota4 + nota5 + nota6:
    - soma: variável que armazena a soma das notas.
    - +: operador de adição, soma os valores das variáveis.
*/

// Escreva um algoritmo para ler as notas de avaliações de um aluno, calcule e imprima
// a média (simples) desse aluno. Só devem ser aceitos valores válidos durante a leitura
// (0 a 10) para cada nota. São 6 notas ao total. Caso o valor informado para qualquer
// uma das notas esteja fora do limite estabelecido, deve ser solicitado um novo valor ao usuário.

// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Solicita a primeira nota e converte para float
    println("Escreva a primeira nota")
    var nota1 = readln().toFloat()
    // Valida se a nota está entre 0 e 10
    while(0 > nota1 || nota1 > 10){
        println("Escreva de novo a nota")
        nota1 = readln().toFloat()
    }
    // Solicita a segunda nota e valida
    println("Escreva a segunda nota")
    var nota2 = readln().toFloat()
    while(0 > nota2 || nota2 > 10){
        println("Escreva de novo a nota")
        nota2 = readln().toFloat()
    }
    // Solicita a terceira nota e valida
    println("Escreva a terceira nota")
    var nota3 = readln().toFloat()
    while(0 > nota3 || nota3 > 10){
        println("Escreva de novo a nota")
        nota3 = readln().toFloat()
    }
    // Solicita a quarta nota e valida
    println("Escreva a quarta nota")
    var nota4 = readln().toFloat()
    while(0 > nota4 || nota4 > 10){
        println("Escreva de novo a nota")
        nota4 = readln().toFloat()
    }
    // Solicita a quinta nota e valida
    println("Escreva a quinta nota")
    var nota5 = readln().toFloat()
    while(0 > nota5 || nota5 > 10){
        println("Escreva de novo a nota")
        nota5 = readln().toFloat()
    }
    // Solicita a sexta nota e valida
    println("Escreva a sexta nota")
    var nota6 = readln().toFloat()
    while(0 > nota6 || nota6 > 10){
        println("Escreva de novo a nota")
        nota6 = readln().toFloat()
    }
    // Calcula a soma e a média das notas
    var soma = nota1 + nota2 + nota3 + nota4 + nota5 + nota6
    var media = soma/6
    // Exibe a média das notas
    print("A média das notas é $media")
}