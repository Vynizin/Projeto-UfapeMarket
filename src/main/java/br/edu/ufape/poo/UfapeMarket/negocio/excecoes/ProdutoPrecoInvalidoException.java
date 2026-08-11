package br.edu.ufape.poo.UfapeMarket.negocio.excecoes;

public class ProdutoPrecoInvalidoException extends Exception {

    public ProdutoPrecoInvalidoException() {
        super("O preço informado não é válido!");
    }
}