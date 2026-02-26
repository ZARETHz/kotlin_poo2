class Descuento {
    var monto: Double = 0.0

    fun calcularDescuento(): Double {
        return when {
            monto < 1000.0 -> 0.0
            monto < 3000.0 -> monto * 0.10
            else -> monto * 0.20
        }
    }

    fun totalAPagar(): Double {
        return monto - calcularDescuento()
    }
}

fun main() {
    val compra = Descuento()
    compra.monto = 3200.0
    println(compra.calcularDescuento())
    println(compra.totalAPagar())
}