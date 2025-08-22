fun main() {
    println("Escreva o primeiro número:")
    var numero1 = readLine()!!.toInt()
    println("Escreva o segundo número:")
    var numero2 = readLine()!!.toInt()
    println("Escreva o terceiro número:")
    var numero3 = readLine()!!.toInt()
    var soma1 = numero1 + numero2
    var soma2 = numero2 + numero3
    var soma3 = numero1 + numero3
    if ( soma1 > soma2 && soma1 > soma3) {
        println("A soma dos dois maiores números é $soma1")
    }
    else if (soma2 > soma1 && soma2 > soma3){
        println("A soma dos dois maiores números é $soma2")
    }
    else{
        println("A soma dos dois maiores números é $soma3")
    }
}