package one.digitalinnovaion.digionebank.testes

import one.digitalinnovaion.digionebank.Funcionario
import one.digitalinnovaion.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val allan = Pessoa("Allan", "1203456789")
    println(allan.nome)
    println(allan.cpf)

    val joao = Funcionario("Allan M.", "123456789", BigDecimal.valueOf(1000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}