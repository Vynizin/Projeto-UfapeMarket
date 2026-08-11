package br.edu.ufape.poo.UfapeMarket.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import br.edu.ufape.poo.UfapeMarket.negocio.basica.Produto;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.ProdutoCategoriaObrigatoriaException;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.ProdutoDescricaoObrigatoriaException;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.ProdutoNomeObrigatorioException;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.ProdutoPrecoInvalidoException;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.ProdutoQuantidadeInvalidaException;

public interface InterfaceCadastroProduto {

    Produto salvarProduto(Produto produto)
            throws ProdutoNomeObrigatorioException,
                   ProdutoDescricaoObrigatoriaException,
                   ProdutoPrecoInvalidoException,
                   ProdutoQuantidadeInvalidaException,
                   ProdutoCategoriaObrigatoriaException;

    List<Produto> listarProdutos();

    Optional<Produto> procurarProdutoID(Long id);

    void deletarProdutoId(Long id);
}