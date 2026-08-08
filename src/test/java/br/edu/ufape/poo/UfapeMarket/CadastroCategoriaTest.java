package br.edu.ufape.poo.UfapeMarket;

import static org.junit.jupiter.api.Assertions.*;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.Test;

import br.edu.ufape.poo.UfapeMarket.negocio.cadastro.InterfaceCadastroCategoria;
import br.edu.ufape.poo.UfapeMarket.negocio.basica.Categoria;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.CategoriaDuplicadaException;

@SpringBootTest
class CadastroCategoriaTest {

    @Autowired
    private InterfaceCadastroCategoria cadastroCategoria;

    @Test
    void CadastroCategoriaDuplicadaTest() {
        String nome = "Eletrônicos " + System.currentTimeMillis();
        
        Categoria c1 = new Categoria();
        c1.setNome(nome);

        Categoria c2 = new Categoria();
        c2.setNome(nome);

        CategoriaDuplicadaException exception = assertThrows(
            CategoriaDuplicadaException.class,
            () -> {
                cadastroCategoria.salvarCategoria(c1);
                cadastroCategoria.salvarCategoria(c2);
            }
        );

        assertEquals(nome, exception.getNome());
    }
}