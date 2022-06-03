package aula18ex02

import java.time.LocalDate
import java.time.temporal.ChronoUnit

    /*Criar a classe Pessoa, com seguintes atributos: idade, dia, mês e ano de nascimento e nome da pessoa. E fazer usp do
    conceito de encapsulamento aprendido nas aulas*/
open class Pessoa(
    private var idade: Int = 0,
    private var diaNasc: Int = 0,
    private var mesNasc: Int = 0,
    private var anoNasc: Int = 0,
    private var nome: String = ""
){

    /*Criar métodos: calculaIdade(), que recebe a data atual em dias, mês e anos, calcula e armazena no atributo idade a
    idade atual da pessoa; */
    internal fun calcularIdade(){
        if (diaNasc != 0 || mesNasc != 0 || anoNasc != 0){
            val dataNasc = LocalDate.of(anoNasc, mesNasc, diaNasc)
            val hoje = LocalDate.now()

            /*A forma de calcular a idade abaixo foi resultado da pesquisa de @caroldf07, a partir de uma documentação/
            *fórum do Kotlin @see https://discuss.kotlinlang.org/t/calculate-no-of-days-between-two-dates-kotlin/9826*/
            this.idade = ChronoUnit.YEARS.between(dataNasc, hoje).toInt()
            println(idade)

        } else {
            println("Dados inválidos. Tente novamente.")
            calcularIdade()
        }
    }

    //informarIdade(), que retorna o valor da idade;
    fun informarIdade(): Int {
        println("$nome tem $idade anos hoje.")
        return idade
    }

    //informarNome(), que retorna o nome da pessoa;
    private fun informarNome(nomePreencher: String) {
        this.nome = nomePreencher
        println("O nome é $nomePreencher")
    }

    /*ajustaDataDeNascimento(), recebendo dia, mês e ano de nascimento como parâmetros e preenche nos atributos
    correspondentes do objeto.*/
    private fun ajustarDataDeNascimento(diaAjust: Int, mesAjust: Int, anoAjust: Int) {
        this.diaNasc = diaAjust
        this.mesNasc = mesAjust
        this.anoNasc = anoAjust
    }

    internal fun receberDados() {
        print("Nome: ")
        val nome = readln()

        print("Dia de Nascimento: ")
        val diaNasc = readln().toInt()

        print("Mês de Nascimento: ")
        val mesNasc = readln().toInt()

        print("Ano de Nascimento: ")
        val anoNasc = readln().toInt()

        informarNome(nomePreencher = nome)
        ajustarDataDeNascimento(diaAjust = diaNasc, mesAjust = mesNasc, anoAjust = anoNasc)
    }

        //TODO: Acertar idade da pessoa famosa no println sem ter que calculá-la
    fun pessoaFamosa(nome: String, diaNasc: Int, mesNasc: Int, anoNasc: Int) {
        println("A pessoa $nome teria $idade anos; ela nasceu em $diaNasc/$mesNasc/$anoNasc.")
    }
}