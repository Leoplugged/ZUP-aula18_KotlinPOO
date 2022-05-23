package aula18ex01
import aula18ex01.CliInterface.Companion.menu

//(...)Seu programa deverá conter uma classe Caixa que deverá conter uma lista de produtos,(...)
open class Caixa {
    companion object{
        private val listaProdutos: ArrayList<Produto> = ArrayList()

        //(...)essa classe deverá permitir cadastrar produtos,(...)
        internal fun cadastrarProduto(){
            print("Nome do produto: ")
            val nome = readln()
            print("Preço: R$ ")
            val preco = readln().toDouble()
            print("Quantidade: ")
            val qtd = readln().toInt()

            val produto = Produto(nome, preco, qtd)
            listaProdutos.add(produto)

            println(":: Produto cadastrado ::")
            menu()
        }

        //(...)exibir os produtos cadastrados(...)
        internal fun exibirProdutosCadastrados(){
            if (listaProdutos.isEmpty()) {
                println("Sua cesta está vazia!")
            }else {
                println(" Qtd | Preço Unit. | Preço Total | Produto ")
                listaProdutos.forEach { it ->
                    println(
                        " ${it.qtd}  | R$ ${it.preco}  | R$ ${it.preco * it.qtd} | ${it.nome}"
                    )
                }
            }
            menu()
        }

        //(...)e uma função que irá exibir o valor total da somatória de todos os produtos da lista.
        internal fun valorTotalProdutos() {
            var valorTotal = 0.0

            for (produto: Produto in listaProdutos) {
                val totalProduto: Double = produto.qtd * produto.preco
                valorTotal += totalProduto
            }
            println("O valor da compra toda é: R$ ${valorTotal}.")
            menu()
        }
    }
}