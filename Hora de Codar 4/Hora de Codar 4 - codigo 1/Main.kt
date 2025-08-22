fun main() {
        var aluno = ""
        var lista = mutableListOf<String>()
        while (aluno != "PARE") {
            print("Escreva o nome do aluno: ")
            aluno = readln()
            if (aluno == "PARE"){
                break
            }
            lista.add(aluno)
        }
        println("A lista tem ${lista.size} Estudantes")
    var con = 0
        for (x in lista){
            con++
            println("$con. $x")

        }

    }