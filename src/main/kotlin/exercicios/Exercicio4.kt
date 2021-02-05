package exercicios

import java.util.*

fun main() {

    val compras: MutableList<Any> = mutableListOf()
    val leitura = Scanner(System.`in`)

    println("Digite o nome do produto")
    val produto: String = leitura.nextLine()
    compras.add(produto)

    println("Digite o Valor do Produto")
    val valor: Double = leitura.nextDouble()
    compras.add(valor)

    println("Digite a quantidade de Produtos")
    val quantidade: Int = leitura.nextInt()
    compras.add(quantidade)

    compraFinalizada(compras)

}

fun compraFinalizada(compras: MutableList<Any>) {
    println("Nome do produto: "+ compras[0]+
            " Quantidade: " + compras[2]+
            " Valor unitario: "+ compras[1]+
            " Valor total da Compra "+
            multiplicaCompra(compras[2].toString(), compras[1].toString())

    )

}

fun multiplicaCompra(x: String, y: String): Any = x.toInt() * y.toDouble()