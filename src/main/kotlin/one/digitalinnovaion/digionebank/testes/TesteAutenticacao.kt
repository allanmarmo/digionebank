package one.digitalinnovaion.digionebank.testes

import one.digitalinnovaion.digionebank.Logavel

class TesteAutenticacao {
    // Polimorfismo
    fun autentica(logavel: Logavel) = println(logavel.login())
}