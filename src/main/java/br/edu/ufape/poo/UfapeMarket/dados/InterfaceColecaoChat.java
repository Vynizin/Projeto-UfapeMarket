package br.edu.ufape.poo.UfapeMarket.dados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ufape.poo.UfapeMarket.negocio.basica.Avaliacao;
import br.edu.ufape.poo.UfapeMarket.negocio.basica.Chat;



public interface InterfaceColecaoChat extends JpaRepository<Chat, Long> {
	
}
