package br.edu.ufape.poo.UfapeMarket.negocio.cadastro;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

import br.edu.ufape.poo.UfapeMarket.dados.InterfaceColecaoCategoria;
import br.edu.ufape.poo.UfapeMarket.negocio.basica.Categoria;
import br.edu.ufape.poo.UfapeMarket.negocio.excecoes.CategoriaDuplicadaException;

@Service
public class CadastroCategoria implements InterfaceCadastroCategoria {
	@Autowired
	private InterfaceColecaoCategoria colecaoCategoria;
	
	public Categoria salvarCategoria(Categoria entity) throws CategoriaDuplicadaException{
		List<Categoria> categorias = colecaoCategoria.findAll();
		
		for(Categoria c : categorias) {
			if(c.getNome() != null && c.getNome().equalsIgnoreCase(entity.getNome())) {
				throw new CategoriaDuplicadaException(entity.getNome());
			}
		}
		
		
		return colecaoCategoria.save(entity);
		
	}
	
	public List<Categoria> listarCategorias(){
		return colecaoCategoria.findAll();
	}
	
	public Optional<Categoria> encontrarCategoriaId(Long id){
		return colecaoCategoria.findById(id);
	}
	
	public void removerCategoriaId(Long id) {
		colecaoCategoria.deleteById(id);
	}
	
	public boolean verificarExistenciaCategoriaId(Long id) {
		return colecaoCategoria.existsById(id);
	}
}
