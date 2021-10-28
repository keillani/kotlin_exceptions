package br.com.alura.bytebank.teste

fun testaExpressao() {
    //try-expression
    //usar quando precisa pegar um valor de algum outra fonte
    //exemplo abaixo uma string e preciso transformar em double
    val entrada: String = "1"

    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversão")
        e.printStackTrace()
        null
    }

    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }

//    val valorComTaxa: Double? = when {
//        valorRecebido != null -> {
//            valorRecebido + 0.1
//        }
//        else -> {
//            null
//        }
//    }

    if (valorComTaxa != null) {
        println("Valor da taxa: $valorComTaxa")
    } else {
        println("Valor inválido")
    }
}