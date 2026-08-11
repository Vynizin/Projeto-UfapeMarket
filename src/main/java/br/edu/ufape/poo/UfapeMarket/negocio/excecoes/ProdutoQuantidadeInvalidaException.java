package br.edu.ufape.poo.UfapeMarket.negocio.excecoes;

	public class ProdutoQuantidadeInvalidaException extends Exception {

	    public ProdutoQuantidadeInvalidaException() {
	        super("A quantidade deve ser maior que zero!");
	    }
	}


