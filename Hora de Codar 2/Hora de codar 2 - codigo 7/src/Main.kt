//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

// 7. Faça um programa que leia 6 números que o usuário vai informar. Todos os números lidos com
// valor inferior a 72 devem ser somados. Escreva o valor final da soma efetuada e também todos valores que o usuário informou.
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