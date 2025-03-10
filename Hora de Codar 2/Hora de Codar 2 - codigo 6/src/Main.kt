//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Escreva o primeiro número")
    var numero1 = readLine()!!.toInt()
    var maior = numero1

    println("Escreva o segundo número")
    var numero2 = readLine()!!.toInt()

    if (maior < numero2){
        maior = numero2
    }

    println("Escreva o terceiro número")
    var numero3 = readLine()!!.toInt()

    if (maior < numero3){
        maior = numero3
    }

    println("Escreva o quarto número")
    var numero4 = readLine()!!.toInt()

    if (maior < numero4){
        maior = numero4
    }
    println("O primeiro número é $numero1, o último é $numero4 e o maior é $maior")
}