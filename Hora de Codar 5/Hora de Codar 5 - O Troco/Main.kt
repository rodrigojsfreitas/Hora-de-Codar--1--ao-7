// Importa função para encerrar o programa
import kotlin.system.exitProcess
// Constantes para identificar operações
val Deposito = "Deposito"
val Saque = "Saque"
// Variável global para armazenar o nome do usuário
var nome: String = "Usuário"
// Classe de dados para representar um extrato bancário
data class Extrato(
  var status: String, // Tipo de operação (Depósito, Saque, etc)
  var valor: Float    // Valor da operação
)
// Senha fixa para autenticação
val senha = 3589
// Lista mutável para armazenar extratos
var extratos = mutableListOf<Extrato>(Extrato(Deposito, 1.0f), Extrato(Saque, 1.0f) )
// Saldo inicial da conta
var saldo = 100.5 // Float

// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Solicita o nome do usuário
    println("Qual o seu nome?")
    nome = readln()
    // Exibe mensagem de boas-vindas
    println("Olá $nome é um prazer ter você por aqui!")
    // Chama o menu inicial
    inicio(nome)
}

// Função que exibe o menu principal e trata a escolha do usuário
fun inicio(name:String = "Usuário") {
    println("Escolha uma das opções abaixo, $name:" +
        "\n1 - Ver saldo" +
        "\n2 - Ver o extrato" +
        "\n3 - Fazer saque" +
        "\n4 - Fazer deposito" +
        "\n5 - Fazer tranferência" +
        "\n6 - Sair" )
    val escolha = readLine()?.toIntOrNull()

    // Estrutura condicional para tratar a escolha
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

// Função para solicitar a senha do usuário
fun chamarSenha() {
    print("Por favor, informe a senha: ")
    val senhaInformada = readLine()?.toIntOrNull()

    if (senhaInformada == null) {
        println("Por favor, informe um número válido.")
        chamarSenha()
    } else if (senhaInformada == senha) {
        return // Senha correta, segue o fluxo
    } else {
        println("Senha incorreta. Tente novamente.")
        chamarSenha()
    }
}

// Função para exibir o saldo atual
fun verSaldo() {
    println("Seu saldo atual é: $saldo")
    inicio()
}

// Função para realizar depósito
fun fazerDeposito() {
    print("Qual o valor para depósito? ")
    val deposito = readLine()?.toFloatOrNull()

    if (deposito == null) {
        println("Por favor, informe um número válido.")
        fazerDeposito()
    } else if (deposito <= 0) {
        println("Operação não autorizada")
        fazerDeposito()
    }  else {
        saldo += deposito // Atualiza saldo
        extratos.addLast(Extrato(Deposito, deposito) ) // Adiciona ao extrato
        verSaldo()
    }
}

// Função para realizar saque
fun fazerSaque() {
    print("Qual o valor para saque? ")
    val saque = readLine()?.toFloatOrNull()

    if (saque == null) {
        println("Por favor, informe um número válido.")
        fazerSaque()
    } else if( saque > 0 && saque <= saldo) {
        saldo -= saque // Atualiza saldo
        extratos.addLast(Extrato(Saque,saque) ) // Adiciona ao extrato
        verSaldo()
    }else{
        println("Operação não autorizada")
        fazerSaque()
    }
}

// Função para exibir mensagem de erro de opção
fun erro() {
    println("Por favor, informe um número entre 1 e 6.")
    inicio()
}

// Função para sair do sistema
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
// Função para exibir o extrato de operações
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

// Função para realizar transferência
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
        saldo -= transferencia // Atualiza saldo
        extratos.addLast(Extrato("Transferência", transferencia) ) // Adiciona ao extrato
        verSaldo()
    }else{
        println("Operação não autorizada")
        fazerTransferencia()
    }
}