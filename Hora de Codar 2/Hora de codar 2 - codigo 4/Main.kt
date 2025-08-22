// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Solicita ao usuário o primeiro número e converte a entrada para inteiro
    println("Escreva o primeiro número:")
    var numero1 = readLine()!!.toInt()
    // Solicita ao usuário o segundo número e converte a entrada para inteiro
    println("Escreva o segundo número:")
    var numero2 = readLine()!!.toInt()
    // Solicita ao usuário o terceiro número e converte a entrada para inteiro
    println("Escreva o terceiro número:")
    var numero3 = readLine()!!.toInt()
    // Calcula as somas possíveis entre os números
    var soma1 = numero1 + numero2 // Soma do primeiro e segundo número
    var soma2 = numero2 + numero3 // Soma do segundo e terceiro número
    var soma3 = numero1 + numero3 // Soma do primeiro e terceiro número
    // Estrutura condicional para identificar qual soma é a maior
    if (soma1 > soma2 && soma1 > soma3) {
        println("A soma dos dois maiores números é $soma1")
    }
    else if (soma2 > soma1 && soma2 > soma3){
        println("A soma dos dois maiores números é $soma2")
    }
    else{
        println("A soma dos dois maiores números é $soma3")
    }
}