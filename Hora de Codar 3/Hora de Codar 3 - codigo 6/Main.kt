// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Inicializa a variável de controle para continuar o processo
    var con = "S"
    // Inicializa o contador de alunos aprovados
    var a = 0
    // Enquanto o usuário quiser continuar
    while(con == "S"){
        // Solicita a primeira nota e converte para float
        println("Escreva a primeira nota")
        var nota1 = readln()!!.toFloat()
        // Solicita a segunda nota e converte para float
        println("Escreva a segunda nota")
        var nota2 = readln()!!.toFloat()
        // Calcula a média das duas notas
        var média = (nota1 + nota2)/2
        // Se a média for maior ou igual a 9.5, considera aprovado
        if (média >= 9.5){
            println("O aluno passou!!")
            a+=1
        }
        // Pergunta se deseja continuar
        print("Você quer continuar? ")
        con = readln()
    }
    // Exibe o total de alunos aprovados
    println("$a alunos passaram")
}
