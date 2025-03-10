//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Escreva um número")
    var numero1 = readLine()!!.toInt()
    if (numero1 > 0){
        println("O seu número é positivo")
    }else if (numero1 < 0){
        println("O seu número é negativo")
    }else{
        println("O seu número é zero")
    }
}