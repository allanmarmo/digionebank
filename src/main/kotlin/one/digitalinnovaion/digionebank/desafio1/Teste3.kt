package one.digitalinnovaion.digionebank.desafio1

fun main() {
    //continue a solução
    /*fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',', '.')
    val r = readLine()!!.toFloat()
    var i = 0F
    val diferenca: Float

    if (r > 2000) {
        diferenca = r - 2000
        i = (diferenca * 0.08).toFloat()

    } else if (r > 3000) {
        i = (1000 * 0.08).toFloat()
        diferenca = r - 3000
        i += diferenca * 18

    } else if (r <= 4500) {
        i = (1000 * 0.08 + 1500 * 0.18).toFloat()
        diferenca = r - 4500
        i += diferenca + 28

    } else if (r > 4500) {
        i = (1000 * 0.08 + 1500 * 0.18).toFloat()
        diferenca = r - r
        i += diferenca + 28
    }

    if (i <= 0F) println("Isento") else println("R$ ${i.format(2)}")*/

    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',', '.')

    val r = readLine()!!.toFloat()
    var i = 0F
    val d: Float

    if (r > 4500) {
        i = (1000 * 0.08 + 1500 * 0.18).toFloat()
        d = r - 4500
        i += (d * 0.28).toFloat()
    } else if (r <= 4500) {
        i = (1000 * 0.08 + 1500 * 0.18).toFloat()
        d = r - 4500
        i += (d * 0.18).toFloat()
    } else if (r > 3000) {
        i = (1000 * 0.08).toFloat()
        d = r - 3000
        i += (d * 0.18).toFloat()
    } else if (r > 2000) {
        d = r - 2000
        i = (d * 0.08).toFloat()
    }

    /*if (valor > 2000) {
        diferenca = valor - 2000
        imposto = (diferenca * 0.08).toFloat()

    } else if (valor > 3000) {
        imposto = (1000 * 0.08).toFloat()
        diferenca = valor - 3000
        imposto += (diferenca * 0.18).toFloat()

    } else if (valor <= 4500) {
        imposto = (1000 * 0.08 + 1500 * 0.18).toFloat()
        diferenca = valor - 4500
        imposto += (diferenca * 0.28).toFloat()

    } else if (valor > 4500) {
        imposto = (1000 * 0.08 + 1500 * 0.18).toFloat()
        diferenca = valor - 4500
        imposto += (diferenca * 0.28).toFloat()
    }*/

    if (i == 0f) println("Isento") else println("R$ ${i.format(2)}")
}