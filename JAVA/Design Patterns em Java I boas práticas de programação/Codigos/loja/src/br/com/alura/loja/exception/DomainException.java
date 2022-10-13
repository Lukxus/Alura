package br.com.alura.loja.exception;

public class DomainException extends RuntimeException{
    private static final long SerialVersionUID = 1L;

    public DomainException(String mensagem){
        super(mensagem);
    }
}
