package br.com.alura.loja.test;

import br.com.alura.loja.http.JavaHttpClient;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class TestesAdapter {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("10")));
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
        registro.registrar(orcamento);
    }
}
