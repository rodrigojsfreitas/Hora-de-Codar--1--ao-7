fun main() {
    println("Escreva a altura:")

    var altura = readln()!!.toDouble()

    println("Escolha o gênero: 1: Masculino 2: Feminino")
    var genero = readln()!!.toDouble()

    if (1.toDouble() == genero){
        var pesoideal = (72.7 * altura) - 58
        println("Seu peso ideal é $pesoideal".format("%.2f", pesoideal))
    }
    else if (genero === 2.toDouble()){
        var pesoideal = (62.1*altura) - 44.7
        println("Seu peso ideal é ${pesoideal}".format("%.2f", pesoideal))
    }else{
        print("Gênero Inválido")
    }
}