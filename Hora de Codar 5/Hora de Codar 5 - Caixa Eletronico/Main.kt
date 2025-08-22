import kotlin.system.exitProcess
val Deposito = "Deposito"
val Saque = "Saque"
var nome: String = "Usuário"
data class Extrato(
  var status: String,
    var valor: Float
)
val senha = 3589

var extratos = mutableListOf<Extrato>(Extrato(Deposito, 1.0f), Extrato(Saque, 1.0f) )
var saldo = 100.5 // Float

fun main() {
    println("Qual o seu nome?")
    nome = readln()
    println("Olá $nome é um prazer ter você por aqui!")
    inicio(nome)
}

fun inicio(name:String = "Usuário") {
println("Escolha uma das opções abaixo, $name:" +
        "\n1 - Ver saldo" +
        "\n2 - Ver o extrato" +
        "\n3 - Fazer saque" +
        "\n4 - Fazer deposito" +
        "\n5 - Fazer tranferência" +
        "\n6 - Sair" )
    val escolha = readLine()?.toIntOrNull()

    when (escolha) {
        1 -> {chamarSenha(); verSaldo()}
        2 -> {chamarSenha(); verExtrato()}
        3 -> {chamarSenha(); fazerSaque()}
        4 -> {chamarSenha(); fazerDeposito()}
        5 -> {chamarSenha(); fazerTransferencia()}
        6 -> sair()
        null -> {
            println("Por favor, informe um número válido.")
            inicio(name)
        }
        else -> erro()
    }
}
fun chamarSenha() {
    print("Por favor, informe a senha: ")
    val senhaInformada = readLine()?.toIntOrNull()

    if (senhaInformada == null) {
        println("Por favor, informe um número válido.")
        chamarSenha()
    } else if (senhaInformada == senha) {
        return
    } else {
        println("Senha incorreta. Tente novamente.")
        chamarSenha()
    }
}
fun verSaldo() {
    println("Seu saldo atual é: $saldo")
    inicio()
}

fun fazerDeposito() {
    print("Qual o valor para depósito? ")
    val deposito = readLine()?.toFloatOrNull()

    if (deposito == null) {
        println("Por favor, informe um número válido.")
        fazerDeposito()
    } else if (deposito <= 0) {
        println("Operação não autorizada")
        fazerDeposito()
    }  else
     {
        saldo += deposito
        extratos.addLast(Extrato(Deposito, deposito) )
        verSaldo()
    }
}

fun fazerSaque() {
    print("Qual o valor para saque? ")
    val saque = readLine()?.toFloatOrNull()

    if (saque == null) {
        println("Por favor, informe um número válido.")
        fazerSaque()
    } else if( saque > 0 && saque <= saldo) {
        saldo -= saque
        extratos.addLast(Extrato(Saque,saque) )
        verSaldo()
    }else{
        println("Operação não autorizada")
        fazerSaque()
    }
}

fun erro() {
    println("Por favor, informe um número entre 1 e 6.")
    inicio()
}

fun sair() {
    print("Você deseja sair? (S/N) ")
    val confirma = readLine()?.uppercase()

    when (confirma) {
        "S" -> {println("$nome, foi um prazer ter você por aqui!"); exitProcess(0)}
        "N" -> inicio()
        else -> sair()
    }

        inicio()
    }
fun verExtrato() {
    println("Extrato:")
    extratos.forEach { extrato ->
        if( extrato.status == Deposito) {
            println("${extrato.status}      | + R$ ${extrato.valor}")
        } else if( extrato.status == Saque){
            println("${extrato.status}         | - R$ ${extrato.valor}")
    }else {
            println("${extrato.status} | - R$ ${extrato.valor}")
        }
    }
}
fun fazerTransferencia() {
println("Qual o número da conta para transferência? ")
    var numeroConta = readLine()?.toIntOrNull()
    while(numeroConta == null || numeroConta <= 0) {
        println("Por favor, informe um número de conta válido.")
        numeroConta = readln()?.toIntOrNull()
    }
    print("Qual o valor para transferência? ")
    val transferencia = readLine()?.toFloatOrNull()

    if (transferencia == null) {
        println("Por favor, informe um número válido.")
        fazerTransferencia()
    } else if( transferencia > 0 && transferencia <= saldo) {
        saldo -= transferencia
        extratos.addLast(Extrato("Transferência", transferencia) )
        verSaldo()
    }else{
        println("Operação não autorizada")
        fazerTransferencia()
    }
}