package com.desafioDeProjeto.labpadroesprojetospring;

import com.desafioDeProjeto.labpadroesprojetospring.service.Pagamento;
import com.desafioDeProjeto.labpadroesprojetospring.service.PagamentoCartao;
import com.desafioDeProjeto.labpadroesprojetospring.service.PagamentoCripto;
import com.desafioDeProjeto.labpadroesprojetospring.service.PagamentoPix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Produto {


    private String nome;
    private String codigoBarras;
    private double valor;

    public Produto() {
    }

    public Produto(String nome, String codigoBarras, double valor) {
        this.nome = nome;
        this.codigoBarras = codigoBarras;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public  double getValor() {
        return valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "Produto: '" + nome + '\'' +
                ", Código de Barras:'" + codigoBarras + '\'' +
                ", Preço:R$ " + valor +
                '}';
    }

}
