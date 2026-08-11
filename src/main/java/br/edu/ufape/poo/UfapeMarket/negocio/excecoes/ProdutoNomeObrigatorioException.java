package br.edu.ufape.poo.UfapeMarket.negocio.excecoes;

public class ProdutoNomeObrigatorioException extends Exception {

    public ProdutoNomeObrigatorioException() {
        super("O nome do produto é obrigatório!");
    }
}