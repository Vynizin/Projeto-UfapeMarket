package br.edu.ufape.poo.UfapeMarket.negocio.excecoes;

public class ProdutoEstoqueInsuficienteException extends Exception {

    public ProdutoEstoqueInsuficienteException() {
        super("Quantidade solicitada maior que o estoque disponível!");
    }
}