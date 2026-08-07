package br.edu.ufape.poo.UfapeMarket.negocio.excecoes;

public class UsuarioEmailJaCadastradoException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public UsuarioEmailJaCadastradoException(String email) {
		super("Já existe um usuario cadastrado com este email: " + email);
	}
}
