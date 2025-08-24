/*
Elementos usados neste arquivo Kotlin:

data class notas(var Nome: String, var Altura: Double):
    - data class: define uma classe de dados.
    - notas: nome da classe que representa uma pessoa.
    - var Nome: propriedade para armazenar o nome da pessoa.
    - var Altura: propriedade para armazenar a altura da pessoa.

fun main():
    - fun: palavra-chave que define uma função.
    - main: nome da função principal, ponto de entrada do programa.
    - (): indica que a função não recebe parâmetros.

var registro = mutableListOf<notas>():
    - var: declara uma variável mutável.
    - registro: nome da variável que armazena a lista de pessoas.
    - mutableListOf<notas>(): cria uma lista mutável de objetos do tipo notas.

for (i in 1..5):
    - for: estrutura de repetição que executa o bloco para cada valor do intervalo.
    - i: variável de controle do laço, recebe valores de 1 a 5.
    - in 1..5: intervalo de valores para i.

registro.add(notas("Nome", Altura)):
    - registro.add(...): adiciona uma pessoa à lista.
    - notas("Nome", Altura): cria um objeto do tipo notas com nome e altura.

registro.sortBy { notas -> notas.Nome }:
    - registro.sortBy: ordena a lista de pessoas.
    - notas -> notas.Nome: função lambda que indica que a ordenação será pelo nome.

println(...):
    - println: função que exibe uma mensagem no console e pula para a próxima linha.
    - "texto": texto (String) exibido ao usuário.

registro.forEach { ... }:
    - registro.forEach: percorre todos os registros da lista.
    - it: representa cada pessoa durante a iteração.

if(it.Altura < 1.5):
    - if: estrutura condicional, executa o bloco se a condição for verdadeira.
    - it.Altura < 1.5: condição que verifica se a altura é menor que 1.5m.

else if(it.Altura >= 1.5 && it.Altura < 2):
    - else if: executa o bloco se a condição anterior for falsa e esta for verdadeira.
    - it.Altura >= 1.5 && it.Altura < 2: condição que verifica se a altura está entre 1.5m e 2m.
    - &&: operador lógico 'E', usado para combinar condições.

else if(it.Altura >= 1.5):
    - else if: executa o bloco se as condições anteriores forem falsas e esta for verdadeira.
    - it.Altura >= 1.5: condição que verifica se a altura é maior ou igual a 1.5m.

${...}:
    - Interpolação de string: insere o valor de uma variável ou expressão dentro do texto.
*/

// Considerando a necessidade de um programa que armazene o nome e as notas bimestrais
// de 20 alunos do curso de Técnicas de Programação, defina a estrutura de registro apropriada,
// o diagrama de blocos e a codificação de um programa que, por meio do uso de um menu de opções,
// execute as seguintes etapas:
//
// a) Cadastrar os 20 registros (após o cadastro efetuar a classificação por nome).
//
// b) Pesquisar os 20 registros, de cada vez, pelo campo nome. Nesta pesquisa o programa deverá
// também apresentar a média do aluno e as mensagens: “Aprovado” caso sua média seja maior ou igual a 5,
// ou “Reprovado” para média abaixo de 5.
//
// c) Apresentar todos os registros, médias e a mensagem
// de aprovação ou reprovação.
//
// d) Sair do programa de cadastro.

// Define a classe 'notas' para armazenar nome e altura de uma pessoa
data class notas(var Nome: String, var Altura: Double)
// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Cria uma lista mutável de pessoas do tipo 'notas'
    var registro = mutableListOf<notas>()
    // Adiciona pessoas à lista
    for (i in 1..5){
        registro.add(notas("Enzo", 1.4))}
    for (i in 1..5){
        registro.add(notas("Gabriel", 2.1))}
    for (i in 1..5){
        registro.add(notas("Andressa", 1.7))}
    // Ordena a lista de pessoas pelo nome
    registro.sortBy { notas -> notas.Nome}
    // Exibe todos os registros cadastrados
    println(registro)
    // Percorre a lista e exibe os dados conforme a altura
    registro.forEach {
        if(it.Altura < 1.5){
            println("Menores que 1.5m:")
            println("Nome: ${it.Nome}")
            println("Altura: ${it.Altura}\n")
        }else if(it.Altura >= 1.5 && it.Altura < 2){
            println("Maiores que 1.5m e menores que 2m:")
            println("Nome: ${it.Nome}")
            println("Altura: ${it.Altura}\n")
        }else if(it.Altura >= 1.5){
            println("Maiores que 1.5m:")
            println("Nome: ${it.Nome}")
            println("Altura: ${it.Altura}\n")
        }
    }

}