/*
Elementos usados neste arquivo Kotlin:

data class notas(var Nome: String, var Salario: Double, var Matricula: Int):
    - data class: define uma classe de dados.
    - notas: nome da classe que representa um funcionário.
    - var Nome: propriedade para armazenar o nome do funcionário.
    - var Salario: propriedade para armazenar o salário do funcionário.
    - var Matricula: propriedade para armazenar o número de matrícula do funcionário.

fun main():
    - fun: palavra-chave que define uma função.
    - main: nome da função principal, ponto de entrada do programa.
    - (): indica que a função não recebe parâmetros.

var registro = mutableListOf<notas>():
    - var: declara uma variável mutável.
    - registro: nome da variável que armazena a lista de funcionários.
    - mutableListOf<notas>(): cria uma lista mutável de objetos do tipo notas.

for (i in 1..5):
    - for: estrutura de repetição que executa o bloco para cada valor do intervalo.
    - i: variável de controle do laço, recebe valores de 1 a 5.
    - in 1..5: intervalo de valores para i.

registro.add(notas("Nome", Salario, Matricula)):
    - registro.add(...): adiciona um funcionário à lista.
    - notas("Nome", Salario, Matricula): cria um objeto do tipo notas com nome, salário e matrícula.

registro.sortBy { notas -> notas.Matricula }:
    - registro.sortBy: ordena a lista de funcionários.
    - notas -> notas.Matricula: função lambda que indica que a ordenação será pela matrícula.

println(...):
    - println: função que exibe uma mensagem no console e pula para a próxima linha.
    - "texto": texto (String) exibido ao usuário.

var r = readln().toIntOrNull():
    - var: declara uma variável mutável.
    - r: nome da variável que armazena o número da matrícula a ser consultada.
    - =: operador de atribuição, define o valor inicial da variável.
    - readln(): lê uma linha digitada pelo usuário no console.
    - toIntOrNull(): tenta converter o texto lido para inteiro, retorna null se não for possível.

registro.forEach { ... }:
    - registro.forEach: percorre todos os funcionários da lista.
    - it: representa cada funcionário durante a iteração.

if(it.Salario > 1 && it.Matricula == r):
    - if: estrutura condicional, executa o bloco se a condição for verdadeira.
    - it.Salario > 1: condição que verifica se o salário é maior que mil reais.
    - it.Matricula == r: condição que verifica se a matrícula corresponde à informada.

else if(it.Salario < 1 && it.Matricula == r):
    - else if: executa o bloco se a condição anterior for falsa e esta for verdadeira.
    - it.Salario < 1: condição que verifica se o salário é menor que mil reais.
    - it.Matricula == r: condição que verifica se a matrícula corresponde à informada.

else if(it.Salario == 1.0 && it.Matricula == r):
    - else if: executa o bloco se as condições anteriores forem falsas e esta for verdadeira.
    - it.Salario == 1.0: condição que verifica se o salário é igual a mil reais.
    - it.Matricula == r: condição que verifica se a matrícula corresponde à informada.

${...}:
    - Interpolação de string: insere o valor de uma variável ou expressão dentro do texto.
*/

// Considerando os registros de 20 funcionários, contendo os campos: matrícula,
// nome e salário, desenvolver um programa que, por meio de um menu, execute as seguintes etapas:
//
// a) Cadastrar os 20 empregados e classificar os registros por número de matrícula.
//
// b) Pesquisar um determinado empregado pelo número de matrícula.
//
// c) Apresentar de forma ordenada (por matrícula) os registros dos empregados que recebem
// salários acima de R$1.000,00.
//
// d) Apresentar de forma ordenada (por matrícula) os registros dos empregados que recebem
// salários abaixo de R$1.000,00.
//
// e) Apresentar de forma ordenada (por matrícula) os registros dos empregados que recebem salários
// iguais a R$1.000,00.
//
// f) Sair do programa.

// Define a classe 'notas' para armazenar nome, salário e matrícula de um funcionário
data class notas(var Nome: String, var Salario: Double,var Matricula: Int)
// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Cria uma lista mutável de funcionários do tipo 'notas'
    var registro = mutableListOf<notas>()
    // Adiciona funcionários à lista
    for (i in 1..5){
        registro.add(notas("Enzo", 1.4,12))}
    for (i in 1..5){
        registro.add(notas("Gabriel", 2.1, 24))}
    for (i in 1..5){
        registro.add(notas("Andressa", 1.7,43))}
    // Ordena a lista de funcionários pela matrícula
    registro.sortBy { notas -> notas.Matricula}
    // Exibe todos os funcionários cadastrados
    println(registro)
    // Solicita ao usuário o número da matrícula que deseja consultar
    println("Qual o número da matrícula?")
    var r = readln().toIntOrNull()
    // Percorre a lista e exibe os dados do funcionário conforme o salário
    registro.forEach {
        if(it.Salario > 1 && it.Matricula == r){
            println("Maiores que mil reais:")
            println("Nome: ${it.Nome}")
            println("Salário: ${it.Salario}\n")
            println("Matrícula: ${it.Matricula}")
        }else if(it.Salario < 1 && it.Matricula == r){
            println("Menores que mil reais:")
            println("Nome: ${it.Nome}")
            println("Salário: ${it.Salario}\n")
            println("Matrícula: ${it.Matricula}")
        }else if(it.Salario == 1.0 && it.Matricula == r){
            println("Iguais a mil reais:")
            println("Nome: ${it.Nome}")
            println("Salário: ${it.Salario}\n")
            println("Matrícula: ${it.Matricula}")
        }
    }

}