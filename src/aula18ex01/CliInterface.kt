package aula18ex01

import aula18ex01.Menu.Companion.seletorMenu
import kotlin.system.exitProcess

class CliInterface {
    companion object {
        fun boasVindas() {
            println(
                "Bem vinde ao pequeno sistema de supermercado da SimCity!"
            )
            menu()
        }

        fun menu() {
            print(
                "┌-----------------------MENU-----------------------┐\n" +
                "| [1] - Cadastrar produto                          |\n" +
                "| [2] - Exibir produtos cadastrados                |\n" +
                "| [3] - Valor total da lista de produtos           |\n" +
                "| [4] - Sair do programa                           |\n" +
                "└--------------------------------------------------┘\n" +
                " Digite a opção que da ação que deseja realizar: "
            )
            seletorMenu()
        }

        fun saida() {
            println("À bientôt!")
            exitProcess(0)
        }
    }
}