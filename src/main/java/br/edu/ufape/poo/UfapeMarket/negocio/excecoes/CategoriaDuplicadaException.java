package br.edu.ufape.poo.UfapeMarket.negocio.excecoes;

public class CategoriaDuplicadaException extends Exception{
	private static final long serialVersionUID = 1L;
	private String nome;
	
	public CategoriaDuplicadaException(String nome) {
		super("Já existe uma categoria cadastrada com este nome.");
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
}
