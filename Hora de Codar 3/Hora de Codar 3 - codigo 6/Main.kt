fun main() {
    var con = "S"
    var a = 0
    while(con == "S"){
        println("Escreva a primeira nota")
        var nota1 = readln()!!.toFloat()
        println("Escreva a segunda nota")
        var nota2 = readln()!!.toFloat()
        var média = (nota1 + nota2)/2
        if (média >= 9.5){
            println("O aluno passou!!")
            a+=1}
        print("Você quer continuar? ")
        con = readln()
        }
    println("$a alunos passaram")
    }