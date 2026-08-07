package br.edu.ufape.poo.UfapeMarket.negocio.excecoes;

public class UsuarioNomeObrigatorioException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public UsuarioNomeObrigatorioException() {
		super("O nome é obrigatorio!");
	}
}
