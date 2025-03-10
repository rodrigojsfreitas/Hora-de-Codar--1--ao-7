fun main() {
    var con = 0
    var num = 100
    while(con <=10){
        con+=1
        num+=1
        if (con == 10){
            print("$num")
            break
        }

        print("$num, ")
    }
}