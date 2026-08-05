package br.edu.ufape.poo.UfapeMarket.negocio.cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.poo.UfapeMarket.negocio.basica.Usuario;
import br.edu.ufape.poo.UfapeMarket.dados.InterfaceRepositorioUsuario;

@Service
public class CadastroUsuario implements InterfaceCadastroUsuario {
	@Autowired
	private InterfaceRepositorioUsuario repositorioUsuario;
	
	@Override
	public Usuario salvarUsuario(Usuario novo) {
		return repositorioUsuario.save(novo);
	}
	
	
}
