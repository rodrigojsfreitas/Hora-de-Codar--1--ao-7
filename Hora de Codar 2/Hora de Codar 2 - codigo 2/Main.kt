//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Solicita ao usuário que digite um número
    println("Escreva um número")
    // Lê a entrada do usuário, converte para inteiro e armazena em numero1
    var numero1 = readLine()!!.toInt()
    // Estrutura condicional para verificar se o número é positivo, negativo ou zero
    if (numero1 > 0){
        println("O seu número é positivo")
    }else if (numero1 < 0){
        println("O seu número é negativo")
    }else{
        println("O seu número é zero")
    }
}