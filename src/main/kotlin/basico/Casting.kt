package basico

fun main() {

 //smart Cast
    podeMostrarStringOuSoma("Huelton")


}

fun podeMostrarStringOuSoma(x: Any) {
    when(x) {
        is String -> println(x.toUpperCase())
        is Int -> println(x.plus(3))
        else -> println("Isso é diferente de String e Inteiro")
    }
}