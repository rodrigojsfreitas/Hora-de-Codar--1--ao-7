fun main() {
    println("Escreva acione para armar a bomba")
    var ac = readln()
    if (ac == "acione"){
    var bomba = 30
    while (bomba >= 0){
        println(bomba)
        bomba -= 1
    }
    println("Booooooom!!!!!")
    }else {
        print("Nada aconteceu!!!")
    }
}