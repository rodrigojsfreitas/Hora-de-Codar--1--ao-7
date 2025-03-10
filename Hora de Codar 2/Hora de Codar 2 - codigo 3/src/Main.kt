fun main() {
    println("escolha o primeiro número: ")

    var numero3 = readLine()!!.toInt()
    println("escolha o segundo número: ")
    var numero4 = readLine()!!.toInt()
    println("Escolha o terceiro número: ")
    var numero5 = readLine()!!.toInt()
    if (numero3 > numero4 && numero3 > numero5) {
        println("O número $numero3 é maior do que os outros")
    } else if (numero4 > numero3 && numero4 > numero5) {
        println("O número $numero4 é maior do que os outros")
    } else if (numero5 > numero4 && numero5 > numero3) {
        println("O número $numero5 é maior do que os outros")
    }
}