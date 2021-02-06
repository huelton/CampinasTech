package basico.controle

fun main() {

    val numeros = listOf(2.4, 3.6, 5.2)
    // criando a minha lista
    val valores: MutableList<Double> = mutableListOf()

    for (valor in valores) {
        println("valor do produto: $valor")
    }
    for ((xpto, numero) in numeros.withIndex()) {
        println("posicao: ${xpto + 1} - $numero")
    }


}