package br.edu.ufape.poo.UfapeMarket.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import br.edu.ufape.poo.UfapeMarket.negocio.basica.Categoria;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.CategoriaDuplicadaException;

public interface InterfaceCadastroCategoria {

	Categoria salvarCategoria(Categoria entity)
			throws CategoriaDuplicadaException;

	List<Categoria> listarCategorias();

	Optional<Categoria> encontrarCategoriaId(Long id);

	void removerCategoriaId(Long id);

	boolean verificarExistenciaCategoriaId(Long id);

}