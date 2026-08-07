package br.edu.ufape.poo.UfapeMarket.negocio.excecoes;

public class UsuarioEmailInvalidoException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public UsuarioEmailInvalidoException (String email) {
		super("Email Inválido, Use seu email institucional(@ufape.edu.br)");
	}
}
