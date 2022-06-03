package aula18ex03

import aula18ex03.Mensagens.Companion.tipoMensagem
import aula18ex03.Menu.Companion.menu
import kotlin.system.exitProcess

class Estudantes() {
    companion object {
        private var nomeEstudante: String = ""

        /*O programa só aceitará notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser
        validada separadamente.*/
        private var nota1: Double = 0.0
            set(value) {
                if (value in 0.0..10.0) {
                    field = value
                } else {
                    tipoMensagem(1)
                    this.salvarInputs()
                }
            }
        private var nota2: Double = 0.0
            set(value) {
                if (value in 0.0..10.0) {
                    field = value
                } else {
                    tipoMensagem(1)
                    this.salvarInputs()
                }
            }
        private var nota3: Double = 0.0
            set(value) {
                if (value in 0.0..10.0) {
                    field = value
                } else {
                    tipoMensagem(1)
                    this.salvarInputs()
                }
            }
        private var nota4: Double = 0.0
            set(value) {
                if (value in 0.0..10.0) {
                    field = value
                } else {
                    tipoMensagem(1)
                    this.salvarInputs()
                }
            }

        internal fun salvarInputs() {
            tipoMensagem(2)
            this.nomeEstudante = readln()

            tipoMensagem(3)
            this.nota1 = readln().toDouble()

            tipoMensagem(4)
            this.nota2 = readln().toDouble()

            tipoMensagem(4)
            this.nota3 = readln().toDouble()

            tipoMensagem(5)
            this.nota4 = readln().toDouble()
        }

        /* Calcule e imprima a média semestral.*/
        fun calcularMedia() {
            val media = (nota1 + nota2 + nota3 + nota4) / 4
        }

        /*Seu programa deve imprimir a mensagem “novo cálculo (1-sim 2-nao)”, solicitando aos professores que informem um
    código (1 ou 2) indicando se deseja ou não executar o algoritmo novamente, (aceitar apenas os código 1 ou 2). Se for
    informado o código 1 deve ser repetida a execução do programa para permitir um novo cálculo, caso contrário o
    programa deve ser encerrado.*/

        fun novoCalculo() {
            println("Novo cálculo? [1] Sim, [2] Não: ")
            val selecao = readln().toInt()

            when (selecao) {
                1 -> {
                    menu()
                }
                2 -> {
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