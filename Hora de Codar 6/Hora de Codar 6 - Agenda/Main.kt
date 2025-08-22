data class agenda(var Nome: String, var Numero: Int, var endereço : String)
fun main() {
    var registro = mutableListOf<agenda>()
    registro.add(agenda("Eduard",11221,"Rua pincas"))
    registro.add(agenda("Eduard",11221,"Rua pincas"))
    registro.add(agenda("Eduard",11221,"Rua pincas"))
    registro.add(agenda("Eduard",11221,"Rua pincas"))
    registro.add(agenda("Eduard",11221,"Rua pincas"))
    registro.add(agenda("Bduard",11221,"Rua pincas"))
    registro.add(agenda("Eduard",11221,"Rua pincas"))
    registro.add(agenda("Eduard",11221,"Rua pincas"))
    registro.add(agenda("Eduard",11221,"Rua pincas"))
    registro.add(agenda("Aduard",11221,"Rua pincas"))
    registro.sortBy { agenda -> agenda.Nome}
println(registro)
    println("Quem você está procurando?")
    var r = readln()

    registro.forEach {
        if(it.Nome.uppercase() == r.uppercase()){
            println("Nome: ${it.Nome} \nNúmero: ${it.Numero} \n Endereço: ${it.endereço}")
        readln()
        }
    }

}