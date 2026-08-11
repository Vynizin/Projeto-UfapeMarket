package br.edu.ufape.poo.UfapeMarket.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.poo.UfapeMarket.dados.InterfaceColecaoAvaliacao;
import br.edu.ufape.poo.UfapeMarket.negocio.basica.Avaliacao;

@Service
public class CadastroAvaliacao implements InterfaceCadastroAvaliacao {

    @Autowired
    private InterfaceColecaoAvaliacao repositorioAvaliacao;

    @Override
    public Avaliacao salvarAvaliacao(Avaliacao avaliacao) {

        if (avaliacao == null) {
            throw new IllegalArgumentException("Avaliação não pode ser nula.");
        }

        if (avaliacao.getNota() < 1 || avaliacao.getNota() > 5) {
            throw new IllegalArgumentException("A nota deve estar entre 1 e 5.");
        }

        if (avaliacao.getAutor() == null) {
            throw new IllegalArgumentException("O autor da avaliação é obrigatório.");
        }

        if (avaliacao.getAvaliado() == null) {
            throw new IllegalArgumentException("O usuário avaliado é obrigatório.");
        }

        return repositorioAvaliacao.save(avaliacao);
    }

    @Override
    public List<Avaliacao> listarAvaliacoes() {
        return repositorioAvaliacao.findAll();
    }

    @Override
    public Optional<Avaliacao> procurarAvaliacaoID(Long id) {
        return repositorioAvaliacao.findById(id);
    }

    @Override
    public void deletarAvaliacaoId(Long id) {
        repositorioAvaliacao.deleteById(id);
    }
}