/*
Elementos usados neste arquivo Kotlin:

data class agenda(var Nome: String, var Numero: Int, var endereço : String):
    - data class: define uma classe de dados.
    - agenda: nome da classe que representa um contato.
    - var Nome: propriedade para armazenar o nome do contato.
    - var Numero: propriedade para armazenar o número do contato.
    - var endereço: propriedade para armazenar o endereço do contato.

fun main():
    - fun: palavra-chave que define uma função.
    - main: nome da função principal, ponto de entrada do programa.
    - (): indica que a função não recebe parâmetros.

var registro = mutableListOf<agenda>():
    - var: declara uma variável mutável.
    - registro: nome da variável que armazena a lista de contatos.
    - mutableListOf<agenda>(): cria uma lista mutável de objetos do tipo agenda.

registro.add(...):
    - registro.add(...): adiciona um contato à lista.

registro.sortBy { agenda -> agenda.Nome }:
    - registro.sortBy: ordena a lista de contatos.
    - agenda -> agenda.Nome: função lambda que indica que a ordenação será pelo nome.

println(...):
    - println: função que exibe uma mensagem no console e pula para a próxima linha.
    - "texto": texto (String) exibido ao usuário.

var r = readln():
    - var: declara uma variável mutável.
    - r: nome da variável que armazena o nome a ser procurado.
    - =: operador de atribuição, define o valor inicial da variável.
    - readln(): lê uma linha digitada pelo usuário no console.

registro.forEach { ... }:
    - registro.forEach: percorre todos os contatos da lista.
    - it: representa cada contato durante a iteração.

if(it.Nome.uppercase() == r.uppercase()):
    - if: estrutura condicional, executa o bloco se a condição for verdadeira.
    - it.Nome.uppercase(): converte o nome do contato para maiúsculas.
    - r.uppercase(): converte o nome procurado para maiúsculas.
    - ==: operador de comparação, verifica se os nomes são iguais.

println("Nome: ${it.Nome} \nNúmero: ${it.Numero} \n Endereço: ${it.endereço}"):
    - println: exibe os dados do contato encontrado, com interpolação de string.
    - ${it.Nome}, ${it.Numero}, ${it.endereço}: interpolação de string, insere os valores das propriedades do contato.

readln():
    - readln(): lê uma linha digitada pelo usuário no console, usado para pausar a execução.
*/

// Considerando a necessidade de desenvolver uma agenda que contenha nomes, endereços e telefones de 10 pessoas,
// defina a estrutura de registro apropriada, o diagrama de blocos e a codificação de um programa que
// por meio do uso de um menu de opções, execute as seguintes etapas:
//
// a) Cadastrar os 10 registros.
// b) Pesquisar um dos 10 registros de cada vez pelo campo nome (usar o método seqüencial).
// c) Classificar por ordem de nome os registros cadastrados.
// d) Apresentar todos os registros.
// e) Sair do programa de cadastro.

// Define a classe 'agenda' para armazenar nome, número e endereço de um contato
data class agenda(var Nome: String, var Numero: Int, var endereço : String)
// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Cria uma lista mutável de contatos do tipo 'agenda'
    var registro = mutableListOf<agenda>()
    // Adiciona vários contatos à lista
    registro.add(agenda("Eduard",11221,"Rua pincas"))
    registro.add(agenda("Eduard",11221,"Rua pincas"))
    registro.add(agenda("Eduard",11221,"Rua pincas"))
    registro.add(agenda("Eduard",11221,"Rua pincas"))
    registro.add(agenda("Eduard",11221,"Rua pincas"))
    registro.add(agenda("Bduard",11221,"Rua pincas"))
    registro.add(agenda("Eduard",11221,"Rua pincas"))
    registro.add(agenda("Eduard",11221,"Rua pincas"))
    registro.add(agenda("Eduard",11221,"Rua pincas"))
    registro.add(agenda("Aduard",11221,"Rua pincas"))
    // Ordena a lista de contatos pelo nome
    registro.sortBy { agenda -> agenda.Nome}
    // Exibe todos os contatos cadastrados
    println(registro)
    // Solicita ao usuário o nome que deseja procurar
    println("Quem você está procurando?")
    var r = readln()
    // Percorre a lista e exibe os dados do contato se o nome for igual ao procurado
    registro.forEach {
        if(it.Nome.uppercase() == r.uppercase()){
            println("Nome: ${it.Nome} \nNúmero: ${it.Numero} \n Endereço: ${it.endereço}")
            readln() // Aguarda o usuário pressionar Enter
        }
    }

}