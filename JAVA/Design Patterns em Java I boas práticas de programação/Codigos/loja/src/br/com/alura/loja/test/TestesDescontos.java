package br.com.alura.loja.test;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento(new BigDecimal("100"), 7);
        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(primeiro));

        Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);
        System.out.println(calculadora.calcular(segundo));


    }
}
