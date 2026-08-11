package br.edu.ufape.poo.UfapeMarket;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.ufape.poo.UfapeMarket.negocio.basica.Avaliacao;
import br.edu.ufape.poo.UfapeMarket.negocio.basica.Produto;
import br.edu.ufape.poo.UfapeMarket.negocio.basica.Usuario;
import br.edu.ufape.poo.UfapeMarket.negocio.basica.Venda;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.ProdutoIndisponivelException;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.UsuarioNaoPodeSeAvaliarException;
import br.edu.ufape.poo.UfapeMarket.negocio.fachada.UfapeMarket;

@SpringBootTest
class UfapeMarketTest {

    @Autowired
    private UfapeMarket fachada;

    @Test
    void fazerVendaProdutoIndisponivelTest() {

        Produto produto = new Produto();
        produto.setDisponivel(false);

        Venda venda = new Venda();

        assertThrows(
            ProdutoIndisponivelException.class,
            () -> fachada.fazerVenda(venda, produto, 1)
        );
    }


    @Test
    void avaliarProprioUsuarioTest() {

        Usuario usuario = new Usuario("Teste", "teste@ufape.edu.br", "123", null, "Computação", null, null);

        usuario.setId(2);

        Avaliacao avaliacao = new Avaliacao(5, "Boa!", usuario, usuario);

        assertThrows(UsuarioNaoPodeSeAvaliarException.class,
        		() -> fachada.avaliarProduto(avaliacao)
        );
    }
    
    
    
}