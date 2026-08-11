package br.edu.ufape.poo.UfapeMarket.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.poo.UfapeMarket.dados.InterfaceColecaoChat;
import br.edu.ufape.poo.UfapeMarket.negocio.basica.Chat;

@Service
public class CadastroChat implements InterfaceCadastroChat {

    @Autowired
    private InterfaceColecaoChat repositorioChat;

    @Override
    public Chat salvarChat(Chat chat) {

        if (chat == null) {
            throw new IllegalArgumentException("Chat não pode ser nulo.");
        }

        if (chat.getProduto() == null) {
            throw new IllegalArgumentException("O produto do chat é obrigatório.");
        }

        if (chat.getVendedor() == null) {
            throw new IllegalArgumentException("O vendedor do chat é obrigatório.");
        }

        if (chat.getComprador() == null) {
            throw new IllegalArgumentException("O comprador do chat é obrigatório.");
        }

        if (chat.getVendedor().getId() == chat.getComprador().getId()) {
            throw new IllegalArgumentException(
                    "O vendedor não pode ser o mesmo usuário que o comprador.");
        }

        return repositorioChat.save(chat);
    }

    @Override
    public List<Chat> listarChats() {
        return repositorioChat.findAll();
    }

    @Override
    public Optional<Chat> procurarChatID(Long id) {
        return repositorioChat.findById(id);
    }

    @Override
    public void deletarChatId(Long id) {
        repositorioChat.deleteById(id);
    }
}