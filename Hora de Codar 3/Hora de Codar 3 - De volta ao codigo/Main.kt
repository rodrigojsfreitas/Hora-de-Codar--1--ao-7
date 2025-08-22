fun main() {
    println("Escreva o primeiro valor")
    var valor1 = readln()!!.toFloat()
    println("Escreva o segundo valor")
    var valor2 = readln()!!.toFloat()
    while(valor2 <= 0 ){
        println("Tente novamente")
        valor2 = readln()!!.toFloat()
    }
    println("A divisão de $valor1 e $valor2 é ${valor1/valor2}")
}