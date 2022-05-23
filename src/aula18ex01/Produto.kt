package aula18ex01

//seu programa deverá conter uma classe Produto com os atributos de nome do produto, valor e quantidade.
class Produto (internal var nome: String, preco: Double, qtd: Int){

    //Método set: garantir que seja preenchido com dados corretos.
    internal var preco = preco
    set(value) {
        if(value>=0){
            field = value
        }else{
            print("Atenção: digite um preço do produto maior que R$ 0,00.")
        }
    }

    internal var qtd = qtd
    set(value) {
        if(value>=0){
            field=value
        }else{
            print("Atenção: digite uma quantidade do produto maior que 0.")
        }
    }
}