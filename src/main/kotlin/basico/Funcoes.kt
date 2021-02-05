package basico

// funcao sem retorno
fun somaDoisNumeros1(a: Int,b: Int) {
    println("A soma de A e B \" é \": "+ (a+b))
}
// funcao sem retorno
fun somaDoisNumeros2(a: Int, b: Int = 1) {
    println("A soma de A e B é : "+ (a+b))
}

// funcao sem retorno                  //sem retorno
fun somaDoisNumeros3(a: Int, b: Int = 1): Unit {
    val calculo: Int = a + b
    println("A soma de A e B é : "+ calculo)
}


// funcao com retorno
fun multiplicaDoisNumeros1(a: Double, b: Double): Double {
    return a * b
}

// funcao com retorno
fun multiplicaDoisNumeros2(a: Double, b: Double) =  a * b

fun main() {

    val a : Int = 5
    val b : Int = 3

    val nome: String

    val c: Double = 5.0
    val d: Double = 3.0

    somaDoisNumeros1(a,b)
    somaDoisNumeros2(b)

    println("A Multiplicação1 de A e B é: "+ multiplicaDoisNumeros1(c,d))
    println("A Multiplicação2 de A e B é: "+ multiplicaDoisNumeros2(c,d))

    val compras = listOf("Arroz","Feijao","Carne")
    val comprasMutavel: MutableList<String> = mutableListOf()

    println("O valor e "+ multiplicar())

}

fun multiplicar (a: Int = 3) = a * a

