//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// 8. Escreva um programa que calcule a média de quatro números informados pelo usuário,
// mas somente se esses números forem maiores que 0 e menores que 10. No final, se a média
// for maior que cinco o usuário receberá uma mensagem "Você passou no teste". Em qualquer outra situação,
// ele receberá uma mensagem de "tente novamente"
fun main() {
    println("Escreva o primeiro número")
    var numero1 = readLine()!!.toInt()

    println("Escreva o segundo número")
    var numero2 = readLine()!!.toInt()

    println("Escreva o terceiro número")
    var numero3 = readLine()!!.toInt()

    println("Escreva o quarto número")
    var numero4 = readLine()!!.toInt()

    var nota1 = numero1 > 0 && numero1 < 10
    var nota2 = numero2 > 0 && numero2 < 10
    var nota3 = numero3 > 0 && numero3 < 10
    var nota4 = numero4 > 0 && numero4 < 10
    var media = (numero1 + numero2 + numero3 + numero4)/4

    if (nota1 && nota2 && nota3 && nota4) {
        if (media > 5){
            println("Parabéns!!!! Você passou")
        }else{
            println("Tente Novamente")
        }
    }else{
        println("Números inválidos")
    }

}