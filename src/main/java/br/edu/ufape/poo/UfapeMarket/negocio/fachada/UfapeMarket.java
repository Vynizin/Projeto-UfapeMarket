package br.edu.ufape.poo.UfapeMarket.negocio.fachada;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.poo.UfapeMarket.negocio.basica.Avaliacao;
import br.edu.ufape.poo.UfapeMarket.negocio.basica.Categoria;
import br.edu.ufape.poo.UfapeMarket.negocio.basica.Chat;
import br.edu.ufape.poo.UfapeMarket.negocio.basica.Mensagem;
import br.edu.ufape.poo.UfapeMarket.negocio.basica.Produto;
import br.edu.ufape.poo.UfapeMarket.negocio.basica.Usuario;
import br.edu.ufape.poo.UfapeMarket.negocio.basica.Venda;

import br.edu.ufape.poo.UfapeMarket.negocio.cadastro.InterfaceCadastroAvaliacao;
import br.edu.ufape.poo.UfapeMarket.negocio.cadastro.InterfaceCadastroCategoria;
import br.edu.ufape.poo.UfapeMarket.negocio.cadastro.InterfaceCadastroChat;
import br.edu.ufape.poo.UfapeMarket.negocio.cadastro.InterfaceCadastroUsuario;
import br.edu.ufape.poo.UfapeMarket.negocio.cadastro.InterfaceGerenciadorMensagem;

import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.CategoriaDuplicadaException;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.MensagemVaziaException;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.ProdutoCategoriaObrigatoriaException;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.ProdutoEstoqueInsuficienteException;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.ProdutoQuantidadeInvalidaException;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.UsuarioEmailInvalidoException;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.UsuarioEmailJaCadastradoException;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.UsuarioNomeObrigatorioException;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.VendaProdutoObrigatorioException;

@Service
public class UfapeMarket implements InterfaceFachada {

    @Autowired
    private InterfaceCadastroUsuario cadastroUsuario;

    @Autowired
    private InterfaceCadastroCategoria cadastroCategoria;

    @Autowired
    private InterfaceCadastroChat cadastroChat;

    @Autowired
    private InterfaceCadastroAvaliacao cadastroAvaliacao;

    @Autowired
    private InterfaceGerenciadorMensagem gerenciadorMensagem;


    // =========================
    // USUARIO
    // =========================

    @Override
    public Usuario salvarUsuario(Usuario usuario)
            throws UsuarioNomeObrigatorioException,
                   UsuarioEmailInvalidoException,
                   UsuarioEmailJaCadastradoException {

        return cadastroUsuario.salvarUsuario(usuario);
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return cadastroUsuario.listarUsuarios();
    }

    @Override
    public Usuario localizarUsuarioEmail(String email) {
        return cadastroUsuario.localizarUsuarioEmail(email);
    }


    // =========================
    // CATEGORIA
    // =========================

    @Override
    public Categoria salvarCategoria(Categoria categoria)
            throws CategoriaDuplicadaException {

        return cadastroCategoria.salvarCategoria(categoria);
    }

    @Override
    public List<Categoria> listarCategorias() {
        return cadastroCategoria.listarCategorias();
    }


    // =========================
    // CHAT
    // =========================

    @Override
    public Chat salvarChat(Chat chat) {
        return cadastroChat.salvarChat(chat);
    }

    @Override
    public List<Chat> listarChats() {
        return cadastroChat.listarChats();
    }


    // =========================
    // MENSAGEM
    // =========================

    @Override
    public Mensagem enviarMensagem(Mensagem mensagem)
            throws MensagemVaziaException {

        return gerenciadorMensagem.enviarMensagem(mensagem);
    }


    // =========================
    // AVALIACAO
    // =========================

    @Override
    public Avaliacao avaliarProduto(Avaliacao avaliacao) {

        return cadastroAvaliacao.salvarAvaliacao(avaliacao);
    }


    // =========================
    // FAVORITO
    // =========================

    @Override
    public void favoritarProduto(Usuario usuario, Produto produto) {

        usuario.favoritarProduto(produto);
    }


    // =========================
    // CATEGORIA DO PRODUTO
    // =========================

    @Override
    public void escolherCategoria(
            Produto produto,
            Categoria categoria)
            throws ProdutoCategoriaObrigatoriaException {

        produto.alterarCategoria(categoria);
    }



    @Override
    public void fazerVenda(
            Venda venda,
            Produto produto,
            int quantidade)
            throws VendaProdutoObrigatorioException,
                   ProdutoQuantidadeInvalidaException,
                   ProdutoEstoqueInsuficienteException {

        venda.realizarVenda(produto, quantidade);
    }
}