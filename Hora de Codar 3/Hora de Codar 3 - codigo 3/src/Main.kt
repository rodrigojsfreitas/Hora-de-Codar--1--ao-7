fun main() {
    var num = 10
    while (num > 0) {
        if (num == 1) {
            print("$num")
            break
        }
        print("$num, ")
        num -= 1
    }
}