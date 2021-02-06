package basico.controle

import java.util.*

fun main() {

    // criando a minha lista
    val valores: MutableList<Double> = mutableListOf()
    var opcao: String = ""


    while (opcao != "N" && opcao != "n") {

        //Inserindo a informação pelo prompt
        println("Digite o valor deseja: ")
        val compra = readLine()!!.toDouble()

        //adicionando dentro da minha lista a compra
        valores.add(compra);

        // regra dentro do While
        println("Continuar dentro do while ? S/N")
        opcao = readLine() ?: "N"
    }

    //printando as informações da lista
    println(valores)

    for (valor in valores) {
        println("valor do produto: $valor")
    }
}
