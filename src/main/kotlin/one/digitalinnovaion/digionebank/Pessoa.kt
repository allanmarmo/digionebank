package one.digitalinnovaion.digionebank

class Pessoa {
    var nome: String = "Allan"
    var cpf: String = "123.123.123-11"
}

fun main() {
    val allan = Pessoa()

    println(allan.nome)
    println(allan.cpf)
}