package br.edu.ufape.poo.UfapeMarket;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.ufape.poo.UfapeMarket.dados.InterfaceColecaoCategoria;
import br.edu.ufape.poo.UfapeMarket.negocio.basica.Categoria;

@SpringBootTest
class InterfaceColecaoCategoriaTest {

	@Autowired
	private InterfaceColecaoCategoria colecaoCategoria;

	@Test
	void cadastrarTest() {
		long qntCategoriaAntes = colecaoCategoria.count();

		Categoria c = new Categoria();
		c.setNome("Livros");

		colecaoCategoria.save(c);

		long qntCategoriaDepois = colecaoCategoria.count();

		assertEquals(qntCategoriaAntes + 1, qntCategoriaDepois);
	}
}