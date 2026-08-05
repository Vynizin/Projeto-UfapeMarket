package br.edu.ufape.poo.UfapeMarket.dados;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ufape.poo.UfapeMarket.negocio.basica.Mensagem;

@Repository
public interface InterfaceRepositorioMensagem extends JpaRepository<Mensagem, Long> {

}
