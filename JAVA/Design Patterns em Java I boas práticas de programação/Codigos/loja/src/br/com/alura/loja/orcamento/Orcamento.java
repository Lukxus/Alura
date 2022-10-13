package br.com.alura.loja.orcamento;

import br.com.alura.loja.orcamento.situacao.EmAnalise;
import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private int quatidadeItens;
    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor, int quatidadeItens) {
        this.valor = valor;
        this.quatidadeItens = quatidadeItens;
        this.situacao = new EmAnalise();
    }
    public BigDecimal getValor() {
        return valor;
    }
    public int getQuantidadeItens() {
        return quatidadeItens;
    }

    public void aprovar(){
        this.situacao.aprovar(this);
    }

    public void reprovar(){
        this.situacao.aprovar(this);
    }

    public void finalizar(){
        this.situacao.finalizar(this);
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void aplicarDescontoExtra(){
        BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDoDescontoExtra);
    }
}
