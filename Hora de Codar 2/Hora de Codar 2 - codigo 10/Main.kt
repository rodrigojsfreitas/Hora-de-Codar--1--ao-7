// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Solicita ao usuário a altura e converte a entrada para double
    println("Escreva a altura:")
    var altura = readln()!!.toDouble()

    // Solicita ao usuário o gênero e converte a entrada para double
    println("Escolha o gênero: 1: Masculino 2: Feminino")
    var genero = readln()!!.toDouble()

    // Verifica se o gênero é masculino (1)
    if (1.0 == genero){
        // Calcula o peso ideal para masculino
        var pesoideal = (72.7 * altura) - 58
        println("Seu peso ideal é %.2f".format(pesoideal))
    }
    // Verifica se o gênero é feminino (2)
    else if (genero == 2.0){
        // Calcula o peso ideal para feminino
        var pesoideal = (62.1*altura) - 44.7
        println("Seu peso ideal é %.2f".format(pesoideal))
    }else{
        // Caso o gênero informado seja inválido
        print("Gênero Inválido")
    }
}