package br.edu.ufape.poo.UfapeMarket.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.poo.UfapeMarket.dados.InterfaceRepositorioProduto;
import br.edu.ufape.poo.UfapeMarket.negocio.basica.Produto;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.ProdutoCategoriaObrigatoriaException;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.ProdutoDescricaoObrigatoriaException;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.ProdutoNomeObrigatorioException;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.ProdutoPrecoInvalidoException;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.ProdutoQuantidadeInvalidaException;

@Service
public class CadastroProduto implements InterfaceCadastroProduto {

    @Autowired
    private InterfaceRepositorioProduto repositorioProduto;

    @Override
    public Produto salvarProduto(Produto produto)
            throws ProdutoNomeObrigatorioException,
                   ProdutoDescricaoObrigatoriaException,
                   ProdutoPrecoInvalidoException,
                   ProdutoQuantidadeInvalidaException,
                   ProdutoCategoriaObrigatoriaException {

        if (produto == null) {
            throw new IllegalArgumentException("Produto não pode ser nulo.");
        }

        if (produto.getNome() == null || produto.getNome().isBlank()) {
            throw new ProdutoNomeObrigatorioException();
        }

        if (produto.getDescricaoProduto() == null
                || produto.getDescricaoProduto().isBlank()) {
            throw new ProdutoDescricaoObrigatoriaException();
        }

        if (produto.getPreco() < 0.01) {
            throw new ProdutoPrecoInvalidoException();
        }

        if (produto.getQuantidadeDisponivel() < 0) {
            throw new ProdutoQuantidadeInvalidaException();
        }

        if (produto.getCategoria() == null) {
            throw new ProdutoCategoriaObrigatoriaException();
        }

        return repositorioProduto.save(produto);
    }

    @Override
    public List<Produto> listarProdutos() {
        return repositorioProduto.findAll();
    }

    @Override
    public Optional<Produto> procurarProdutoID(Long id) {
        return repositorioProduto.findById(id);
    }

    @Override
    public void deletarProdutoId(Long id) {
        Produto produto = repositorioProduto.findById(id)
                .orElseThrow(() ->
                        new IllegalArgumentException("Produto não encontrado."));

        repositorioProduto.delete(produto);
    }
}