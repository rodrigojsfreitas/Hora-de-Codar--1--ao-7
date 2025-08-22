fun main() {
    println("Escreva um número:")
    var numero1 = readln()!!.toInt()
    var n = 1
    while(numero1 < 1){ println("Escreva um número maior do que um"); numero1 = readln()!!.toInt()
    }
    while(n <= numero1){
        if (n == numero1){print("$n");break}

        print("$n, ")

        n+=1
    }
}