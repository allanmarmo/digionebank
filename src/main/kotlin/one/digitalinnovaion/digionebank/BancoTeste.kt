package one.digitalinnovaion.digionebank

fun main() {
    val digiOneBanck = Banco("DigiOne", 12)

    println(digiOneBanck.nome)
    println(digiOneBanck.numero)

    val banco2 = digiOneBanck.copy(nome = "Allan")

    println(banco2.info())
}