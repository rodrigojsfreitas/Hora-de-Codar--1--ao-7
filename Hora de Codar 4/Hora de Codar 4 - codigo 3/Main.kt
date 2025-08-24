/*
Elementos usados neste arquivo Kotlin:

fun main():
    - fun: palavra-chave que define uma função.
    - main: nome da função principal, ponto de entrada do programa.
    - (): indica que a função não recebe parâmetros.

val barraca = mutableListOf(...):
    - val: declara uma variável imutável.
    - barraca: nome da variável que armazena a lista de frutas.
    - mutableListOf(...): cria uma lista mutável com os elementos informados.

var r1: String:
    - var: declara uma variável mutável.
    - r1: nome da variável que armazena a resposta do usuário.
    - String: tipo da variável, armazena texto.

while(barraca.size > 0):
    - while: estrutura de repetição que executa o bloco enquanto a condição for verdadeira.
    - barraca.size > 0: condição que verifica se ainda há frutas na barraca.

for (x in barraca):
    - for: estrutura de repetição que percorre todos os elementos da lista barraca.
    - x: variável que recebe cada fruta da lista.
    - in barraca: percorre todos os elementos da lista barraca.

print(...):
    - print: exibe uma mensagem no console (sem pular linha).
    - "texto": texto exibido ao usuário.

println(...):
    - println: função que exibe uma mensagem no console e pula para a próxima linha.
    - "texto": texto (String) exibido ao usuário.

readln():
    - readln(): lê uma linha digitada pelo usuário no console.

if (barraca.indexOf(r1) >= 0):
    - if: estrutura condicional, executa o bloco se a condição for verdadeira.
    - barraca.indexOf(r1): retorna o índice do elemento na lista ou -1 se não encontrar.
    - >= 0: verifica se a fruta está na barraca.

barraca.removeAt(barraca.indexOf(r1)):
    - barraca.removeAt(...): remove o elemento da lista no índice informado.

else:
    - else: executa o bloco se a condição do if for falsa.

${...}:
    - Interpolação de string: insere o valor de uma variável ou expressão dentro do texto.
*/

// Vamos criar uma lista de compras.
//
//Crie uma array de frutas, exiba-a ao usuário e, em seguida, peça ao usuário
// para digitar o nome de uma das frutas.
//
//Caso a fruta esteja no array, remova-a e exiba a mensagem "Fruta foi retirada da lista".
//
//Peça novamente para o usuário digitar o nome de uma fruta para ser removida.
//
//Sempre que o usuário procurar por uma fruta que não está no array
// exiba a mensagem "Fruta indisponível no nosso mercado".
//
//Quando o array não possuir mais itens dentro de si, escreva "Lista de compras finalizada".

// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Cria uma lista mutável com frutas disponíveis na barraca
    val barraca = mutableListOf("Maçã", "Melancia", "Pera", "Abacate")
    var r1: String // Variável para armazenar a resposta do usuário
    // Enquanto houver frutas na barraca
    while(barraca.size > 0){
        // Exibe todas as frutas disponíveis
        for (x in barraca){
            print(" $x ")
        }
        println("\n Escreva uma fruta") // Solicita uma fruta ao usuário

        r1 = readln() // Lê a fruta digitada
        // Verifica se a fruta está na barraca
        if (barraca.indexOf(r1) >= 0){
            println("Você quer excluir um item? Escreva a fruta novamente para confirmar")
            r1 = readln() // Solicita confirmação
            // Se a fruta estiver na barraca, remove
            if (barraca.indexOf(r1) >= 0){
                barraca.removeAt(barraca.indexOf(r1))
            }

            }else{
                // Caso a fruta não esteja disponível, exibe mensagem
                print("Item indisponível\n")
        }
    }
    // Quando todas as frutas forem removidas, exibe mensagem de finalização
    println("Lista de compras finalizada")
}