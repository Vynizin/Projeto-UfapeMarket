package br.edu.ufape.poo.UfapeMarket.negocio.cadastro;

import br.edu.ufape.poo.UfapeMarket.negocio.basica.Mensagem;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.MensagemVaziaException;

public interface InterfaceGerenciadorMensagem {

	Mensagem enviarMensagem(Mensagem entity) throws MensagemVaziaException;

	void removerMensagemId(Long id);

}