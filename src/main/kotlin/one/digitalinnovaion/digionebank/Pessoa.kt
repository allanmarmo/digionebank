package one.digitalinnovaion.digionebank

class Pessoa {
    var nome: String = "Allan"

    var cpf: String = "123.123.123-11"
    private set

    inner class Endereco {
        var rua: String = "Rua teste"
    }
}

fun main() {
    val allan = Pessoa()

    println(allan.nome)
    println(allan.cpf)

    println(allan.Endereco().rua)
}