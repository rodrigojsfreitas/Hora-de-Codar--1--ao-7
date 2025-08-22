// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Solicita ao usuário o primeiro valor e converte para float
    println("Escreva o primeiro valor")
    var valor1 = readln()!!.toFloat()
    // Solicita ao usuário o segundo valor e converte para float
    println("Escreva o segundo valor")
    var valor2 = readln()!!.toFloat()
    // Enquanto o segundo valor for menor ou igual a zero, solicita novamente
    while(valor2 <= 0 ){
        println("Tente novamente")
        valor2 = readln()!!.toFloat()
    }
    // Exibe o resultado da divisão
    println("A divisão de $valor1 e $valor2 é ${valor1/valor2}")
}