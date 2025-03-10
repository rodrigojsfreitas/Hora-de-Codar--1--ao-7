fun main() {
    println("Escreva a primeira nota")
    var nota1 = readln().toFloat()
    while(0 > nota1 || nota1 > 10){
        println("Escreva de novo a nota")
        nota1 = readln().toFloat()
    }
    println("Escreva a segunda nota")
    var nota2 = readln().toFloat()
    while(0 > nota2 || nota2 > 10){
        println("Escreva de novo a nota")
        nota2 = readln().toFloat()
    }
    println("Escreva a terceira nota")
    var nota3 = readln().toFloat()
    while(0 > nota3 || nota3 > 10){
        println("Escreva de novo a nota")
        nota3 = readln().toFloat()
    }
    println("Escreva a quarta nota")
    var nota4 = readln().toFloat()
    while(0 > nota4 || nota4 > 10){
        println("Escreva de novo a nota")
        nota4 = readln().toFloat()
    }

    println("Escreva a quinta nota")
    var nota5 = readln().toFloat()
    while(0 > nota5 || nota5 > 10){
        println("Escreva de novo a nota")
        nota5 = readln().toFloat()
    }

    println("Escreva a sexta nota")
    var nota6 = readln().toFloat()
    while(0 > nota6 || nota6 > 10){
        println("Escreva de novo a nota")
        nota5 = readln().toFloat()
    }

    var soma = nota1 + nota2 + nota3 + nota4 + nota5 + nota6
    var media = soma/6
    print("A média das notas é $media")
}