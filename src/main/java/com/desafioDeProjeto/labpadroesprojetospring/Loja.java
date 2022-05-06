package com.desafioDeProjeto.labpadroesprojetospring;

import com.desafioDeProjeto.labpadroesprojetospring.service.Pagamento;
import com.desafioDeProjeto.labpadroesprojetospring.service.PagamentoCartao;
import com.desafioDeProjeto.labpadroesprojetospring.service.PagamentoCripto;
import com.desafioDeProjeto.labpadroesprojetospring.service.PagamentoPix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja {

    Pagamento pagamento;
    Pagamento cartao = new PagamentoCartao();
    Pagamento pix = new PagamentoPix();
    Pagamento cripto = new PagamentoCripto();

    public  void setPagamento(Pagamento pagamento){
        this.pagamento=pagamento;
    }
    public void pagar(){
        pagamento.pagar();
    }

    public void comprar(Produto produto,Loja loja){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Produto:  "+ produto.getNome()+"\nPreço:R$ "+produto.getValor());
        System.out.println("Selecione o método de pagamento\n1.Cartão de Credito\n2.Pix\n3.Criptomoedas");
        int opcao=teclado.nextInt();

        if(opcao== 1) {
            loja.setPagamento(cartao);
            loja.pagar();
        } else if (opcao == 2) {
            loja.setPagamento(pix);
            loja.pagar();
        } else {
            loja.setPagamento(cripto);
            loja.pagar();
        }
    }


}
