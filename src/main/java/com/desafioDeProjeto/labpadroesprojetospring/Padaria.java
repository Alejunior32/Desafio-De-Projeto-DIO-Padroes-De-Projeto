package com.desafioDeProjeto.labpadroesprojetospring;




public class Padaria {

    public static void main(String[] args) {

        Produto pãoFranceis = new Produto("Pão Franceis","654161651321",0.75);
        Produto bolo = new Produto("Bolo","12565416516523",10.99 );
        Produto pãoDeQueijo = new Produto("Pão de queijo","56418652",1.59 );
        Produto croissant = new Produto("Croissant","5461205216",5.99);
        Produto pãoLeite = new Produto("Pão de leite","325456123",2.06);


        Loja padaria = new Loja();

        padaria.comprar(bolo,padaria);
        padaria.comprar(pãoDeQueijo,padaria);
        padaria.comprar(pãoFranceis,padaria);
        padaria.comprar(pãoLeite,padaria);
        padaria.comprar(croissant,padaria);
    }
}
