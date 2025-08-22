// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Solicita ao usuário o primeiro número e converte a entrada para inteiro
    println("Escreva o primeiro número: ")
    var numero1 = readLine()!!.toInt()
    // Solicita ao usuário o segundo número e converte a entrada para inteiro
    println("Escreva o segundo número: ")
    var numero2 = readLine()!!.toInt()
    // Solicita ao usuário o terceiro número e converte a entrada para inteiro
    println("Escreva o terceiro número: ")
    var numero3 = readLine()!!.toInt()
    // Solicita ao usuário o quarto número e converte a entrada para inteiro
    println("Escreva o quarto número: ")
    var numero4 = readLine()!!.toInt()
    // Solicita ao usuário o quinto número e converte a entrada para inteiro
    println("Escreva o quinto número: ")
    var numero5 = readLine()!!.toInt()
    // Solicita ao usuário o sexto número e converte a entrada para inteiro
    println("Escreva o sexto número: ")
    var numero6 = readLine()!!.toInt()
    // Calcula a soma dos seis números
    var soma = numero1 + numero2 + numero3 + numero4 + numero5 + numero6
    // Calcula a média dos seis números
    var media = soma/6
    // Exibe o resultado da média
    println("A média é $media")
}