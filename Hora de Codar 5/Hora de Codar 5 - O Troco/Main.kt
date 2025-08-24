/*
Elementos usados neste arquivo Kotlin:

val Deposito = "Deposito":
    - val: declara uma variável imutável.
    - Deposito: nome da variável que armazena o texto "Deposito".
    - =: operador de atribuição, define o valor da variável.
    - "Deposito": valor atribuído à variável.

val Saque = "Saque":
    - val: declara uma variável imutável.
    - Saque: nome da variável que armazena o texto "Saque".
    - =: operador de atribuição, define o valor da variável.
    - "Saque": valor atribuído à variável.

var nome: String = "Usuário":
    - var: declara uma variável mutável.
    - nome: nome da variável que armazena o nome do usuário.
    - String: tipo da variável.
    - =: operador de atribuição, define o valor inicial da variável.
    - "Usuário": valor inicial atribuído à variável.

data class Extrato(...):
    - data class: define uma classe de dados.
    - Extrato: nome da classe.
    - status: propriedade que armazena o tipo de operação.
    - valor: propriedade que armazena o valor da operação.

val senha = 3589:
    - val: declara uma variável imutável.
    - senha: nome da variável que armazena a senha fixa.
    - =: operador de atribuição, define o valor da variável.
    - 3589: valor atribuído à variável.

var extratos = mutableListOf<Extrato>(...):
    - var: declara uma variável mutável.
    - extratos: nome da variável que armazena a lista de extratos.
    - mutableListOf<Extrato>(...): cria uma lista mutável de objetos Extrato.

var saldo = 100.5:
    - var: declara uma variável mutável.
    - saldo: nome da variável que armazena o saldo da conta.
    - =: operador de atribuição, define o valor inicial da variável.
    - 100.5: valor inicial atribuído à variável.

fun main():
    - fun: palavra-chave que define uma função.
    - main: nome da função principal, ponto de entrada do programa.
    - (): indica que a função não recebe parâmetros.

println(...):
    - println: função que exibe uma mensagem no console e pula para a próxima linha.
    - "texto": texto (String) exibido ao usuário.

readln():
    - readln(): lê uma linha digitada pelo usuário no console.

fun inicio(name:String = "Usuário"):
    - fun: define uma função.
    - inicio: nome da função que exibe o menu principal.
    - name:String = "Usuário": parâmetro da função, com valor padrão.

val escolha = readLine()?.toIntOrNull():
    - val: declara uma variável imutável.
    - escolha: nome da variável que armazena a escolha do usuário.
    - readLine(): lê uma linha digitada pelo usuário no console.
    - ?.toIntOrNull(): converte o texto lido para inteiro ou retorna null se não for possível.

when (escolha):
    - when: estrutura condicional que executa diferentes blocos de código conforme o valor de escolha.
    - escolha: variável analisada.
    - ->: indica a ação a ser executada para cada valor.

chamarSenha(), verSaldo(), verExtrato(), fazerSaque(), fazerDeposito(), fazerTransferencia(), sair():
    - fun: define uma função.
    - nome da função: identifica a ação a ser executada.
    - (): indica que a função não recebe parâmetros.

null:
    - null: valor nulo, usado para indicar ausência de valor.
*/

// 1- Ao acessar o sistema, pergunte o nome do usuário e diga "Olá {Nome} é um prazer ter você por aqui!"
//
// 2- Na função "inicio", utilize escolha/caso (switch/case) para validar a opção escolhida pelo usuário.
//
// 3- Sempre que o usuário for sacar dinheiro, o valor restante não pode ser negativo, ou seja, caso o
// usuário tente sacar mais do que tem em saldo, a ação não deve ocorrer. Exiba uma mensagem de "Operação não autorizada".
//
// 4- Sempre que o usuário for sacar dinheiro, o valor a ser sacado não pode ser igual ou menor que zero. Exiba uma mensagem
// de "Operação não autorizada".
//
// 5- Adicionar a opção para ver o extrato (Coloque algumas compras ou depósitos fictícios).
//
// 6- Adicionar a opção para fazer uma transferência. A transferência consiste em você informar o número de uma conta (pode ser
// qualquer número, mas obrigatoriamente um número, ou seja, nenhum outro caractere deve ser aceito), perguntar o valor da
// transferência e remover o valor da conta da mesma forma como na ação do saldo. Caso o usuário tente transferir mais do
// que tem em saldo, a ação não deve ocorrer. Exiba uma mensagem de "Operação não autorizada".
//
// 7- Sempre que o usuário for transferir dinheiro,  o valor a ser transferido não pode ser igual ou menor que zero, ou seja,
// caso o usuário tente transferir mais do que tem em saldo, a ação não deve ocorrer. Exiba uma mensagem de "Operação não autorizada".
//
// 8- No menu principal, a ordem das opções deve ser: Saldo, Extrato, Saque, Depósito, Transferência e Sair.
//
// 9- Atualize a função "erro" com as novas opções do menu.
//
// 10- Caso o usuário informe um valor para depósito igual ou menor que zero, não deixe a operação ocorrer.
// Exiba uma mensagem de "Operação não autorizada".
//
// 11- Sempre que o usuário for acessar o saldo, sacar, retirar o extrato ou transferir dinheiro é necessário que ele informe uma senha.
// Essa senha deve ser validada com uma condicional. A senha é 3589.
//
// 12- Caso a senha informada não seja a correta, é necessário chamar a função atual novamente.
//
// 13- Quando o usuário escolher sair do sistema, exiba uma mensagem agradecendo por utilizar os serviços do banco:
// "{Nome}, foi um prazer ter você por aqui!".

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