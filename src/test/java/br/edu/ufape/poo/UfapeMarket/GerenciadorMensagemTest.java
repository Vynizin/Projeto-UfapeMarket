package br.edu.ufape.poo.UfapeMarket;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import br.edu.ufape.poo.UfapeMarket.negocio.basica.Mensagem;
import br.edu.ufape.poo.UfapeMarket.negocio.cadastro.InterfaceGerenciadorMensagem;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.MensagemVaziaException;


@SpringBootTest
public class GerenciadorMensagemTest {

    @Autowired
    private InterfaceGerenciadorMensagem gerenciadorMensagem;

    @Test
    public void testEnviarMensagemComSucesso()
    	throws MensagemVaziaException {
        Mensagem m = new Mensagem();
        m.setTexto("Boa noite! Estou no prédio B.");

        Mensagem salva = gerenciadorMensagem.enviarMensagem(m);

        assertNotNull(salva);
        assertTrue(salva.getId() > 0);
        assertEquals("Boa noite! Estou no prédio B.", salva.getTexto());
    }

    @Test
    public void testEnviarMensagemVaziaDeveLancarExcecao() {
        Mensagem m = new Mensagem();
        m.setTexto("   ");

        assertThrows(MensagemVaziaException.class, () -> {
            gerenciadorMensagem.enviarMensagem(m);
        });
    }
}
