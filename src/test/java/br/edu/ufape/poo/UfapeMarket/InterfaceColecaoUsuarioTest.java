package br.edu.ufape.poo.UfapeMarket;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.ufape.poo.UfapeMarket.dados.InterfaceColecaoUsuario;
import br.edu.ufape.poo.UfapeMarket.negocio.basica.Usuario;

@SpringBootTest
class InterfaceColecaoUsuarioTest {
	@Autowired
	private InterfaceColecaoUsuario colecaoUsuario;
	@Test
	void cadastrarTest() {
		long qntusuario = colecaoUsuario.count();
		Usuario u = new Usuario("David", "dayvsonjeik@gmail.com", "12345", null, "26/10/2007", "BCC", null);
		
		colecaoUsuario.save(u);
		long qntusuario2 = colecaoUsuario.count();
		
	}

}
