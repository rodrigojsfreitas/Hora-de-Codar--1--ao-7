// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Solicita ao usuário o primeiro número e converte a entrada para inteiro
    println("escolha o primeiro número: ")
    var numero1 = readLine()!!.toInt()
    // Solicita ao usuário o segundo número e converte a entrada para inteiro
    println("escolha o segundo número: ")
    var numero2 = readLine()!!.toInt()
    // Compara os dois números e informa qual é o maior
    if (numero1 > numero2) {
        println("O número $numero1 é maior que o $numero2")
    } else {
        println("O número $numero2 é maior que o $numero1")
    }
    // Programa dois: compara três números
    println("escolha o primeiro número: ")
    var numero3 = readLine()!!.toInt()
    println("escolha o segundo número: ")
    var numero4 = readLine()!!.toInt()
    println("Escolha o terceiro número: ")
    var numero5 = readLine()!!.toInt()
    // Verifica qual dos três números é o maior
    if (numero3 > numero4 && numero3 > numero5){
        println("O número $numero3 é maior do que os outros")
    }
    else if (numero4 > numero3 && numero4 > numero5){
        println("O número $numero4 é maior do que os outros")
    }
    else if (numero5 > numero4 && numero5 > numero3){
        println("O número $numero5 é maior do que os outros")
    }
}
