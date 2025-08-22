// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Solicita ao usuário o primeiro valor e converte a entrada para inteiro
    println("Digite o primeiro valor")
    var valor1 = readln()!!.toInt()
    // Solicita ao usuário o segundo valor e converte a entrada para inteiro
    println("Digite o segundo valor")
    var valor2 = readln()!!.toInt()
    // Solicita ao usuário que escolha o operador
    println("Escolha o operador: +: 1  -: 2 /: 3 *: 4")
    var operador = readln()

    // Estrutura condicional para realizar a operação escolhida
    if (operador == "+" || operador  == "1"){
        // Soma os valores
        println("A soma dos valores é ${valor1 + valor2}")
    }else if (operador == "-" || operador  == "2"){
        // Subtrai os valores
        println("A subtração dos valores é ${valor1 - valor2}")
    }else if (operador == "/" || operador  == "3"){
        // Divide os valores
        println("A divisão dos valores é ${valor1 / valor2}")
    }else if (operador == "*" || operador  == "4"){
        // Multiplica os valores
        println("A multiplicação dos valores é ${valor1 * valor2}")
    }else{
        // Caso o operador seja inválido
        println("Operador Inválido")
    }
}