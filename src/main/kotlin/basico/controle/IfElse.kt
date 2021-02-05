package basico.controle

fun main() {
    val nota: Double = 4.0
    val sentimento = true
    // template String com if/else
    //println("Hoje estou ${ if(sentimento) "Alegre" else "Triste" } ")

    when(nota) {
        10.0,9.0 -> println("Ótima nota")
        8.99,7.0 -> println("Boa nota")
        6.99,4.0 -> println("Recuperacao")
        3.99,0.0 -> println("Não Passou")
        else -> println("Nota Invalida")
    }

    val x: Int? = null

    maiorQueDez(x)
}

fun maiorQueDez(x: Int?) {
    if(x == null) {

    }else if( x < 10) {

    }else {

    }
}


fun obterResultado(nota: Double): String = if (nota >= 7.0)"Passou !!" else if(nota >= 5 && nota < 7 ) "Recuperacao" else "Nao passou !!"



