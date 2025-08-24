/*
Elementos usados neste arquivo Kotlin:

fun main():
    - fun: palavra-chave que define uma função.
    - main: nome da função principal, ponto de entrada do programa.
    - (): indica que a função não recebe parâmetros.

val planetas = listOf(...):
    - val: declara uma variável imutável.
    - planetas: nome da variável que armazena a lista de planetas.
    - listOf(...): cria uma lista imutável com os elementos informados.

println(...):
    - println: função que exibe uma mensagem no console e pula para a próxima linha.
    - "texto": texto (String) exibido ao usuário.

var pergunta = readln():
    - var: declara uma variável mutável.
    - pergunta: nome da variável que armazena o texto digitado pelo usuário.
    - =: operador de atribuição, define o valor inicial da variável.
    - readln(): lê uma linha digitada pelo usuário no console.

if (planetas.indexOf(pergunta) > -1):
    - if: estrutura condicional, executa o bloco se a condição for verdadeira.
    - planetas.indexOf(pergunta): retorna o índice do elemento na lista ou -1 se não encontrar.
    - > -1: verifica se o planeta está na lista.

print(...):
    - print: exibe uma mensagem no console (sem pular linha).
    - "O planeta ${pergunta} é o ${planetas.indexOf(pergunta)+1}º do sistema solar": texto exibido ao usuário, com interpolação de string.
    - ${...}: interpolação de string, insere o valor de uma variável ou expressão dentro do texto.

else:
    - else: executa o bloco se a condição do if for falsa.
*/

// Crie uma array de planetas que inclua "Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno" e, em seguida,
// peça ao usuário para digitar o nome de um planeta.

// Verifique se o planeta que o usuário informou está na array e informe ao usuário.



// Plutão não é planeta!!!!!!!!!!!
// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Cria uma lista com os nomes dos planetas do sistema solar
    val planetas = listOf("Mercúrio", "Vênus", "Terra","Marte", "Júpiter", "Saturno", "Urano", "Netuno")
    // Solicita ao usuário que escreva o nome de um planeta
    println("Escreva um planeta: ")
    var pergunta = readln() // Lê o nome digitado
    // Verifica se o planeta está na lista
    if (planetas.indexOf(pergunta) > -1){
        // Exibe a posição do planeta no sistema solar
        print("O planeta ${pergunta} é o ${planetas.indexOf(pergunta)+1}º do sistema solar")
    }else{
        // Caso o planeta não esteja na lista, exibe mensagem de erro
        println("O que você escreve")
    }

}