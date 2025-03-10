//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("escolha o primeiro número: ")
    var numero1 = readLine()!!.toInt()
    println("escolha o segundo número: ")
    var numero2 = readLine()!!.toInt()
    if (numero1 > numero2) {
        println("O número $numero1 é maior que o $numero2")
    }else {
        println("O número $numero2 é maior que o $numero1")
    }
}






