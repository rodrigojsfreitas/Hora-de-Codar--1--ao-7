fun main() {
    println("Digite o primeiro valor")
    var valor1 = readln()!!.toInt()
    println("Digite o segundo valor")
    var valor2 = readln()!!.toInt()
    println("Escolha o operador: +: 1  -: 2 /: 3 *: 4")
    var operador = readln()

    if (operador == "+" || operador  == "1"){
        println("A soma dos valores é ${valor1 + valor2}")
    }else if (operador == "-" || operador  == "2"){
        println("A soma dos valores é ${valor1 - valor2}")
    }else if (operador == "/" || operador  == "3"){
        println("A soma dos valores é ${valor1 + valor2}")
    }else if (operador == "*" || operador  == "4"){
        println("A soma dos valores é ${valor1 + valor2}")
    }else{
        println("Operador Inválido")
    }
}