fun main() {
    println("Escreva um número")
    var n = readln()!!.toInt()
    var num = 1
    var con = 0
    while (num <= n){
        println("$num X $con = ${con*num}")
        con+=1

        if(con > 10) {
            con = 0
            num += 1
            println()
            println("-".repeat(100))
            println()
        }

        }
    }
