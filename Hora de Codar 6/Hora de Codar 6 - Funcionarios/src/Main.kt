data class notas(var Nome: String, var Salario: Double,var Matricula: Int)
fun main() {
    var registro = mutableListOf<notas>()
    for (i in 1..5){
        registro.add(notas("Enzo", 1.4,12))}
    for (i in 1..5){
        registro.add(notas("Gabriel", 2.1, 24))}
    for (i in 1..5){
        registro.add(notas("Andressa", 1.7,43))}
    registro.sortBy { notas -> notas.Matricula}
    println(registro)
println("Qual o número da matrícula?")
    var r = readln().toIntOrNull()
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