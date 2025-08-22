// Define a classe 'notas' para armazenar nome e nota de um aluno
data class notas(var Nome: String, var Nota: Int)
// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Cria uma lista mutável de alunos do tipo 'notas'
    var registro = mutableListOf<notas>()
    // Adiciona alunos à lista
    for (i in 1..5){
        registro.add(notas("Enzo", 8))}
    for (i in 1..5){
        registro.add(notas("Gabriel", 3))}
    for (i in 1..5){
        registro.add(notas("Andressa", 5))}
    for (i in 1..5){
        registro.add(notas("Maycon", 7))}
    // Ordena a lista de alunos pelo nome
    registro.sortBy { notas -> notas.Nome}
    // Exibe todos os registros cadastrados
    println(registro)
    // Solicita ao usuário o nome do aluno que deseja procurar
    println("Quem você está procurando?")
    var r = readln()
    // Percorre a lista e exibe os dados do aluno se o nome for igual ao procurado
    registro.forEach {
        if(it.Nome.uppercase() == r.uppercase()){
            // Verifica se o aluno foi aprovado ou reprovado
            var aprovado = if(it.Nota > 5) "Aprovado" else "Reprovado"
            println("Nome: ${it.Nome} \nNota: ${it.Nota} \n Status: $aprovado")
            readln() // Aguarda o usuário pressionar Enter
        }
    }

}