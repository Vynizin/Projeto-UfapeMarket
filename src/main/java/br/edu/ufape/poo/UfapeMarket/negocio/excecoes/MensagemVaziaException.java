package br.edu.ufape.poo.UfapeMarket.negocio.excecoes;

public class MensagemVaziaException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	public MensagemVaziaException() {
		super("Não é possível enviar uma mensagem vazia.");
	}
}
