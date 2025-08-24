/*
Elementos usados neste arquivo Kotlin:

fun main():
    - fun: palavra-chave que define uma função.
    - main: nome da função principal, ponto de entrada do programa.
    - (): indica que a função não recebe parâmetros.

println(...):
    - println: função que exibe uma mensagem no console e pula para a próxima linha.
    - "texto": texto (String) exibido ao usuário.

var valor1 = readln()!!.toFloat():
    - var: inicia uma variável mutável.
    - valor1: nome da variável.
    - =: operador de atribuição, define o valor inicial da variável.
    - readln(): lê uma linha digitada pelo usuário no console.
    - !!: operador que garante que o valor não é nulo.
    - toFloat(): converte o valor lido para float.

while(valor2 <= 0):
    - while: estrutura de repetição, executa o bloco enquanto a condição for verdadeira.
    - valor2 <= 0: condição booleana.
    - <=: operador relacional "menor ou igual".
    - { }: bloco de código executado enquanto a condição for verdadeira.

Interpolação de string ($valor1, $valor2):
    - $variavel: insere o valor da variável dentro do texto exibido.

Operação aritmética (valor1/valor2):
    - /: operador de divisão, divide o valor de valor1 por valor2.
*/

// Crie uma bomba relógio (usando somente código - para deixar claro!) cuja contagem regressiva
// vá de 30 a 0. No final da repetição escreva "EXPLOSÃO".

// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Solicita ao usuário o primeiro valor e converte para float
    println("Escreva o primeiro valor")
    var valor1 = readln()!!.toFloat()
    // Solicita ao usuário o segundo valor e converte para float
    println("Escreva o segundo valor")
    var valor2 = readln()!!.toFloat()
    // Enquanto o segundo valor for menor ou igual a zero, solicita novamente
    while(valor2 <= 0 ){
        println("Tente novamente")
        valor2 = readln()!!.toFloat()
    }
    // Exibe o resultado da divisão
    println("A divisão de $valor1 e $valor2 é ${valor1/valor2}")
}