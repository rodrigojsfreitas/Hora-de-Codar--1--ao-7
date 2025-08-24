/*
Elementos usados neste arquivo Kotlin:

fun main():
    - fun: palavra-chave que define uma função.
    - main: nome da função principal, ponto de entrada do programa.
    - (): indica que a função não recebe parâmetros.

println(...):
    - println: função que exibe uma mensagem no console e pula para a próxima linha.
    - "texto": texto (String) exibido ao usuário.

var altura = readln()!!.toDouble():
    - var: inicia uma variável mutável.
    - altura: nome da variável.
    - =: operador de atribuição, define o valor inicial da variável.
    - readln(): lê uma linha digitada pelo usuário no console.
    - !!: operador que garante que o valor não é nulo.
    - toDouble(): converte o valor lido para double.

var genero = readln()!!.toDouble():
    - var: inicia uma variável mutável.
    - genero: nome da variável.
    - =: operador de atribuição.
    - readln(): lê uma linha do usuário.
    - !!: operador que garante que o valor não é nulo.
    - toDouble(): converte o valor lido para double.

if (1.0 == genero):
    - if: estrutura condicional, executa um bloco se a condição for verdadeira.
    - 1.0 == genero: condição booleana, verifica se o valor é igual a 1.0.
    - ==: operador de igualdade.
    - { }: bloco de código executado se a condição for verdadeira.

else if (genero == 2.0):
    - else if: executa um bloco se a condição do if for falsa e testa nova condição.
    - genero == 2.0: condição booleana, verifica se o valor é igual a 2.0.

else:
    - else: executa um bloco se todas as condições anteriores forem falsas.

var pesoideal = (72.7 * altura) - 58 / (62.1 * altura) - 44.7:
    - var: inicia uma variável mutável.
    - pesoideal: nome da variável.
    - =: atribui o valor.
    - (72.7 * altura) - 58: fórmula para peso ideal masculino.
    - (62.1 * altura) - 44.7: fórmula para peso ideal feminino.
    - *: operador de multiplicação.
    - -: operador de subtração.

println("Seu peso ideal é %.2f".format(pesoideal)):
    - %.2f: formata o valor para duas casas decimais.
    - .format(...): função que formata o valor.
    - $pesoideal: interpolação de string (não usada diretamente, mas pode ser usada).

print(...):
    - print: exibe uma mensagem no console (sem pular linha).
    - "texto": texto exibido ao usuário.
*/

// Tendo como entrada a altura e o gênero designado ao nascer (codificado da
// seguinte forma: 1: feminino - 2: masculino - ) de uma pessoa, construa um programa
// que calcule e imprima seu peso ideal, utilizando as seguintes fórmulas.

// Para homens: (72.7 * altura) - 58
// Para mulheres: (62.1 * altura) - 44.7
// Observação: Altura = h (na formula acima).

// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Solicita ao usuário a altura e converte a entrada para double
    println("Escreva a altura:")
    var altura = readln()!!.toDouble()

    // Solicita ao usuário o gênero e converte a entrada para double
    println("Escolha o gênero: 1: Masculino 2: Feminino")
    var genero = readln()!!.toDouble()

    // Verifica se o gênero é masculino (1)
    if (1.0 == genero){
        // Calcula o peso ideal para masculino
        var pesoideal = (72.7 * altura) - 58
        println("Seu peso ideal é %.2f".format(pesoideal))
    }
    // Verifica se o gênero é feminino (2)
    else if (genero == 2.0){
        // Calcula o peso ideal para feminino
        var pesoideal = (62.1*altura) - 44.7
        println("Seu peso ideal é %.2f".format(pesoideal))
    }else{
        // Caso o gênero informado seja inválido
        print("Gênero Inválido")
    }
}