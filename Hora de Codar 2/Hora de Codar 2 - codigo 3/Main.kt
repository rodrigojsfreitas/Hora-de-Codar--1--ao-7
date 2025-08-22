// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Solicita ao usuário o primeiro número e converte a entrada para inteiro
    println("escolha o primeiro número: ")
    var numero3 = readLine()!!.toInt()
    // Solicita ao usuário o segundo número e converte a entrada para inteiro
    println("escolha o segundo número: ")
    var numero4 = readLine()!!.toInt()
    // Solicita ao usuário o terceiro número e converte a entrada para inteiro
    println("Escolha o terceiro número: ")
    var numero5 = readLine()!!.toInt()
    // Estrutura condicional para verificar qual dos três números é o maior
    if (numero3 > numero4 && numero3 > numero5) {
        println("O número $numero3 é maior do que os outros")
    } else if (numero4 > numero3 && numero4 > numero5) {
        println("O número $numero4 é maior do que os outros")
    } else if (numero5 > numero4 && numero5 > numero3) {
        println("O número $numero5 é maior do que os outros")
    }
}