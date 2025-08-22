/*
Elementos usados neste arquivo Kotlin:

fun main():
    - fun: palavra-chave que define uma função.
    - main: nome da função principal, ponto de entrada do programa.
    - (): indica que a função não recebe parâmetros.

println("Escreva o seu nome: "):
    - println: função que exibe uma mensagem no console e pula para a próxima linha.
    - "Escreva o seu nome: ": texto (String) exibido ao usuário.

val n = readln():
    - val: declara uma variável imutável (não pode ser alterada depois).
    - n: nome da variável.
    - =: operador de atribuição, define o valor inicial da variável.
    - readln(): função que lê uma linha digitada pelo usuário no console.

println("Escreva a sua idade: "):
    - println: função que exibe uma mensagem no console e pula para a próxima linha.
    - "Escreva a sua idade: ": texto (String) exibido ao usuário.

val i = readln():
    - val: declara uma variável imutável.
    - i: nome da variável.
    - =: operador de atribuição.
    - readln(): lê uma linha digitada pelo usuário.

println("Olá, $n, sua idade é $i"):
    - println: função que exibe uma mensagem no console.
    - "Olá, $n, sua idade é $i": texto exibido ao usuário, usando interpolação de string para mostrar os valores das variáveis n e i.
    - $n, $i: interpolação de string, insere o valor das variáveis dentro do texto.
*/

// Escreva um programa em que o usuário informe o seu nome
// e em seguida o programa perguntará a idade do usuário.
// Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario],
// sua idade é [idade]".

// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Solicita ao usuário que escreva seu nome
    println("Escreva o seu nome: ")
    // Lê o nome digitado pelo usuário e armazena na variável 'n'
    val n = readln()
    // Solicita ao usuário que escreva sua idade
    println("Escreva a sua idade: ")
    // Lê a idade digitada pelo usuário e armazena na variável 'i'
    val i = readln()
    // Exibe uma mensagem personalizada com o nome e idade informados
    println("Olá, $n, sua idade é $i")
}