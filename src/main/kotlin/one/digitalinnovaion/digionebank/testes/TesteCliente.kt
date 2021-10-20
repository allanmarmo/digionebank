package one.digitalinnovaion.digionebank.testes

import one.digitalinnovaion.digionebank.Cliente
import one.digitalinnovaion.digionebank.ClienteTipo

fun main() {
    // Polimorfismo
    val jose = Cliente(
        "Jose da Silva",
        "125.123.456-55",
        ClienteTipo.PJ,
        "123456"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)
}