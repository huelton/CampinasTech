package exercicios

import java.util.*
// se eh maior de 18, se sim, pode dirigir se nao nao pode
//verificar se eh habilitado, se houver mensagem = em liberacao, se for null habi nao autorizada

fun main(){
    val mensagem: String? = null

    println("Digite sua idade: ")
    val idade: Int = Scanner(System.`in`).nextInt()

    println(validacaoCarteira(idade, mensagem))
}
fun validacaoCarteira(idade:Int, mensagem: String? = "em Liberacao"): String{

    val resultado = if (idade >= 18){
        "Pode dirigir"

    }else{
        "Nao pode dirigir"
    }

    val liberacao = mensagem ?: "Não Habilitado"

    return "$resultado $liberacao"

}
