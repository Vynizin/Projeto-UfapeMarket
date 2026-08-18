package br.edu.ufape.poo.UfapeMarket.negocio.fachada;

import java.util.List;

import br.edu.ufape.poo.UfapeMarket.negocio.basica.Avaliacao;
import br.edu.ufape.poo.UfapeMarket.negocio.basica.Categoria;
import br.edu.ufape.poo.UfapeMarket.negocio.basica.Chat;
import br.edu.ufape.poo.UfapeMarket.negocio.basica.Mensagem;
import br.edu.ufape.poo.UfapeMarket.negocio.basica.Notificacao;
import br.edu.ufape.poo.UfapeMarket.negocio.basica.Produto;
import br.edu.ufape.poo.UfapeMarket.negocio.basica.Usuario;
import br.edu.ufape.poo.UfapeMarket.negocio.basica.Venda;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.CategoriaDuplicadaException;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.MensagemVaziaException;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.ProdutoCategoriaObrigatoriaException;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.ProdutoEstoqueInsuficienteException;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.ProdutoIndisponivelException;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.ProdutoQuantidadeInvalidaException;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.UsuarioEmailInvalidoException;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.UsuarioEmailJaCadastradoException;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.UsuarioNaoEncontradoException;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.UsuarioNaoPodeSeAvaliarException;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.UsuarioNomeObrigatorioException;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.VendaProdutoObrigatorioException;

public interface InterfaceFachada {

    Usuario salvarUsuario(Usuario usuario)
            throws UsuarioNomeObrigatorioException,
                   UsuarioEmailInvalidoException,
                   UsuarioEmailJaCadastradoException;

    List<Usuario> listarUsuarios();

    Usuario localizarUsuarioEmail(String email);

    Categoria salvarCategoria(Categoria categoria)
            throws CategoriaDuplicadaException;

    List<Categoria> listarCategorias();

    void removerCategoriaId(Long id);

    Chat salvarChat(Chat chat);

    List<Chat> listarChats();

    Mensagem enviarMensagem(Mensagem mensagem)
            throws MensagemVaziaException;
    
    void removerMensagemId(Long id);

    Avaliacao avaliarProduto(Avaliacao avaliacao)
            throws UsuarioNaoPodeSeAvaliarException;
    
    Usuario procurarUsuarioID(Long id)
            throws UsuarioNaoEncontradoException;

    void deletarUsuarioId(Long id)
            throws UsuarioNaoEncontradoException;

    void favoritarProduto(Usuario usuario, Produto produto);

    void escolherCategoria(Produto produto, Categoria categoria)
            throws ProdutoCategoriaObrigatoriaException;

    void fazerVenda(Venda venda, Produto produto, int quantidade)
            throws VendaProdutoObrigatorioException,
                   ProdutoQuantidadeInvalidaException,
                   ProdutoEstoqueInsuficienteException,
                   ProdutoIndisponivelException;
    
    Notificacao salvarNotificacao(Notificacao notificacao);

    List<Notificacao> listarNotificacoes();

    Notificacao procurarNotificacaoID(Long id);

    void deletarNotificacaoId(Long id);

    void marcarNotificacaoComoLida(Long id);
}