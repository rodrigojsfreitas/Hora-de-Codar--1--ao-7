fun main() {
    var soma = 0
    println("Digite o primeiro número:")
    var numero1 = readLine()!!.toInt()
    if (numero1 < 72) {
        soma += numero1
    }

    println("Digite o segundo número:")
    var numero2 = readLine()!!.toInt()
    if (numero2 < 72) {
        soma += numero2
    }

    println("Digite o terceiro número:")
    var numero3 = readLine()!!.toInt()
    if (numero1 < 72) {
        soma += numero3
    }

    println("Digite o quarto número:")
    var numero4 = readLine()!!.toInt()
    if (numero4 < 72) {
        soma += numero4
    }

    println("Digite o quinto número:")
    var numero5 = readLine()!!.toInt()
    if (numero5 < 72) {
        soma += numero1
    }

    println("Digite o sexto número:")
    var numero6 = readLine()!!.toInt()
    if (numero6 < 72) {
        soma += numero6
    }

    println("Os números: $numero1, $numero2, $numero3, $numero4, $numero5, $numero6  \n A soma: $soma" )


}