class Comparador {
    var numero1: Int = 0
    var numero2: Int = 0

    fun comparar(): String {
        return when {
            numero1 > numero2 -> "El primer número es mayor"
            numero2 > numero1 -> "El segundo número es mayor"
            else -> "Son iguales"
        }
    }
}

fun main() {
    val comp = Comparador()
    comp.numero1 = 10
    comp.numero2 = 20
    println(comp.comparar())
}