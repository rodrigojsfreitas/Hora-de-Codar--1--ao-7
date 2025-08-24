/*
Elementos usados neste arquivo Kotlin:

fun main():
    - fun: palavra-chave que define uma função.
    - main: nome da função principal, ponto de entrada do programa.
    - (): indica que a função não recebe parâmetros.

var con = "S", var a = 0, var nota1 = readln()!!.toFloat(), var nota2 = readln()!!.toFloat(), var média = (nota1 + nota2)/2:
    - var: declara uma variável mutável.
    - con, a, nota1, nota2, média: nomes das variáveis.
    - =: operador de atribuição, define o valor inicial da variável.
    - "S": valor inicial da variável con.
    - 0: valor inicial da variável a.
    - readln(): lê uma linha digitada pelo usuário no console.
    - !!: operador que garante que o valor não é nulo.
    - toFloat(): converte o texto lido para float.
    - (nota1 + nota2)/2: expressão que calcula a média das notas.

while(con == "S"):
    - while: estrutura de repetição que executa o bloco enquanto a condição for verdadeira.
    - (con == "S"): condição que mantém o laço ativo enquanto con for igual a "S".

println(...):
    - println: função que exibe uma mensagem no console e pula para a próxima linha.
    - "texto": texto (String) exibido ao usuário.

if (média >= 9.5):
    - if: estrutura condicional, executa o bloco se a condição for verdadeira.
    - (média >= 9.5): condição que verifica se a média é maior ou igual a 9.5.

print(...):
    - print: exibe uma mensagem no console (sem pular linha).
    - "texto": texto exibido ao usuário, pode conter interpolação de variáveis (${...}).

a += 1:
    - +=: operador de adição e atribuição, incrementa o valor de a em 1.

con = readln():
    - =: operador de atribuição, define o valor da variável con.
    - readln(): lê uma linha digitada pelo usuário no console.

"$a alunos passaram":
    - "$a": interpolação de string, insere o valor da variável a no texto.
    - "alunos passaram": texto exibido ao usuário.
*/

// Escreva um programa para ler 2 notas de um aluno, calcular e imprimir a média final.
// Considere que a nota de aprovação é 9,5. Logo após escrever a mensagem
// "Calcular a média de outro aluno Sim/Não?" e solicitar um resposta.
// Se a resposta for "S", o programa deve ser executado novamente, caso contrário
// deve ser encerrado exibindo a quantidade de alunos aprovados.

// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Inicializa a variável de controle para continuar o processo
    var con = "S"
    // Inicializa o contador de alunos aprovados
    var a = 0
    // Enquanto o usuário quiser continuar
    while(con == "S"){
        // Solicita a primeira nota e converte para float
        println("Escreva a primeira nota")
        var nota1 = readln()!!.toFloat()
        // Solicita a segunda nota e converte para float
        println("Escreva a segunda nota")
        var nota2 = readln()!!.toFloat()
        // Calcula a média das duas notas
        var média = (nota1 + nota2)/2
        // Se a média for maior ou igual a 9.5, considera aprovado
        if (média >= 9.5){
            println("O aluno passou!!")
            a+=1
        }
        // Pergunta se deseja continuar
        print("Você quer continuar? ")
        con = readln()
    }
    // Exibe o total de alunos aprovados
    println("$a alunos passaram")
}
