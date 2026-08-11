package br.edu.ufape.poo.UfapeMarket.negocio.excecoes;

public class VendaProdutoObrigatorioException extends Exception {

    public VendaProdutoObrigatorioException() {
        super("A venda precisa possuir um produto!");
    }
}