/*
Elementos usados neste arquivo Kotlin:

data class notas(var Nome: String, var Nota: Int):
    - data class: define uma classe de dados.
    - notas: nome da classe que representa um aluno.
    - var Nome: propriedade para armazenar o nome do aluno.
    - var Nota: propriedade para armazenar a nota do aluno.

fun main():
    - fun: palavra-chave que define uma função.
    - main: nome da função principal, ponto de entrada do programa.
    - (): indica que a função não recebe parâmetros.

var registro = mutableListOf<notas>():
    - var: declara uma variável mutável.
    - registro: nome da variável que armazena a lista de alunos.
    - mutableListOf<notas>(): cria uma lista mutável de objetos do tipo notas.

for (i in 1..5):
    - for: estrutura de repetição que executa o bloco para cada valor do intervalo.
    - i: variável de controle do laço, recebe valores de 1 a 5.
    - in 1..5: intervalo de valores para i.

registro.add(notas("Nome", Nota)):
    - registro.add(...): adiciona um aluno à lista.
    - notas("Nome", Nota): cria um objeto do tipo notas com nome e nota.

registro.sortBy { notas -> notas.Nome }:
    - registro.sortBy: ordena a lista de alunos.
    - notas -> notas.Nome: função lambda que indica que a ordenação será pelo nome.

println(...):
    - println: função que exibe uma mensagem no console e pula para a próxima linha.
    - "texto": texto (String) exibido ao usuário.

var r = readln():
    - var: declara uma variável mutável.
    - r: nome da variável que armazena o nome a ser procurado.
    - =: operador de atribuição, define o valor inicial da variável.
    - readln(): lê uma linha digitada pelo usuário no console.

registro.forEach { ... }:
    - registro.forEach: percorre todos os alunos da lista.
    - it: representa cada aluno durante a iteração.

if(it.Nome.uppercase() == r.uppercase()):
    - if: estrutura condicional, executa o bloco se a condição for verdadeira.
    - it.Nome.uppercase(): converte o nome do aluno para maiúsculas.
    - r.uppercase(): converte o nome procurado para maiúsculas.
    - ==: operador de comparação, verifica se os nomes são iguais.

var aprovado = if(it.Nota > 5) "Aprovado" else "Reprovado":
    - var: declara uma variável mutável.
    - aprovado: nome da variável que armazena o status do aluno.
    - if(...): estrutura condicional que atribui "Aprovado" ou "Reprovado" conforme a nota.
    - it.Nota > 5: condição que verifica se a nota é maior que 5.
    - else: executa o bloco se a condição do if for falsa.

println("Nome: ${it.Nome} \nNota: ${it.Nota} \n Status: $aprovado"):
    - println: exibe os dados do aluno encontrado, com interpolação de string.
    - ${it.Nome}, ${it.Nota}, $aprovado: interpolação de string, insere os valores das propriedades do aluno.

readln():
    - readln(): lê uma linha digitada pelo usuário no console, usado para pausar a execução.
*/

// Considerando a necessidade de um programa que armazene o nome e as notas bimestrais de 20 alunos do
// curso de Técnicas de Programação, defina a estrutura de registro apropriada, o diagrama de blocos e a
// codificação de um programa que, por meio do uso de um menu de opções, execute as seguintes etapas:
//
// a) Cadastrar os 20 registros (após o cadastro efetuar a classificação por nome).
//
// b) Pesquisar os 20 registros, de cada vez, pelo campo nome. Nesta pesquisa o programa deverá
// também apresentar a média do aluno e as mensagens: “Aprovado” caso sua média seja maior ou igual a 5,
// ou “Reprovado” para média abaixo de 5.
//
// c) Apresentar todos os registros, médias e a mensagem de aprovação ou reprovação.
//
// d) Sair do programa de cadastro.

// Define a classe 'notas' para armazenar nome e nota de um aluno
data class notas(var Nome: String, var Nota: Int)
// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Cria uma lista mutável de alunos do tipo 'notas'
    var registro = mutableListOf<notas>()
    // Adiciona alunos à lista
    for (i in 1..5){
        registro.add(notas("Enzo", 8))}
    for (i in 1..5){
        registro.add(notas("Gabriel", 3))}
    for (i in 1..5){
        registro.add(notas("Andressa", 5))}
    for (i in 1..5){
        registro.add(notas("Maycon", 7))}
    // Ordena a lista de alunos pelo nome
    registro.sortBy { notas -> notas.Nome}
    // Exibe todos os registros cadastrados
    println(registro)
    // Solicita ao usuário o nome do aluno que deseja procurar
    println("Quem você está procurando?")
    var r = readln()
    // Percorre a lista e exibe os dados do aluno se o nome for igual ao procurado
    registro.forEach {
        if(it.Nome.uppercase() == r.uppercase()){
            // Verifica se o aluno foi aprovado ou reprovado
            var aprovado = if(it.Nota > 5) "Aprovado" else "Reprovado"
            println("Nome: ${it.Nome} \nNota: ${it.Nota} \n Status: $aprovado")
            readln() // Aguarda o usuário pressionar Enter
        }
    }

}