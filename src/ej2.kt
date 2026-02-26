class Evaluador {
    var calificacion: Int = 0

    fun resultado(): String {
        return when (calificacion) {
            in 0..5 -> "Reprobado"
            6, 7 -> "Suficiente"
            8, 9 -> "Bueno"
            10 -> "Excelente"
            else -> "Calificación inválida"
        }
    }
}

fun main() {
    val eval = Evaluador()
    eval.calificacion = 5
    println(eval.resultado())
}