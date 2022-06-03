package aula18ex03

import aula18ex03.Estudantes.Companion.calcularMedia
import aula18ex03.Estudantes.Companion.novoCalculo
import aula18ex03.Estudantes.Companion.salvarInputs
import aula18ex03.Mensagens.Companion.tipoMensagem
import kotlin.system.exitProcess

class Menu {
    companion object {
        fun menu() {
            tipoMensagem(8)
            val selecao = readln().toInt()

            when (selecao) {
                1 -> {
                    salvarInputs()
                    menu()
                }
                2 -> {
                    calcularMedia()
                    novoCalculo()
                }
                3 -> {
                    tipoMensagem(9)
                    exitProcess(0)
                }
                else -> {
                    tipoMensagem(1)
                    menu()
                }
            }
        }
    }
}