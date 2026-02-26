class ValidadorEdad {
    var edad: Int = 0

    fun categoria(): String {
        return when {
            edad < 18 -> "Menor de edad"
            edad in 18..64 -> "Adulto"
            else -> "Adulto mayor"
        }
    }
}

fun main() {
    val persona = ValidadorEdad()
    persona.edad = 22
    println(persona.categoria()) 
}