// Define a classe 'notas' para armazenar nome e altura de uma pessoa
data class notas(var Nome: String, var Altura: Double)
// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Cria uma lista mutável de pessoas do tipo 'notas'
    var registro = mutableListOf<notas>()
    // Adiciona pessoas à lista
    for (i in 1..5){
        registro.add(notas("Enzo", 1.4))}
    for (i in 1..5){
        registro.add(notas("Gabriel", 2.1))}
    for (i in 1..5){
        registro.add(notas("Andressa", 1.7))}
    // Ordena a lista de pessoas pelo nome
    registro.sortBy { notas -> notas.Nome}
    // Exibe todos os registros cadastrados
    println(registro)
    // Percorre a lista e exibe os dados conforme a altura
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