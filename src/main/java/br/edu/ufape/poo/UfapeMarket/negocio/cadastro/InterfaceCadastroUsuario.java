package br.edu.ufape.poo.UfapeMarket.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import br.edu.ufape.poo.UfapeMarket.negocio.basica.Usuario;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.UsuarioEmailInvalidoException;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.UsuarioEmailJaCadastradoException;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.UsuarioNomeObrigatorioException;

public interface InterfaceCadastroUsuario {

	Usuario salvarUsuario(Usuario usuario)
	        throws UsuarioNomeObrigatorioException,
            UsuarioEmailInvalidoException,
            UsuarioEmailJaCadastradoException ;

	List<Usuario> listarUsuarios();

	Usuario localizarUsuarioEmail(String emailInstitucional);

	Optional<Usuario> procurarUsuarioID(Long id);

	void deletarUsuarioId(Long id);

}