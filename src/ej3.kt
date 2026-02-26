class Propina {
    var consumo: Double = 0.0

    fun calcularPropina(): Double {
        return when {
            consumo < 500.0 -> consumo * 0.05
            consumo < 1000.0 -> consumo * 0.10
            else -> consumo * 0.15
        }
    }

    fun totalConPropina(): Double {
        return consumo + calcularPropina()
    }
}

fun main() {
    val cuenta = Propina()
    cuenta.consumo = 900.0
    println(cuenta.calcularPropina())
    println(cuenta.totalConPropina())
}