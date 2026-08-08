package br.edu.ufape.poo.UfapeMarket.negocio.cadastro;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.poo.UfapeMarket.dados.InterfaceRepositorioMensagem;
import br.edu.ufape.poo.UfapeMarket.negocio.basica.Mensagem;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.MensagemVaziaException;

@Service
public class GerenciadorMensagem implements InterfaceGerenciadorMensagem {
	
	@Autowired
	private InterfaceRepositorioMensagem colecaoMensagem;
	
	public Mensagem enviarMensagem(Mensagem entity)
	throws MensagemVaziaException{
		if(entity.getTexto() == null || entity.getTexto().trim().isEmpty()) {
			throw new MensagemVaziaException();
		}
		return colecaoMensagem.save(entity);
	}
	
	public void removerMensagemId(Long id) {
		colecaoMensagem.deleteById(id);
	}
	
}
