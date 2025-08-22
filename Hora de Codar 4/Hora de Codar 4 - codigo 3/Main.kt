// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Cria uma lista mutável com frutas disponíveis na barraca
    val barraca = mutableListOf("Maçã", "Melancia", "Pera", "Abacate")
    var r1: String // Variável para armazenar a resposta do usuário
    // Enquanto houver frutas na barraca
    while(barraca.size > 0){
        // Exibe todas as frutas disponíveis
        for (x in barraca){
            print(" $x ")
        }
        println("\n Escreva uma fruta") // Solicita uma fruta ao usuário

        r1 = readln() // Lê a fruta digitada
        // Verifica se a fruta está na barraca
        if (barraca.indexOf(r1) >= 0){
            println("Você quer excluir um item? Escreva a fruta novamente para confirmar")
            r1 = readln() // Solicita confirmação
            // Se a fruta estiver na barraca, remove
            if (barraca.indexOf(r1) >= 0){
                barraca.removeAt(barraca.indexOf(r1))
            }

            }else{
                // Caso a fruta não esteja disponível, exibe mensagem
                print("Item indisponível\n")
        }
    }
    // Quando todas as frutas forem removidas, exibe mensagem de finalização
    println("Lista de compras finalizada")
}