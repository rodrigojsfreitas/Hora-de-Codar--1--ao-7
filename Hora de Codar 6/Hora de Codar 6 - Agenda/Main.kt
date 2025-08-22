// Define a classe 'agenda' para armazenar nome, número e endereço de um contato
data class agenda(var Nome: String, var Numero: Int, var endereço : String)
// Função principal do programa Kotlin. Todo programa começa por aqui.
fun main() {
    // Cria uma lista mutável de contatos do tipo 'agenda'
    var registro = mutableListOf<agenda>()
    // Adiciona vários contatos à lista
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
    // Ordena a lista de contatos pelo nome
    registro.sortBy { agenda -> agenda.Nome}
    // Exibe todos os contatos cadastrados
    println(registro)
    // Solicita ao usuário o nome que deseja procurar
    println("Quem você está procurando?")
    var r = readln()
    // Percorre a lista e exibe os dados do contato se o nome for igual ao procurado
    registro.forEach {
        if(it.Nome.uppercase() == r.uppercase()){
            println("Nome: ${it.Nome} \nNúmero: ${it.Numero} \n Endereço: ${it.endereço}")
            readln() // Aguarda o usuário pressionar Enter
        }
    }

}