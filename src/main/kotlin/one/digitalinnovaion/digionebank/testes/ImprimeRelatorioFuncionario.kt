package one.digitalinnovaion.digionebank.testes

import one.digitalinnovaion.digionebank.Funcionario

class ImprimeRelatorioFuncionario {
    companion object {
        fun imprime(funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}