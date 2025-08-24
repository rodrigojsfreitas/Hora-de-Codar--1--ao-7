/*
Elementos usados neste arquivo Kotlin:

fun main():
  - fun: palavra‑chave que define uma função.
  - main: nome da função principal, ponto de entrada do programa.
  - (): não recebe parâmetros.

val / var:
  - val: declara variável imutável (somente leitura depois de atribuída).
  - var: declara variável mutável (pode mudar de valor).

Tipos inferidos / explícitos:
  - Kotlin infere tipos (ex: var nome = "João"). Também podemos anotar (ex: var nome: String = "").

Strings e interpolação:
  - "texto" define literais de String.
  - $variavel insere o valor da variável na String.
  - ${expressao} avalia a expressão e insere o resultado.

Listas mutáveis / imutáveis:
  - mutableListOf<T>() cria lista mutável (add, remove, etc.).
  - listOf<T>() cria lista somente leitura.
  - .add(valor), .remove(valor), .removeAt(indice), .indexOf(valor), .size, .forEach { } são operações de coleção.

Loops:
  - for (x in 1..20): laço sobre intervalo fechado (inclui 20).
  - for (x in lista): iteração sobre elementos da lista.
  - while (condicao) { ... }: repete enquanto condição for verdadeira.
  - while(true): laço infinito controlado por break.

Controle de fluxo:
  - if / else if / else: decisões condicionais.
  - when (valor) { "1" -> ... else -> ... }: seleção múltipla (similar a switch).
  - break: sai imediatamente do laço atual.
  - return: (não usado diretamente aqui exceto implicitamente em funções que retornam valor) encerra função retornando valor.

Operadores relacionais:
  - == (igual), != (diferente), > (maior), < (menor), >= (maior ou igual), <= (menor ou igual).

Operadores lógicos:
  - && (E lógico), || (OU lógico), ! (negação – usado indiretamente em comparações compostas).

Operadores aritméticos:
  - + adição, - subtração, * multiplicação, / divisão, % resto (usado na verificação g % 1 == 0.0).

Conversões e validação numérica:
  - readln(): lê uma linha do console (String).
  - toIntOrNull(), toFloatOrNull(): convertem String para Int/Float ou retornam null se inválido.
  - uppercase(): converte String para MAIÚSCULAS (facilita comparação sem case sensitive).

Formatação numérica:
  - String.format("%.2f", numero): formata número com 2 casas decimais.

Funções utilitárias definidas no arquivo:
  - sair(): encerra fluxo exibindo mensagem.
  - menu(), menu2(): exibem menus e direcionam escolhas.
  - diaria(): calcula custo de hospedagem aplicando regras de gratuidade / meia.
  - quarto(): captura número de quarto e valida.
  - ve(a: String): valida e converte String para Int dentro de faixa (1..20).
  - cadas(): cadastra hóspede em lista global (limite 15).
  - pesq(): busca hóspede pelo nome.
  - listar(): lista hóspedes cadastrados.
  - evento(): calcula e reserva auditório conforme número de convidados, agenda, custos (garçons + buffet).
  - abastecimento(): compara preços de combustíveis entre dois postos.
  - air(): compara orçamentos de instalação de ar-condicionado com desconto condicional.
  - proc(): registra orçamento (empresa e dados) em lista aremp.
  - veint(), vefloat(), vefloatcent(): validam e convertem valores numéricos específicos (inteiros, floats, percentuais).
  - vsn(): valida resposta Sim/Não.

Estruturas de dados auxiliares:
  - hospedes: MutableList<String> para nomes.
  - quartos: MutableList<Int> com números de quartos disponíveis.
  - aremp: MutableList<List<String>> armazena detalhes de orçamentos de empresas.

Tratamento de entradas:
  - Loops while com toIntOrNull() / toFloatOrNull() para insistir até receber valor válido.
  - Comparações de String usando uppercase() para ignorar diferenças de maiúsculas/minúsculas.

Cálculos específicos:
  - Hospedagem: valor total = dias * ((diária * inteiros) + (meias * diária)/2).
  - Evento: garçons = ceil(convidados / 12). Custos de componentes somados e formatados.
  - Abastecimento: regra econômica compara (gasolina * 0.7) com preço do álcool.
  - Ar-condicionado: aplica desconto somente se quantidade >= mínima: total = (valor * quantidade)*(1 - desconto).

Boas práticas ilustradas:
  - Validação de entrada antes de usar valores numéricos.
  - Separação de responsabilidades em funções menores.
  - Uso de listas para estado global simples.
*/

// A tarefa é muito grande, então confira as perguntas no perguntas-7.md

// Hotel Nakatomi Plaza
// Declaração de variáveis globais
val hotel = "Nakatomi Plaza" // Nome do hotel
var nome : String = "" // Nome do usuário
var quartos = mutableListOf<Int>() // Lista de quartos disponíveis
var reserva = 0 // Quarto reservado
var init = 0 // Controle de inicialização
var hospedes = mutableListOf<String>() // Lista de hóspedes

// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Inicializa a lista de quartos e faz login do usuário
    if (init < 1){
        init++
        for (x in 1 ..20){
            quartos.add(x)
        }
        println("Bem vindo ao $hotel")
        println("Qual é o seu nome de usuário?")
        nome = readln()
        while(nome == ""){
            println("Escreva um nome por favor:")
            nome = readln()
        }
        println("Qual é sua senha?")
        var s = readln()
        while(s != "2678"){
            println("Senha inválida")
            print("Escreva sua senha novamente: ")
            s = readln()
        }
        println("Bem vindo ao Hotel $hotel, $nome. É um imenso prazer ter você aqui!")
    }
    menu()
}

// Função para sair do sistema
fun sair(){
    println("Muito obrigado e até logo, $nome")
}

// Função que exibe o menu principal e trata a escolha do usuário
fun menu(){
    println("1.      Diária       ")
    println("2.    Hospedagem     ")
    println("3.      Evento       ")
    println("4.   Abastecimento   ")
    println("5.  Ar-condicionado  ")
    println("6.        Sair       ")
    var resp = readlnOrNull()
    // Estrutura condicional para tratar a escolha
    when (resp){
        "1" -> diaria()
        "2" -> menu2()
        "3" -> evento()
        "4" -> abastecimento()
        "5" -> air()
        "6" -> sair()
        else -> erro()
    }
}

// Função para menu de hospedagem
fun menu2(){
    println("1.   Cadastrar   ")
    println("2.   Pesquisar   ")
    println("3.     Listar    ")
    println("4.     Voltar    ")
    println("5.      Sair     ")
    var resp = readln()
    when (resp){
        "1" -> cadas()
        "2" -> pesq()
        "3" -> listar()
        "4" -> voltar()
        "5" -> sair()
        else -> error()
    }
}

// Função para tratar erro no menu2
fun error(){
    println("Resposta inválida")
    menu2()
}

// Função para voltar ao menu principal
fun voltar(){
    main()
}

// Função para tratar erro no menu principal
fun erro(){
    println("Resposta inválida")
    main()
}

// Função para calcular valor da diária e cadastrar hóspedes
fun diaria(){
    println("Qual é o valor padrão da diária")
    var d = readln()
    while (d.toFloatOrNull() == null){
        println("Digite somente números, por favor")
        d = readln()
    }
    var dia = d.toFloat()
    if (dia < 0){
        println("Valor inválido, $nome")
        diaria()
    }
    println("Quantas diárias são necessárias")
    var da = readln()
    while(da.toIntOrNull() == null){
        println("Digite apenas números")
        da = readln()
    }
    while(da.toInt() < 0){
        println("Valor inválido, $nome")
        println("Escreva novamente.")
        da = readln()
        while(da.toIntOrNull() == null){
            println("Digite apenas números")
            da = readln()
        }
    }
    var diaa = da.toInt()
    var n1 = ""
    var listh = mutableListOf<String>()
    var hinteira : Int = 0 // Contador de hóspedes pagantes
    var hmeia: Int = 0 // Contador de hóspedes meia
    var primeiroh = 0 // Controle do primeiro hóspede
    var primeirohnome = "" // Nome do primeiro hóspede
    // Cadastro de hóspedes
    while(true){
        println("Qual é o nome do hóspede")
        n1 = readln()
        if (n1.uppercase() == "PARE"&& hinteira + hmeia != 0){
            break
        }
        while (n1 == ""|| n1.uppercase() == "PARE"){
            println("Escreva um nome")
            n1 = readln()
        }
        println("Qual é a idade do hóspede")
        var i = readln().toIntOrNull()
        while(i == null || i < 0){
            println("Qual é a idade do hóspede")
            i = readln().toIntOrNull()
        }
        listh.add(n1)
        if (6 <= i && 60 > i){
            if (primeiroh == 0){
                primeirohnome = n1
                primeiroh++
            }
            println("$n1 cadastrado(a) com sucesso")
            hinteira ++
        } else if (i < 6){
            println("$n1 cadastrado(a) com sucesso. $n1 possui gratuidade")
        }else{
            if (primeiroh == 0){
                primeirohnome = n1
                primeiroh++
            }
            println("$n1 cadastrado(a) com sucesso. $n1 paga meia")
            hmeia++
        }
    }
    // Cálculo do valor total da hospedagem
    println("O valor de $da dias de hospedagem é de R$${diaa*((dia*hinteira)+(hmeia* dia)/2)}")
    quarto()
    while (quartos.indexOf(reserva) < 0){
        println("Quarto ocupado")
        quarto()
    }
    println("Quarto livre")
    print("$nome, você confirma a hospedagem para ")
    var conn = 0
    for (x in listh){
        conn++
        if(conn >= listh.size){
            print(x)
        }else{
            print("$x, ")
        }
    }
    println(" por $diaa dias para o quarto $reserva por R$${diaa * ((dia * hinteira) + (hmeia * dia) / 2)}? (S/N)")
    var conf = readln()
    while(conf.uppercase() != "S" && conf.uppercase() != "N"){
        println("Resposta inválida, responda novamente: (S/N)")
        conf = readln()
    }
    if (conf.uppercase() == "S"){
        println("$nome, Reserva efetuada por ${primeirohnome}")
        quartos.remove(reserva)
    }else if (conf.uppercase() == "N"){
        println("Reserva cancelada")
        main()
    }
    for (x in 1..20){
        if (quartos.indexOf(x) < 0){
            println("$x - O quarto está ocupado")
        }else {
            println("$x - O quarto está livre")
        }
    }
    main()
}

// Função para escolher o quarto
fun quarto(){
    println("Qual o quarto para reserva? (1-20)?")
    var re = readln()
    while(re.toIntOrNull() == null){
        println("Escreva apenas números, por favor")
        re = readln()
    }
    reserva = ve(re)
}

// Função para validar número do quarto
fun ve(a:String): Int {
    var  v = a
    while (v.toIntOrNull() == null){
        println("Escreva apenas números, por favor")
        v = readln()
    }
    while(v.toInt() <= 0 || v.toInt() > 20){
        println("Escreva um número adequado, por favor")
        v = readln()
        while (v.toIntOrNull() == null){
            println("Escreva apenas números, por favor")
            v = readln()
        }
    }
    var ai = v.toInt()
    return(ai)
}

// Função para cadastrar hóspedes
fun cadas(){
    if (hospedes.size < 15){
        println("Qual o nome do Hóspede? ")
        var n2 = readln()
        while (n2 == ""){
            println("Escreva alguma coisa")
            n2 = readln()
        }
        hospedes.add(n2)
    }else{
        println("Máximo de cadastro atingido")
    }
    menu2()
}

// Função para pesquisar hóspedes
fun pesq(){
    println("Qual o nome do Hóspede")
    var n2 = readln()
    while (n2 == ""){
        println("Escreva alguma coisa")
        n2 = readln()
    }
    if (hospedes.indexOf(n2) < 0){
        println("Hóspede $n2 não foi encontrado(a)")
    }else{
        println("Hóspede $n2 foi encontrado(a)")
    }
    menu2()
}

// Função para listar hóspedes
fun listar(){
    var con = 0
    if (hospedes.size > 0){
        for (x in hospedes){
            con++
            println("$con. Hóspede $x")
        }
    }else{
        println("Não tem nenhum Hóspede cadastrado")
    }
    menu2()
}

// Função para reservar evento
fun evento(){
    println("Qual é o número de convidados para o seu evento?")
    var conv = readln().toIntOrNull()
    while (conv == null || conv < 0 || conv > 350){
        if (conv == null){
            println("Escreva somente números")
            conv = readln().toIntOrNull()
        }else if (conv < 0){
            println("Escreva um número positivo")
            conv = readln().toIntOrNull()
        }else if (conv > 350){
            println("Quantidade de convidados superior à capacidade máxima")
            conv = readln().toIntOrNull()
        }
    }
    if (conv <= 220){
        if (conv <= 150){
            if (conv == 150){
                println("Use o máximo do auditório laranja sem precisar  de cadeiras tradicionais")
            }else if (conv == 0){
                println("Use o auditório laranja e aproveite ele sozinho")
            }else{
                println("Use o audiatório laranja e ainda sobra ${150 - conv} lugares")
            }
        }else{if (conv == 220){
            println("Use o máximo do auditório laranja com todas as cadeiras adicionais")
        }else{
            println("Use o auditório laranja (inclua mais ${conv - 150} cadeiras)")
        }

        }
    }else{
        if (conv == 350){
            println("Use o máximo do auditório colorado")
        }else{
            println("Use ${conv} lugares do auditório colorado e ainda sobra ${350 - conv} lugares")
        }
    }
    println("Agora vamos ver a agenda do evento")
    var listsema = listOf("SEGUNDA", "TERÇA", "QUARTA", "QUINTA", "SEXTA", "SABADO", "DOMINGO")
    var reallist = listOf("Segunda","Terça","Quarta","Quinta","Sexta","Sábado","Domingo")
        println("Qual o dia do seu evento?")
        var sema = readln()
        while (sema == ""|| listsema.indexOf(sema.uppercase()) < 0){
                println("Por favor, escreva algum dia da semana")
                sema = readln()
        }
    var dia = 7
    if (sema.uppercase() == "SABADO" || sema.uppercase() == "DOMINGO"){
        println("Qual a hora do seu evento?")
        var dia = readln().toIntOrNull()
        while (dia == null || dia < 7 || dia > 15){
            if (dia == null){
                println("Por favor escreva somente números")
                dia = readln().toIntOrNull()
            }else if (dia <= 0 || dia > 23){
                println("Por favor escreva uma hora válida")
                dia = readln().toIntOrNull()
            }else if (dia < 7){
                println("O auditório estará fechado nesse horário: (07 - 15)")
                dia = readln().toIntOrNull()
            }
        }
    }else{

    println("Qual a hora do seu evento?")
        var dia = readln().toIntOrNull()
        while (dia == null || dia < 7 || dia > 23){
            if (dia == null){
                println("Por favor escreva somente números")
                dia = readln().toIntOrNull()
            }else if (dia <= 0 || dia > 23){
                println("Por favor escreva uma hora válida")
                dia = readln().toIntOrNull()
            }else if (dia < 7){
                println("O auditório estará fechado nesse horário: (07 - 23)")
                dia = readln().toIntOrNull()
            }
        }}
    println("Qual o nome da empresa? ")
    var ne = readln()
    while (ne == "") {
        println("Escreva alguma coisa")
        ne = readln()
    }
    println("Auditório reservado para $ne. ${reallist[listsema.indexOf(sema.uppercase())]} às $dia hrs")
    println("Qual a duração do evento em horas?")
    var hora = readln().toIntOrNull()
    while( hora == null ||  hora <= 0){
        println("Escreva uma hora válida:")
        hora = readln().toIntOrNull()
    }
    var g = conv.toFloat() / 12.0
    if (g % 1 == 0.0){
        var g= g.toInt()
    }else{
        var g = g.toInt() + 1
    }
    println("São necessários $g garçons")
    var cg = 10.50 * g.toFloat() * hora.toFloat()
    var fcg = String.format("%.2f",cg)
    println("Custo: R$$fcg")
    println("Agora vamos calcular o custo do buffet do hotel para o evento")
    var cc = 0.2 * conv.toFloat() * 0.80
    var ca = 0.5 * conv.toFloat() * 0.40
    var cs = (7 * conv).toFloat()/ 100 * 34
    var tob = cc + ca + cs
    var ftob = String.format("%.2f",tob)
    println("Custo do Buffet: R$$ftob")
    var tote = tob + cg
    var ftote = String.format("%.2f", tote)
    println("Valor total do evento: R$$ftote")
    println("Gostaria de efetuar a reserva? S/N")
    var resp = readln()
    while (resp.uppercase() != "S" || resp.uppercase() != "N" ){
        println("Resposta inválida: (S/N)")
        resp = readln()
    }
    if (resp == "S"){
        println("$nome, Reserva efetuada com sucesso")
        main()
    }else{
        println("$nome, Reserva não efetuada")
        main()
    }


}

// Função para abastecimento
fun abastecimento(){
    println("Qual o valor do álcool no posto Wayne Oil")
    var pa = readln().toFloatOrNull()
    while (pa == null || pa <= 0){
        println("Coloque um valor válido:")
        pa = readln().toFloatOrNull()
    }
    println("Qual o valor da gasolina no posto Wayne Oil")
    var pg = readln().toFloatOrNull()
    while (pg == null || pg <= 0){
        println("Coloque um valor válido:")
        pg = readln().toFloatOrNull()
    }
    println("Qual o valor do álcool no posto Stark Petrol")
    var pa2 = readln().toFloatOrNull()
    while (pa2 == null || pa2 <= 0){
        println("Coloque um valor válido:")
        pa2 = readln().toFloatOrNull()
    }
    println("Qual o valor do gasolina no posto Stark Petrol")
    var pg2 = readln().toFloatOrNull()
    while (pg2 == null || pg2 <= 0){
        println("Coloque um valor válido:")
        pg2 = readln().toFloatOrNull()
    }
    var op = listOf("Wayne Oil", "Stark Oil", "Tanto faz")
    var pgi = 0.0.toFloat()
    var pai = 0.0.toFloat()
    var pgim = ""
    var paim = ""
    if (pa > pa2){
        pai = pa2
        paim = op[1]
    }else if (pa == pa2){
        pai = pa2
        paim = op[2]
    }else{
        pai = pa
        paim = op[0]
    }
    if (pg > pg2){
        pgi = pg2
        pgim = op[1]
    }else if (pg == pg2){
        pgi = pg2
        pgim = op[2]
    }else{
        pgi = pg
        pgim = op[0]
    }


    if (pgi*0.7 >= pai){
        if (paim != "Tanto faz"){
            println("$nome, é mais barato abastecer com álcool no posto $paim")
        }else{
            println("$nome, é mais barato abastecer com álcool em qualquer posto (O preço é igual)")
        }
    }else{
        if (pgim != "Tanto faz"){
            println("$nome, é mais barato abastecer com gasolina no posto $pgim")
        }else{
            println("$nome, é mais barato abastecer com gasolina em qualquer posto (O preço é igual)")
        }

    }
    main()
}

// Função para ar-condicionado
fun air(){
    var realval: Float = 0.0.toFloat()
    var compval = 0.0.toFloat()
    var compemp = ""
    var con = 0
    while (true) {
        println("Qual o nome da empresa?")
        var emp = readln()
        println("Qual o valor do aparelho")
        var valap = readln(); var vvalap = vefloat(valap)
        println("Qual a quantidade de aparelhos?")
        var quap = readln(); var vquap = veint(quap)
        println("Qual a porcentagem de desconto?")
        var pordes = readln(); var vpordes = vefloatcent(pordes) / 100
        println("Qual o número mínimo de aparelhos para conseguir o desconto?")
        var miniap = readln(); var vminiap = veint(miniap)
        if (vquap >= vminiap) {
            realval = (vvalap * vquap) * (1.0 - vpordes).toFloat()
        } else {
            realval = vvalap * vquap
        }
        var frealval = String.format("%.2f", realval)
        println("O serviço da empresa $emp custará R$ $frealval")
        if (realval < compval || con == 0){
            compval = realval
            compemp = emp
            con++
        }
        proc(emp, vvalap, vquap, vpordes, vminiap, realval)
        println("Deseja informar novos dados, $nome? (S/N)")
        var resp = readln(); var vresp = vsn(resp)
        if(vresp == "N"){
            break
        }

    }

    println("O orçamento de menor valor é da $compemp por R$$compval")
    main()
}
var aremp = mutableListOf<List<String>>()

fun proc(a: String, b: Float, c: Int, d : Float, e: Int, f: Float){
   var item = listOf("Empresa: $a", "Valor do aparelho: R$$b", "Quantidade de aparelho: $c", "Porcentagem de desconto: ${d*100}%","Quantidade mínima para desconto:$e", "Valor real: R$$f")
    aremp.add(item)
}

fun veint(a: String): Int{
    var v= a.toIntOrNull()
    while( v == null || v <= 0){
        println("Escreva um valor válido")
        v = readln().toIntOrNull()
    }
    return(v)
}

fun vefloat(a: String): Float{
    var v= a.toFloatOrNull()
    while( v == null || v <= 0){
        println("Escreva um valor válido")
        v = readln().toFloatOrNull()
    }
    return(v)
}

fun vefloatcent(a: String): Float{
    var v= a.toFloatOrNull()
    while( v == null || v < 0 || v > 100){
        println("Escreva um valor válido")
        v = readln().toFloatOrNull()
    }
    return(v)
}

fun vsn(a: String): String{
    var v = a.uppercase()
    while(v != "S" && v!= "N"){
        println("Resposta inváldia: (S/N)")
        v = readln()
    }
    return(v)
}