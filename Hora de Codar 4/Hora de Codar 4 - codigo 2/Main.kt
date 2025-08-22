// Plutão não é planeta!!!!!!!!!!!
fun main() {
    val planetas = listOf("Mercúrio", "Vênus", "Terra","Marte", "Júpiter", "Saturno", "Urano", "Netuno")
    println("Escreva um planeta: ")
    var pergunta = readln()
    if (planetas.indexOf(pergunta) > -1){
        print("O planeta ${pergunta} é o ${planetas.indexOf(pergunta)+1}° do sistema solar")
    }else{
        println("O que você escreve")
    }

}