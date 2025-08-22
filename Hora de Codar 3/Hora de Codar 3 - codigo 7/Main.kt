// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Solicita a primeira nota e converte para float
    println("Escreva a primeira nota")
    var nota1 = readln().toFloat()
    // Valida se a nota está entre 0 e 10
    while(0 > nota1 || nota1 > 10){
        println("Escreva de novo a nota")
        nota1 = readln().toFloat()
    }
    // Solicita a segunda nota e valida
    println("Escreva a segunda nota")
    var nota2 = readln().toFloat()
    while(0 > nota2 || nota2 > 10){
        println("Escreva de novo a nota")
        nota2 = readln().toFloat()
    }
    // Solicita a terceira nota e valida
    println("Escreva a terceira nota")
    var nota3 = readln().toFloat()
    while(0 > nota3 || nota3 > 10){
        println("Escreva de novo a nota")
        nota3 = readln().toFloat()
    }
    // Solicita a quarta nota e valida
    println("Escreva a quarta nota")
    var nota4 = readln().toFloat()
    while(0 > nota4 || nota4 > 10){
        println("Escreva de novo a nota")
        nota4 = readln().toFloat()
    }
    // Solicita a quinta nota e valida
    println("Escreva a quinta nota")
    var nota5 = readln().toFloat()
    while(0 > nota5 || nota5 > 10){
        println("Escreva de novo a nota")
        nota5 = readln().toFloat()
    }
    // Solicita a sexta nota e valida
    println("Escreva a sexta nota")
    var nota6 = readln().toFloat()
    while(0 > nota6 || nota6 > 10){
        println("Escreva de novo a nota")
        nota6 = readln().toFloat()
    }
    // Calcula a soma e a média das notas
    var soma = nota1 + nota2 + nota3 + nota4 + nota5 + nota6
    var media = soma/6
    // Exibe a média das notas
    print("A média das notas é $media")
}