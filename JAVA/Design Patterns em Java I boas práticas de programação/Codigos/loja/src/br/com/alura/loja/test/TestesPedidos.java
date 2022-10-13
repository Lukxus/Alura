package br.com.alura.loja.test;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedidos {
    public static void main(String[] args) {
        String cliente = "Rodrigo";//args[0];
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidadItens = Integer.parseInt("2");


        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(new SalvarPedidoNoBancoDeDados(), new EnviarEmailPedido()));
        handler.execute(gerador);
    }
}
