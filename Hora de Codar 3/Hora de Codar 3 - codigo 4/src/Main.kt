fun main() {
    var soma = 0
    var con = 0
    var numero = 100
    while (numero >= 15){
        soma += numero
        con += 1
        numero -= 1
        println(numero)
    }
    println("A média é igual a ${soma/con}")

}