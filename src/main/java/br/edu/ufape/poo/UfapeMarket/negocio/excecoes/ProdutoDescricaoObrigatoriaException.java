package br.edu.ufape.poo.UfapeMarket.negocio.excecoes;

public class ProdutoDescricaoObrigatoriaException extends Exception {

    public ProdutoDescricaoObrigatoriaException() {
        super("A descrição do produto é obrigatória!");
    }
}
