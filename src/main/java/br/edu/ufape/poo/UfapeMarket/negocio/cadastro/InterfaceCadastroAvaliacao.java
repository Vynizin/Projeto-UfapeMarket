package br.edu.ufape.poo.UfapeMarket.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import br.edu.ufape.poo.UfapeMarket.negocio.basica.Avaliacao;

public interface InterfaceCadastroAvaliacao {

    Avaliacao salvarAvaliacao(Avaliacao avaliacao);

    List<Avaliacao> listarAvaliacoes();

    Optional<Avaliacao> procurarAvaliacaoID(Long id);

    void deletarAvaliacaoId(Long id);
}