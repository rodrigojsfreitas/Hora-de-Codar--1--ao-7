// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Solicita ao usuário o ano de nascimento
    println("Qual é seu ano de nascimento?")
    var birthdat = readln()!!.toInt() // Lê e converte a entrada para inteiro
    // Calcula a idade e verifica se é maior ou menor de idade
    if (18 <= (2025 - birthdat)){
        println("Você é maior de idade")
    }else {
        println("Você é menor de idade")
    }
}