//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("escolha o primeiro número: ")
    var numero1 = readLine().toInt()
    println("escolha o segundo número: ").
    var numero2
    if (numero1 > numero2) {
        println("O número $numero1 é maior que o $numero2")
    }else {
        println("O número $numero2 é maior que o $numero1")
    }
    // programa dois
    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    println("escolha o primeiro número: ")
    var numero3 = readLine().toInt()
    println("escolha o segundo número: ")
    var numero4 = readLine().toInt()
    println("Escolha o terceiro número: ")
    var numero5 = readLine().toInt()
    if (numero3 > numero4 && numero3 > numero5){
        println("O número $numero3 é maior do que os outros")
    }
    else if (numero4 > numero3 && numero4 > numero5){
        println("O número $numero4 é maior do que os outros")
    }
    else if (numero5 > numero4 && numero5 > numero3){
        println("O número $numero3 é maior do que os outros")
    }
}

}




