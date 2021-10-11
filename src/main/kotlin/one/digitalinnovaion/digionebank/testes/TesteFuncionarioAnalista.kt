package one.digitalinnovaion.digionebank.testes

import one.digitalinnovaion.digionebank.Analista

fun main() {
    val joao = Analista("Allan M.", "123456789", 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}