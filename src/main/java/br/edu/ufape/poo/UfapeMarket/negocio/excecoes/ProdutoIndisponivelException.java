package br.edu.ufape.poo.UfapeMarket.negocio.excecoes;

public class ProdutoIndisponivelException extends Exception {

    private static final long serialVersionUID = 1L;

    public ProdutoIndisponivelException() {
        super("O produto está indisponível para venda.");
    }
}