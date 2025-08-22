// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Solicita ao usuário o primeiro número e converte a entrada para inteiro
    println("Escreva o primeiro número")
    var numero1 = readLine()!!.toInt()
    // Inicializa a variável 'maior' com o valor do primeiro número
    var maior = numero1

    // Solicita ao usuário o segundo número e converte a entrada para inteiro
    println("Escreva o segundo número")
    var numero2 = readLine()!!.toInt()
    // Atualiza 'maior' se o segundo número for maior
    if (maior < numero2){
        maior = numero2
    }

    // Solicita ao usuário o terceiro número e converte a entrada para inteiro
    println("Escreva o terceiro número")
    var numero3 = readLine()!!.toInt()
    // Atualiza 'maior' se o terceiro número for maior
    if (maior < numero3){
        maior = numero3
    }

    // Solicita ao usuário o quarto número e converte a entrada para inteiro
    println("Escreva o quarto número")
    var numero4 = readLine()!!.toInt()
    // Atualiza 'maior' se o quarto número for maior
    if (maior < numero4){
        maior = numero4
    }
    // Exibe o primeiro, o último e o maior número informado
    println("O primeiro número é $numero1, o último é $numero4 e o maior é $maior")
}