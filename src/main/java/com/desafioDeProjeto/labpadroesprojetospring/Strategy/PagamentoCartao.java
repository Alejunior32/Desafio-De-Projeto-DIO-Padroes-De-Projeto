package com.desafioDeProjeto.labpadroesprojetospring.service;

import javax.swing.*;
import java.util.Scanner;

public class PagamentoCartao implements Pagamento{

    @Override
    public void pagar() {
        System.out.println("O pagamento com o cartão esta sendo processado...");
        System.out.println("Pagamento Efetuado!");
        System.out.println();
    }
}

