fun main() {
    println("Escreva o primeiro número")
    var soma = 0
    var con = 0
    var numero1 = readln()!!.toInt()
    println("Escreva o segundo número")
    var numero2 = readln().toInt()
    while (numero1 < numero2){
        println("Escreva o segundo número maior do que o primeiro")
        numero2 = readln()!!.toInt()
    }
    while (numero1 >= numero2){
        soma += numero1
        con += 1
        numero1 -= 1
    }
    println("A média dos números é ${soma/con}")
}