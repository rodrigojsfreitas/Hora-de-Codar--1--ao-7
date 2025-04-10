data class notas(var Nome: String, var Nota: Int)
fun main() {
    var registro = mutableListOf<notas>()
    for (i in 1..5){
    registro.add(notas("Enzo", 8))}
    for (i in 1..5){
        registro.add(notas("Gabriel", 3))}
    for (i in 1..5){
        registro.add(notas("Andressa", 5))}
    for (i in 1..5){
        registro.add(notas("Maycon", 7))}
    registro.sortBy { notas -> notas.Nome}
    println(registro)
    println("Quem você está procurando?")
    var r = readln()

    registro.forEach {
        if(it.Nome.uppercase() == r.uppercase()){
            var aprovado = if(it.Nota > 5) "Aprovado" else "Reprovado"
            println("Nome: ${it.Nome} \nNota: ${it.Nota} \n Status: $aprovado")
            readln()
        }
    }

}