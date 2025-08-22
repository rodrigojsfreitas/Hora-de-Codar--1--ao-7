// Plutão não é planeta!!!!!!!!!!!
// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Cria uma lista com os nomes dos planetas do sistema solar
    val planetas = listOf("Mercúrio", "Vênus", "Terra","Marte", "Júpiter", "Saturno", "Urano", "Netuno")
    // Solicita ao usuário que escreva o nome de um planeta
    println("Escreva um planeta: ")
    var pergunta = readln() // Lê o nome digitado
    // Verifica se o planeta está na lista
    if (planetas.indexOf(pergunta) > -1){
        // Exibe a posição do planeta no sistema solar
        print("O planeta ${pergunta} é o ${planetas.indexOf(pergunta)+1}º do sistema solar")
    }else{
        // Caso o planeta não esteja na lista, exibe mensagem de erro
        println("O que você escreve")
    }

}