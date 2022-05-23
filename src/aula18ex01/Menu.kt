package aula18ex01

import aula18ex01.CliInterface.Companion.menu
import aula18ex01.Caixa.Companion.cadastrarProduto
import aula18ex01.Caixa.Companion.exibirProdutosCadastrados
import aula18ex01.Caixa.Companion.valorTotalProdutos
import aula18ex01.CliInterface.Companion.saida

//Você pode criar um menu para seu programa ser mais amigável
class Menu {
    companion object{
        fun seletorMenu() {
            val selecao = readln().toInt()

            when (selecao) {
                1 -> cadastrarProduto()
                2 -> exibirProdutosCadastrados()
                3 -> valorTotalProdutos()
                4 -> saida()
                else -> {
                    println("Seleção inválida; tente de novo.")
                    menu()
                }
            }
        }
    }
}