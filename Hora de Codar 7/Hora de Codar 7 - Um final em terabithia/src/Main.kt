// Hotel Nakatomi Plaza
val hot = "Nakatomi Plaza"
var n : String = ""
var qua = mutableListOf<Int>()
var res = 0
var init = 0
var hosp = mutableListOf<String>()
fun main() {
    if (init < 1){
            init++
        for (x in 1 ..20){
            qua.add(x)
        }
        println("Bem vindo ao $hot")
        println("Qual é o seu nome de usuário?")
        n = readln()
        while(n == "")
            println("Escreva um nome por favor:")
            n = readln()
        println("Qual é sua senha?")
        var s = readln()
        while(s != "2678"){
            println("Senha inválida")
            print("Escreva sua senha novamente: ")
            s = readln()
        }
        println("Bem vindo ao Hotel $hot, $n. É um imenso prazer ter você aqui!")
    }
    menu()
}

fun sair(){
    println("Muito obrigado e até logo, $n")
}
fun menu(){
    println("1.      Diária       ")
    println("2.    Hospedagem     ")
    println("3.      Evento       ")
    println("4.   Abastecimento   ")
    println("5.  Ar-condicionado  ")
    println("6.        Sair       ")
    var resp = readlnOrNull()
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

fun error(){
    println("Resposta inválida")
    menu2()
}

fun voltar(){
    main()
}

fun erro(){
    println("Resposta inválida")
    main()
}

fun diaria(){
    println("Qual é o valor padrão da diária")
    var d = readln()
    while (d.toFloatOrNull() == null){
        println("Digite somente números números, por favor")
        d = readln()}
    var dia = d.toFloat()
    if (dia < 0){
        println("Valor inválido, $n")
        diaria()
    }
    println("Quantas diarias são necessarias")
    var da = readln()
    while(da.toIntOrNull() == null){
        println("Digite apenas núemros")
        da = readln()
    }
    while(da.toInt() < 0){
        println("Valor inválido, $n")
        println("Escreva novamente.")
        da = readln()
        while(da.toIntOrNull() == null){
            println("Digite apenas núemros")
            da = readln()
        }
    }
    var diaa = da.toInt()
    var n1 = ""
    var listh = mutableListOf<String>()
    var pe : Int = 0
    var pv: Int = 0
    var ma = 0
    var mai = ""
    while(true){
        println("Qual é o nome do hospede")
        n1 = readln()
        if (n1.uppercase() == "PARE"&& pe + pv != 0){
            break
        }
        while (n1 == ""|| n1.uppercase() == "PARE"){
            println("Escreva um nome")
            n1 = readln()
        }

        println("Qual é a idade do hospede")
        var i = readln().toIntOrNull()
        while(i == null || i < 0){
            println("Qual é a idade do hospede")
            var i = readln().toIntOrNull()
        }
        listh.add(n1)
        if (6 <= i && 60 > i){
            if (ma == 0){
                mai = n1
                ma++
            }
            println("$n1 cadastrado(a) com sucesso")
            pe ++
        } else if (i < 6){
            println("$n1 cadastrado(a) com sucesso. $n1 possui gratuidade")
        }else{
            if (ma == 0){
                mai = n1
                ma++
            }
            println("$n1 cadastrado(a) com sucesso. $n1 paga meia")
            pv++
        }
    }
    println("O valor de $da dias de hospedagem é de R$${diaa*((dia*pe)+(pv* dia)/2)}")
    quarto()
    while (qua.indexOf(res) < 0){
        println("Quarto ocupado")
        quarto()
    }
    println("Quarto livre")

    print("$n, você confirma a hospedagem para ")
    var conn = 0
    for (x in listh){
        conn++
        if(conn >= listh.size){
            print(x)
        }else{
            print("$x, ")
        }
    }
    println(" por $diaa dias para o quarto $res por R$${diaa * ((dia * pe) + (pv * dia) / 2)}? (S/N)")
    var conf = readln()
    while(conf.uppercase() != "S" && conf.uppercase() != "N"){
        println("Resposta inválida, responda novamente: (S/N)")
        conf = readln()
    }
    if (conf.uppercase() == "S"){
        println("$n, Reserva efetuada por ${mai}")
        qua.remove(res)
    }else if (conf.uppercase() == "N"){
        println("Reserva cancelada")
        main()
    }
    for (x in 1..20){
        if (qua.indexOf(x) < 0){
            println("$x - O quarto está ocupado")
        }else {
            println("$x - O quarto está livre")
        }
    }
    main()
}

fun quarto(){    println("Qual o quarto para reserva? (1-20)?")
    var re = readln()
    while(re.toIntOrNull() == null){
        println("Escreva apenas números, por favor")
    }
    res = ve(re)
}

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

fun cadas(){
    if (hosp.size < 15){
    println("Qual o nome do Hóspede? ")
    var n2 = readln()
    while (n2 == ""){
        println("Escreva alguma coisa")
        n2 = readln()
        }
    hosp.add(n2)}else{
        println("Máximo de cadastro atingido")
    }
    menu2()
}

fun pesq(){
    println("Qual o nome do Hóspede")
    var n2 = readln()
    while (n2 == ""){
        println("Escreva alguma coisa")
        n2 = readln()
    }
    if (hosp.indexOf(n2) < 0){
        println("Hóspede $n2 não foi encontrado(a)")
    }else{
        println("Hóspede $n2 foi encontrado(a)")
    }
    menu2()
}

fun listar(){
    var con = 0
    if (hosp.size > 0){
        for (x in hosp){
            con++
            println("$con. Hóspede $x")
        }}else{
            println("Não tem nenhum Hóspede cadastrado")
    }
    menu2()
}

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
        println("$n, Reserva efetuada com sucesso")
        main()
    }else{
        println("$n, Reserva não efetuada")
        main()
    }


}

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
            println("$n, é mais barato abastecer com álcool no posto $paim")
        }else{
            println("$n, é mais barato abastecer com álcool em qualquer posto (O preço é igual)")
        }
    }else{
        if (pgim != "Tanto faz"){
            println("$n, é mais barato abastecer com gasolina no posto $pgim")
        }else{
            println("$n, é mais barato abastecer com gasolina em qualquer posto (O preço é igual)")
        }

    }
    main()
}

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
        println("Deseja informar novos dados, $n? (S/N)")
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