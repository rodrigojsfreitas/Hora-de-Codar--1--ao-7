// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Solicita ao usuário o primeiro número e converte a entrada para inteiro
    println("Escreva o primeiro número")
    var numero1 = readLine()!!.toInt()

    // Solicita ao usuário o segundo número e converte a entrada para inteiro
    println("Escreva o segundo número")
    var numero2 = readLine()!!.toInt()

    // Solicita ao usuário o terceiro número e converte a entrada para inteiro
    println("Escreva o terceiro número")
    var numero3 = readLine()!!.toInt()

    // Solicita ao usuário o quarto número e converte a entrada para inteiro
    println("Escreva o quarto número")
    var numero4 = readLine()!!.toInt()

    // Verifica se cada nota está entre 0 e 10
    var nota1 = numero1 > 0 && numero1 < 10
    var nota2 = numero2 > 0 && numero2 < 10
    var nota3 = numero3 > 0 && numero3 < 10
    var nota4 = numero4 > 0 && numero4 < 10
    // Calcula a média dos quatro números
    var media = (numero1 + numero2 + numero3 + numero4)/4

    // Se todas as notas forem válidas, verifica se a média é maior que 5
    if (nota1 && nota2 && nota3 && nota4) {
        if (media > 5){
            println("Parabéns!!!! Você passou")
        }else{
            println("Tente Novamente")
        }
    }else{
        println("Números inválidos")
    }

}