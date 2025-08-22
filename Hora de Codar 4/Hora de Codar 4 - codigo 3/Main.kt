fun main() {
    val barraca = mutableListOf("Maça", "Melancia", "Pera", "Abacate")
    var r1: String
    while(barraca.size > 0){
        for (x in barraca){
            print(" $x ")
        }
        println("\n Escreva uma fruta")

        r1 = readln()
        if (barraca.indexOf(r1) >= 0){
            println("Você quer excluir um item? Escreva a fruta novamtente para confirmar")
            r1 = readln()
            if (barraca.indexOf(r1) >= 0){
                barraca.removeAt(barraca.indexOf(r1))
            }

            }else{
                print("Item indisponível\n")
        }
    }
    println("Lista de compras finalizada")
}