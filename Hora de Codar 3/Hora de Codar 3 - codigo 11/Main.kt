fun main() {
    var n  = 0
    var con = 0
    for ( x in 1..10){
        println("Escreva o número $x")
        n = readln()!!.toInt()
        if (n <= 42 && n >= 24){
            con+=1
        }
    }
println("Você escreveu $con números entre 24 e 42")

}