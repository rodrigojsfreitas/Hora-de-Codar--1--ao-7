// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Declara uma variável para armazenar o nome do aluno
    var aluno = ""
    // Cria uma lista mutável para armazenar os nomes dos alunos
    var lista = mutableListOf<String>()
    // Enquanto o usuário não digitar "PARE", continua solicitando nomes
    while (aluno != "PARE") {
        print("Escreva o nome do aluno: ") // Solicita o nome do aluno
        aluno = readln() // Lê o nome digitado
        if (aluno == "PARE"){
            break // Encerra o laço se o usuário digitar "PARE"
        }
        lista.add(aluno) // Adiciona o nome à lista
    }
    // Exibe a quantidade de estudantes cadastrados
    println("A lista tem ${lista.size} Estudantes")
    var con = 0 // Inicializa um contador para exibir a lista numerada
    for (x in lista){
        con++ // Incrementa o contador
        println("$con. $x") // Exibe o número e o nome do aluno
    }
}
