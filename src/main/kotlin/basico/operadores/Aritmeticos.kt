package basico.operadores

fun main() {

    val (v1, v2, v3, v4) = listOf(3,5,2,15)

    val soma = v1 + v2 + v3 + v4
    val subtracao = v4 - v2
    val divisao = v4 / v1
    val multiplicacao = v2 * v4
    val modulo = v1 % v3

    println("A Soma é: "+soma)
    println("A Subtração de v4 e v2 é: "+subtracao)
    println("A Divisao de v4 e v1 é: "+divisao)
    println("A Multiplicação de v2 e v4 é: "+multiplicacao)
    println("O Modulo de v1 e v3 é: "+multiplicacao)




}