package br.edu.ufape.poo.UfapeMarket.negocio.excecoes;

public class UsuarioNaoEncontradoException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public UsuarioNaoEncontradoException(Long id) {
        super("Usuário com ID " + id + " não encontrado.");
	}
	
	
}
