package br.edu.ufape.poo.UfapeMarket.negocio.excecoes;

public class UsuarioNaoPodeSeAvaliarException extends Exception {

    private static final long serialVersionUID = 1L;

    public UsuarioNaoPodeSeAvaliarException() {
        super("O usuário não pode avaliar a si mesmo.");
    }
}
