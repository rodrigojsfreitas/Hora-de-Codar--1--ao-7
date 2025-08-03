package Hotel

fun main() {
    // Função principal que chama a função inicio().
    iniciar()
}

fun iniciar() {
    print("Bem vindo ao Hotel Terabithia!\n")
    println("Escolha uma opção:")
    // A varival escolha armazena a opção escolhida pelo usuário.
    // uma variavel local é utilizada apenas dentro da função inicio().
    val escolha = readln().toIntOrNull()
    when (escolha) {
        1 -> cadastrarQuartos()
        2 -> cadastrarHospedes()
        3 -> AbastecimentoDeAutomoveis()
        4 -> sairDoHotel()
        else -> erro()
    }
}

fun cadastrarQuartos() {

}

fun AbastecimentoDeAutomoveis() {

}

fun sairDoHotel() {
    println("Você deseja sair?\n Informe 1 para \"sim\" e 0 para \"não\"")
    val confirma = readln().toBoolean() // digite true ou false ou 1 ou 0
    if (confirma) {
        println("Até logo!")
    } else {
        iniciar()
    }
}

fun erro(){
    println("Por favor, informe um número entre 1 e 4.")
    iniciar()
}