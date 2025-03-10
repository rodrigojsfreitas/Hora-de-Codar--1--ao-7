println("Qual é seu ano de nascimento?")
var birthdat = readln()!!.toInt()
if ( 18 <= (2025 - birthdat)){
    println("Você é maior de idade")
}else {
    println("Você é menor de idade")
}