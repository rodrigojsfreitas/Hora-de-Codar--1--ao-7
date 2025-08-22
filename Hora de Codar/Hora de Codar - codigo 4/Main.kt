fun main() {
    println("Escreva qual área quer calcular:")
    println("1. Retângulo")
    println("2. Quadrado")
    println("3. Losango")
    println("4. Trapézio")
    println("5. Paralelogramo")
    println("6. Triângulo"); println("7. Círculo")
    var r = readln()
    when(r){
        "1" -> re()
        "2"-> qu()
        "3"-> lo()
        "4" -> tr()
        "5"-> par()
        "6"-> tri(); "7" -> cir()
    }
}

fun re(){
    println("Qual é o tamanho da base")
    var b = readln().toInt()
    println("Qual é o tamanho da altura")
    var a = readln().toInt()
    print("A área do retângulo é ${b*a}")
}
fun qu(){
    println("Qual é o tamanho do lado")
    var l = readln().toInt()
    print("A área do quadrado é ${l*l}")

}
fun lo(){
    println("Qual é o tamanho da diagonal maior")
    var dma = readln().toInt()
    println("Qual é o tamanho da diagonal menor")
    var dme = readln().toInt()
    print("A área do losango é ${(dma*dme)/2}")
}
fun tr(){
    println("Qual é o tamanho da base maior")
    var bma = readln().toInt()
    println("Qual é o tamanho da base menor")
    var bme = readln().toInt()
    println("Qual é o tamanho da altura")
    var a = readln().toInt()
    print("A área do trapézio é ${((bma+bme)*a)/2}")
}
fun par(){
    println("Qual é o tamanho da base")
    var b = readln().toInt()
    println("Qual é o tamanho da altura")
    var a = readln().toInt()
    print("A área do paralelograma é ${b*a}")
}
fun tri(){
    println("Qual é o tamanho da base")
    var b = readln().toInt()
    println("Qual é o tamanho da altura")
    var a = readln().toInt()
    print("A área do triângulo é ${(b*a)/2}")
}
fun cir(){
    println("Qual é o tamanho do raio")
    var r = readln().toInt()
    print("A área do círculo é ${3.14159*(r*r)}")
}