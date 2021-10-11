package one.digitalinnovaion.digionebank.testes

import one.digitalinnovaion.digionebank.Gerente

fun main() {
    val geisa = Gerente("Geisa M.", "123456789", 5000.0)
    ImprimeRelatorioFuncionario.imprime(geisa)
}