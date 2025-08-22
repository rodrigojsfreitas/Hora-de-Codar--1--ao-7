/*
Elementos usados neste arquivo Kotlin:

fun main():
    - fun: palavra-chave que define uma função.
    - main: nome da função principal, ponto de entrada do programa.
    - (): indica que a função não recebe parâmetros.

println("Escreva seu nome"):
    - println: função que exibe uma mensagem no console e pula para a próxima linha.
    - "Escreva seu nome": texto (String) que será exibido ao usuário.

val n = readln():
    - val: declara uma variável imutável (não pode ser alterada depois).
    - n: nome da variável.
    - =: operador de atribuição, define o valor inicial da variável.
    - readln(): função que lê uma linha digitada pelo usuário no console.

print("Olá, $n"):
    - print: função que exibe uma mensagem no console (sem pular linha).
    - "Olá, $n": texto (String) que será exibido ao usuário, usando interpolação de string para mostrar o valor da variável n.
    - $n: interpolação de string, insere o valor da variável n dentro do texto.
*/

// Escreva um programa em que o usuário informe o seu nome
// e exiba a mensagem "Olá, [NomeDoUsuario]".

// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Exibe uma mensagem solicitando ao usuário que escreva seu nome
    println("Escreva seu nome")
    // Lê a entrada do usuário e armazena na variável 'n'
    val n = readln()
    // Exibe uma saudação personalizada usando o nome informado
    print("Olá, $n")
}