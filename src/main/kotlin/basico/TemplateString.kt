package basico

fun main() {

    val nome = "Huelton"
    val aprovados = listOf("Jose", "Claudia", "Pedro")

    var a : Int = 358.dec()
    var b : String = a.toString()

    println("Int: $a")
    println("Primeiro caracter da String é: ${b.last()}")

    println("Ola ${nome}, usando Template String")
    println("O primeiro colocado é: ${aprovados[0]}")


}

