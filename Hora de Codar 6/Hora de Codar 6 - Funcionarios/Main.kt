// Define a classe 'notas' para armazenar nome, salário e matrícula de um funcionário
data class notas(var Nome: String, var Salario: Double,var Matricula: Int)
// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Cria uma lista mutável de funcionários do tipo 'notas'
    var registro = mutableListOf<notas>()
    // Adiciona funcionários à lista
    for (i in 1..5){
        registro.add(notas("Enzo", 1.4,12))}
    for (i in 1..5){
        registro.add(notas("Gabriel", 2.1, 24))}
    for (i in 1..5){
        registro.add(notas("Andressa", 1.7,43))}
    // Ordena a lista de funcionários pela matrícula
    registro.sortBy { notas -> notas.Matricula}
    // Exibe todos os funcionários cadastrados
    println(registro)
    // Solicita ao usuário o número da matrícula que deseja consultar
    println("Qual o número da matrícula?")
    var r = readln().toIntOrNull()
    // Percorre a lista e exibe os dados do funcionário conforme o salário
    registro.forEach {
        if(it.Salario > 1 && it.Matricula == r){
            println("Maiores que mil reais:")
            println("Nome: ${it.Nome}")
            println("Salário: ${it.Salario}\n")
            println("Matrícula: ${it.Matricula}")
        }else if(it.Salario < 1 && it.Matricula == r){
            println("Menores que mil reais:")
            println("Nome: ${it.Nome}")
            println("Salário: ${it.Salario}\n")
            println("Matrícula: ${it.Matricula}")
        }else if(it.Salario == 1.0 && it.Matricula == r){
            println("Iguais a mil reais:")
            println("Nome: ${it.Nome}")
            println("Salário: ${it.Salario}\n")
            println("Matrícula: ${it.Matricula}")
        }
    }

}