// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Solicita ao usuário o primeiro número e inicializa soma e contador
    println("Escreva o primeiro número")
    var soma = 0
    var con = 0
    var numero1 = readln()!!.toInt()
    // Solicita ao usuário o segundo número
    println("Escreva o segundo número")
    var numero2 = readln().toInt()
    // Enquanto o segundo número for menor ou igual ao primeiro, solicita novamente
    while (numero1 < numero2){
        println("Escreva o segundo número maior do que o primeiro")
        numero2 = readln()!!.toInt()
    }
    // Enquanto o primeiro número for maior ou igual ao segundo, soma e conta
    while (numero1 >= numero2){
        soma += numero1
        con += 1
        numero1 -= 1
    }
    // Exibe a média dos números somados
    println("A média dos números é ${soma/con}")
}