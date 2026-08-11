package br.edu.ufape.poo.UfapeMarket.negocio.excecoes;

public class ProdutoCategoriaObrigatoriaException extends Exception {

    public ProdutoCategoriaObrigatoriaException() {
        super("A categoria do produto é obrigatória!");
    }
}