data class notas(var Nome: String, var Altura: Double)
fun main() {
    var registro = mutableListOf<notas>()
    for (i in 1..5){
        registro.add(notas("Enzo", 1.4))}
    for (i in 1..5){
        registro.add(notas("Gabriel", 2.1))}
    for (i in 1..5){
        registro.add(notas("Andressa", 1.7))}
    registro.sortBy { notas -> notas.Nome}
    println(registro)

    registro.forEach {
        if(it.Altura < 1.5){
            println("Menores que 1.5m:")
            println("Nome: ${it.Nome}")
            println("Altura: ${it.Altura}\n")
        }else if(it.Altura >= 1.5 && it.Altura < 2){
            println("Maiores que 1.5m e menores que 2m:")
            println("Nome: ${it.Nome}")
            println("Altura: ${it.Altura}\n")

        }else if(it.Altura >= 1.5){
            println("Maiores que 1.5m:")
            println("Nome: ${it.Nome}")
            println("Altura: ${it.Altura}\n")
        }
    }

}