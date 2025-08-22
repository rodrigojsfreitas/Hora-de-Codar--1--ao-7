fun main() {
    println("Escreva o primeiro número: ")

    var numero1 = readLine()!!.toInt()

    println("Escreva o segundo número: ")

    var numero2 = readLine()!!.toInt()

    println("Escreva o terceiro número: ")

    var numero3 = readLine()!!.toInt()

    println("Escreva o quarto número: ")

    var numero4 = readLine()!!.toInt()

    println("Escreva o quinto número: ")

    var numero5 = readLine()!!.toInt()

    println("Escreva o sexto número: ")

    var numero6 = readLine()!!.toInt()

    var soma = numero1 + numero2 + numero3 + numero4 + numero5 + numero6

    var media = soma/6
    println("A média é $media")
}