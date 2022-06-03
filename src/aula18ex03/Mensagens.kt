package aula18ex03

class Mensagens() {
    companion object {
        fun tipoMensagem(numeroMensagem: Int) {
            val tipoMensagem = readln().toInt()
            when (tipoMensagem) {
                //Mensagens das Notas
                1 -> {
                    println("Input inválido, tente novamente.")
                    //TODO: salvarInputs()
                }
                2 -> {
                    println("Digite nome de Estudante: ")
                }
                3 -> {
                    println("Digite a primeira nota: ")
                }
                4 -> {
                    println("Digite a próxima nota: ")
                }
                5 -> {
                    println("Digite a última nota: ")
                }
                6 -> {
                    //TODO: Consertar mensagem a exibir
                    println("A média de") //$estudantes.nomeEstudante foi $estudantes.media")
                }
                //Mensagens do Menu
                7 -> {
                    println("Bem vinde ao sistema Catalisa de cálculo de médias escolares!")
                }
                8 -> {
                    println(
                        "Digite uma das opções abaixo: \n" +
                                "[1] - Informar pessoa\n" +
                                "[2] - Calcular média\n" +
                                "[3] - Sair do programa\n"
                    )
                }
                9 -> {
                    println("Você saiu da Calculadora. À bientôt!")
                }
                10 -> {
                    println("Novo cálculo? [1] Sim, [2] Não: ")
                }

            }
        }
    }
}