/*
Elementos usados neste arquivo Kotlin:

fun main():
    - fun: palavra-chave que define uma função.
    - main: nome da função principal, ponto de entrada do programa.
    - (): indica que a função não recebe parâmetros.

var aluno = "":
    - var: declara uma variável mutável.
    - aluno: nome da variável que armazena o nome do aluno.
    - =: operador de atribuição, define o valor inicial da variável.
    - "": valor inicial, string vazia.

var lista = mutableListOf<String>():
    - var: declara uma variável mutável.
    - lista: nome da variável que armazena a lista de alunos.
    - mutableListOf<String>(): cria uma lista mutável de strings.

while (aluno != "PARE"):
    - while: estrutura de repetição que executa o bloco enquanto a condição for verdadeira.
    - (aluno != "PARE"): condição que mantém o laço ativo enquanto aluno for diferente de "PARE".

print(...):
    - print: exibe uma mensagem no console (sem pular linha).
    - "texto": texto exibido ao usuário.

readln():
    - readln(): lê uma linha digitada pelo usuário no console.

if (aluno == "PARE"):
    - if: estrutura condicional, executa o bloco se a condição for verdadeira.
    - (aluno == "PARE"): condição que verifica se o usuário digitou "PARE".

break:
    - break: comando que encerra o laço imediatamente.

lista.add(aluno):
    - lista.add(aluno): adiciona o nome do aluno à lista.

println("A lista tem ${lista.size} Estudantes"):
    - println: exibe mensagem no console.
    - "A lista tem ${lista.size} Estudantes": texto exibido ao usuário, com interpolação de string.
    - ${lista.size}: expressão que retorna o tamanho da lista.

var con = 0:
    - var: declara uma variável mutável.
    - con: nome da variável que armazena o contador.
    - =: operador de atribuição, define o valor inicial da variável.
    - 0: valor inicial atribuído à variável.

for (x in lista):
    - for: estrutura de repetição que percorre todos os elementos da lista.
    - x: variável que recebe cada elemento da lista.
    - in lista: percorre todos os elementos da lista.

con++:
    - ++: operador de incremento, aumenta o valor de con em 1.

println("$con. $x"):
    - println: exibe mensagem no console.
    - "$con. $x": texto exibido ao usuário, com interpolação de string.
    - $con: insere o valor do contador.
    - $x: insere o nome do aluno.

${...}:
    - Interpolação de string: insere o valor de uma variável ou expressão dentro do texto.
*/

// Crie um programa onde o usuário possa cadastrar estudantes sem limites, e, em seguida,
// Se o usuário digitar "PARE" o programa deve exibir a quantidade de estudantes cadastrados
// e a lista com cada um deles.

// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Declara uma variável para armazenar o nome do aluno
    var aluno = ""
    // Cria uma lista mutável para armazenar os nomes dos alunos
    var lista = mutableListOf<String>()
    // Enquanto o usuário não digitar "PARE", continua solicitando nomes
    while (aluno != "PARE") {
        print("Escreva o nome do aluno: ") // Solicita o nome do aluno
        aluno = readln() // Lê o nome digitado
        if (aluno == "PARE"){
            break // Encerra o laço se o usuário digitar "PARE"
        }
        lista.add(aluno) // Adiciona o nome à lista
    }
    // Exibe a quantidade de estudantes cadastrados
    println("A lista tem ${lista.size} Estudantes")
    var con = 0 // Inicializa um contador para exibir a lista numerada
    for (x in lista){
        con++ // Incrementa o contador
        println("$con. $x") // Exibe o número e o nome do aluno
    }
}
