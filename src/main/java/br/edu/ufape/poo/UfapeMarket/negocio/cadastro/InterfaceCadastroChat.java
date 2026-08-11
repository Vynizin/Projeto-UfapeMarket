package br.edu.ufape.poo.UfapeMarket.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import br.edu.ufape.poo.UfapeMarket.negocio.basica.Chat;

public interface InterfaceCadastroChat {

    Chat salvarChat(Chat chat);

    List<Chat> listarChats();

    Optional<Chat> procurarChatID(Long id);

    void deletarChatId(Long id);
}