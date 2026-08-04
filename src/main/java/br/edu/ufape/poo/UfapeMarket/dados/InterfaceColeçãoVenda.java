package br.edu.ufape.poo.UfapeMarket.dados;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ufape.poo.UfapeMarket.negocio.basica.Venda;

@Repository

public interface InterfaceColeçãoVenda extends JpaRepository<Venda, Long> {

}
