// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Solicita ao usuário que digite 'acione' para armar a bomba
    println("Escreva acione para armar a bomba")
    var ac = readln()
    // Verifica se o usuário digitou 'acione'
    if (ac == "acione"){
        // Inicializa a variável bomba com 30
        var bomba = 30
        // Enquanto bomba for maior ou igual a 0, exibe o valor e decrementa
        while (bomba >= 0){
            println(bomba)
            bomba -= 1
        }
        // Exibe mensagem de explosão
        println("Booooooom!!!!!")
    }else {
        // Se não digitou 'acione', nada acontece
        print("Nada aconteceu!!!")
    }
}