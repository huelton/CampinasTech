package basico.operadores

import java.util.*

fun main() {

    println("Huelton" == "Huelton")
    val d1 = Date(0)  // kotlin memoria 78437438
    val d2 = Date(0)  // kotlin memoria 45543343
    println(d1 === d2)
    val teste: Any = (3 != 2) && (3 != 2)
    println("condição "+ teste)
    println(3 < 2)
    println(3 > 2)
    println(3 <= 2)
    println(3 >= 2)

    // visualG (e) e (ou)

    val x : Boolean = true
    val y : Boolean = true

    val z : Boolean = x || y
    val w : Boolean = x && y
    val a : Boolean = (x xor y) xor z

    println("Booleano de Z: "+z)
    println("Booleano de W: "+w)
    println("Booleano de A: "+a)

    val teste2 : Any = (2 xor 3 > 9)



}