package com.desafioDeProjeto.labpadroesprojetospring.service;

public class PagamentoPix implements Pagamento{
    @Override
    public void pagar() {
        System.out.println("A chave pix é alexandre@gmail.com");
        System.out.println("Pagamento efetuado!");
        System.out.println( );
    }
}
