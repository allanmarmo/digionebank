package one.digitalinnovaion.digionebank

class Pessoa {
    var nome: String = "Allan"
    var cpf: String = "123.123.123-11"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val allan = Pessoa()
    println(allan.pessoaInfo())
}