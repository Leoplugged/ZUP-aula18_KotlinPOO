package aula18ex02

import kotlin.system.exitProcess

fun main() {
    val pessoa: Pessoa = Pessoa()

    fun boasVindas() {
        println(":: Calculadora de idades ::")
    }

    fun menu() {
        println("Selecione uma das opções abaixo:\n" +
                "1 - Informar pessoa\n" +
                "2 - Calcular idade\n" +
                "3 - Sair do programa")

        when (readln().toInt()) {
            1 -> {
                pessoa.receberDados()
                menu()
            }
            2 -> {
                pessoa.calcularIdade()
                pessoa.informarIdade()
                menu()
            }
            3 -> {
                println("Até breve!")
                exitProcess(0)
            }
            else -> {
                println("Opção inválida, tente novamtente")
                menu()
            }
        }
    }

    boasVindas()
    println("\nCuriosidades: ")
    pessoa.pessoaFamosa("Albert Einstein", 14, 3, 1879)
    pessoa.pessoaFamosa("Isaac Newton", 4, 1, 1643)
    println()
    menu()



}